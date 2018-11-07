package com.neo.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neo.Entity.PageEntity;
import com.neo.services.ResultService;
import com.neo.services.pageservices;
import com.neo.servicesimpl.docaseservicesimpl;

@Controller
@RequestMapping("page")
public class PageController {
	
	@Autowired
	private pageservices pageservices;
	@Autowired
	private ResultService resultservice;
	
	@RequestMapping("/getpageinfo")
	public String all(){
		List<PageEntity> allinfo=pageservices.getAll();
		System.out.println(allinfo);
		return "web/pagemanage";
		
	}
	@RequestMapping("/setpagemanage")
	public String setpageinfo(HttpServletRequest request){
		String pagename= request.getParameter("pagename");
		String elename= request.getParameter("elename");
		String eleby= request.getParameter("eleby");
		String eletype= request.getParameter("eletype");
		if (pagename!=null&&elename!=null&&eleby!=null&&eletype!=null) {
			pageservices.setpageinfo(pagename, elename, eleby, eletype);
			return "web/addsuccess";
		}else {
			return "403";
		}
	}
			
	
	@RequestMapping("/getpagemanage")
	public String getpageinfo(Model model){
		List<PageEntity> pagelist=pageservices.getAll();
		model.addAttribute("pagelist", pagelist);

		return "web/pageinfo";			
	}
	@RequestMapping("result")
	public String result(){
		return "web/result";
	}
	
    @RequestMapping("/getresult")
    @ResponseBody
    public String echartsView() throws JSONException{	
    	JSONArray arr=new JSONArray();
    	JSONObject json=new JSONObject();
    	
    	for (int i = 1; i <= 12; i++) {
    		String s = String.valueOf(i);
    		if (i<10) {
    			arr.add(resultservice.getsucess("-0"+s+"-", "success").size());
			}else {
				arr.add(resultservice.getsucess("-"+s+"-", "success").size());
			}
			
		}
    	System.out.println(arr);
    	for (int i = 1; i <=12; i++) {
    		String s = String.valueOf(i);
    		if (i<10) {
				arr.add(resultservice.getsucess("-0"+s+"-", "failed").size());
			}else {
				arr.add(resultservice.getsucess("-"+s+"-", "failed").size());
			}
			
		}
    	System.out.println(arr);
    	json.put("data", arr);
    	return arr.toString();
    }
	
}
