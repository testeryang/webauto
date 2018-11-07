package com.neo.shiro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.neo.Entity.UserEntity;
import com.neo.services.userservices;


public class MyShiroRealm extends AuthorizingRealm {

	@Resource
	private userservices userservices;
    /**
     * 授权用户权限
     */
	
/*    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        //获取用户
        UserEntity user = (UserEntity)SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
        //获取用户角色
        Set<String> roleSet = new HashSet<String>();
        roleSet.add("100002");
        info.setRoles(roleSet);

        //获取用户权限
        Set<String> permissionSet = new HashSet<String>();
        permissionSet.add("权限添加");
        permissionSet.add("权限删除");
        info.setStringPermissions(permissionSet);


        return info;
    }*/

    /**
     * 验证用户身份
     */
    /*@Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        
        String username = token.getUsername();
        System.out.println(token.toString());
        String password = String.valueOf(token.getPassword());
        System.out.println(password);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        //密码进行加密处理  明文为  password+name
        String paw = password+username;
//        String pawDES = MyDES.encryptBasedDes(paw);
        map.put("password", password);

        UserEntity user = new UserEntity();
//        user.setId(1);
        user.setUserName(username);
        user.setPassWord(password);

 
        return new SimpleAuthenticationInfo(user, password, getName());
    }*/
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserEntity user= (UserEntity) SecurityUtils.getSubject().getPrincipal();//User{id=1, username='admin', password='3ef7164d1f6167cb9f2658c07d3c2f0a', enable=1}
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userid",user.getId());
//        List<Resources> resourcesList = userservices.findusername(map.);
        // 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        /*for(Resources resources: resourcesList){
            info.addStringPermission(resources.getResurl());
        }*/
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户的输入的账号.
        String username = (String)token.getPrincipal();
        System.out.println("用户输入账号为"+username);
        System.out.println(userservices.findusername(username));
        UserEntity user = userservices.findusername(username);
        if(user==null) throw new UnknownAccountException();
        
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user, //用户
                user.getPassWord(), //密码
                ByteSource.Util.bytes(username),
                getName()  //realm name
        );
        // 当验证都通过后，把用户信息放在session里
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("userSession", user);
        session.setAttribute("userSessionId", user.getId());
        System.out.println(username+"@@@@@"+user.getPassWord());
        return authenticationInfo;
    }

}