package com.neo.control;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.neo.Entity.CaseEnity;
import com.neo.services.pageservices;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.util.StringUtils;

import com.neo.Entity.UserEntity;
import com.neo.mapper.UserMapper;
import com.neo.services.userservices;

@Controller
public class UserController {

	@Autowired
	private UserMapper usermapper;
	@Resource
	pageservices page;
	@Autowired
	public userservices userservices;	
	
    @RequestMapping("/")
    public String index() {
        return "index";
    }
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users = usermapper.getAll();
		return users;
	}

	@RequestMapping("/getUser")
	public UserEntity getUser(int id) {
		UserEntity user = usermapper.getOne(id);
		return user;
	}

	@RequestMapping("/add")
	public void save(UserEntity user) {
		usermapper.insert(user);
	}

	@RequestMapping(value = "changepassword")
	public String update(HttpSession session,String pwd3,Model model) {
/*		UserEntity user = userservices.findusername(session.getAttribute("username").toString());
		System.out.println(user);*/
		System.out.println(pwd3);
		userservices.changepassword(pwd3, session.getAttribute("username").toString());
		model.addAttribute("msg", "更新用户信息成功");
		return "web/changepassword";
	}

	@RequestMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		usermapper.delete(id);
	}

	// @RequestMapping("/login")
	public String login(HttpServletRequest request, Map<String, Object> map)
			throws Exception {
		System.out.println("HomeController.login()");
		String username = null;
		String password = null;
		/*
		 * UserEntity user=null; if (username!=null) {
		 * user=usermapper.getUserByName(username); user.getPassWord(); }
		 */
		UsernamePasswordToken token = new UsernamePasswordToken(username,
				password);
		// 登录失败从request中获取shiro处理的异常信息。
		// shiroLoginFailure:就是shiro异常类的全类名.

		String exception = (String) request.getAttribute("shiroLoginFailure");
		System.out.println("exception=" + exception);
		String msg = "";
		if (exception != null) {
			if (UnknownAccountException.class.getName().equals(exception)) {
				System.out.println("UnknownAccountException -- > 账号不存在：");
				msg = "UnknownAccountException -- > 账号不存在：";
			} else if (IncorrectCredentialsException.class.getName().equals(
					exception)) {
				System.out.println("IncorrectCredentialsException -- > 密码不正确：");
				msg = "IncorrectCredentialsException -- > 密码不正确：";
			} else if ("kaptchaValidateFailed".equals(exception)) {
				System.out.println("kaptchaValidateFailed -- > 验证码错误");
				msg = "kaptchaValidateFailed -- > 验证码错误";
			} else {
				msg = "else >> " + exception;
				System.out.println("else -- >" + exception);
			}
		}
		// username=request.getAttribute("username").toString();
		// System.out.println(username);
		// password=request.getAttribute("password").toString();
		// System.out.println(password);
		map.put("msg", msg);
		// System.out.println(map);
		// 此方法不处理登录成功,由shiro进行处理
		return "userInfo";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session,String username, String password, Model model) {
		System.out.println(username);
		System.out.println(password);

		// UsernamePasswordToken token = new UsernamePasswordToken(username,
		// password,false);
		// SecurityUtils.getSubject().login(token);
		UserEntity user=null;
		user = userservices.findusername(username);
		System.out.println(user);
		if (username=="" || password==""||username.contains(" ")||password.contains(" ")) {
			System.out.println("账号密码为空");
			model.addAttribute("msg", "账号或密码不能为空");
			return "index";
		}else if (user==null) {
			System.out.println("没有此账户");
			model.addAttribute("msg", "没有此账户");
			return "index";
		}else if (user.getPassWord().equals(password)) {
			System.out.println("前台密码" + password + "后台密码" + user.getPassWord());
			session.setAttribute("username", user.getUserName());
			session.setAttribute("nickname", "您好："+user.getNickName());
			System.out.println(user.getNickName());
			return "web/index";
		} else {
			model.addAttribute("msg", "登录出错");
			System.out.println("登录出错");
			return "index";
		}
	}

	// @RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpServletRequest request, String username,
			String password, Model model) {

		/*
		 * if (StringUtils.isEmpty(user.getUserName()) ||
		 * StringUtils.isEmpty(user.getPassWord())) {
		 * request.setAttribute("msg", "用户名或密码不能为空！"); return "index"; }
		 */
		System.out.println(username + "####" + password);
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			request.setAttribute("msg", "用户名或密码不能为空！");
			return "index";
		}
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username,
				password);
		try {
			subject.login(token);
			return "loginsuccess";
		} catch (LockedAccountException lae) {
			token.clear();
			request.setAttribute("msg", "用户已经被锁定不能登录，请与管理员联系！");
			return "loginfail";
		} catch (AuthenticationException e) {
			token.clear();
			request.setAttribute("msg", "用户或密码不正确！");
			return "loginfail";
		}
	}

	@RequestMapping(value = "/getuserninfo")
	public String getuserinfo() {
		// System.out.println(username);
		// UsernamePasswordToken token = new UsernamePasswordToken(username,
		// password,false);
		// SecurityUtils.getSubject().login(token);

		return "userInfo";
	}
	
	@RequestMapping(value = "/head")
	public String gethead() {
		return "web/head";
	}
	@RequestMapping(value = "/left")
	public String getleft() {
		return "web/left";
	}
	@RequestMapping(value = "/main")
	public String getmain() {
		return "web/main";
	}
	@RequestMapping(value = "/tab")
	public String gettab(Model model) {
        List<UserEntity> userlist= userservices.getAll();
//       for (UserEntity user : userlist) {
//        	System.out.println(user);
//        	model.addAttribute("username",user.username);
//        	model.addAttribute("password",user.password);
//        	model.addAttribute("user_sex",user.user_sex);
//        	model.addAttribute("nickname",user.nickname);
//        	}

        model.addAttribute("user", userlist);
        model.addAttribute("userlength", "共找到"+userlist.size()+"条年度预算记录，当前显示从第1条至第10条");
        System.out.println(userlist);
		return "web/tab";
	}
	@RequestMapping(value = "/p3")
	public String getcase(Model model){
		List<CaseEnity> caselist = page.getcase();
//		JSONArray arr=JSONArray.fromObject(caselist);
		model.addAttribute("caseinfo",caselist);
		System.out.println(caselist);
		return "web/p3";
	}
	@RequestMapping(value = "/p2")
	public String getp2() {
		return "web/p2";
	}
	@RequestMapping(value = "/p1")
	public String getp1() {
		return "web/p1";
	}
	@RequestMapping(value = "/head2")
	public String gethead2() {
		return "web/head2";
	}
	@RequestMapping(value = "/getchangepassword")
	public String getchangepassword() {
		return "web/changepassword";
	}
	@RequestMapping(value = "/pagemanage")
	public String getpagemanage() {
		return "web/pagemanage";
	}
	@RequestMapping(value = "/setpagemanage")
	public String setpagemanage() {
		
		
		return "web/addsuccess";
	}

	@RequestMapping("/403")
	public String unauthorizedRole() {
		System.out.println("------没有权限-------");
		return "403";
	}
	@RequestMapping("/logout")
	public String getlogout(HttpSession session) {
		session.invalidate();
		return "index";
	}

}