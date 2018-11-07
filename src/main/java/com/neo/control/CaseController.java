package com.neo.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testng.TestNG;

import com.neo.Entity.PageEntity;
import com.neo.handle.help;
import com.neo.services.docaseservices;
import com.neo.services.pageservices;
import com.neo.servicesimpl.docaseservicesimpl;

@RestController
public class CaseController {
	
	@Resource
	pageservices page;
	
	TestNG testNG = new TestNG();
	
	@RequestMapping(value ="getpagename")
	public JSONArray getpagename(){
		
		 List<String> list=new ArrayList<String>();
		 list=page.getforpagename();
//		 System.out.println(list);
		 List<String> list2=new ArrayList<String>();
		 list2=help.removeDuplicate(list);
//		 System.out.println(list2);
		JSONArray jsonArray = JSONArray.fromObject(list2);
		return jsonArray;
	}
	@RequestMapping(value ="getelename")
	public JSONArray getelename(String pagename){

		 List<String> list=new ArrayList<String>();
		 list=page.getelenameBypagename(pagename);

		JSONArray jsonArray = JSONArray.fromObject(list);
		
		return jsonArray;
	
	}
	@RequestMapping(value ="getdocase")
	public JSONArray getdocase(){
		
		 List<String> list=new ArrayList<String>();
		 list=page.getdocase();
		JSONArray jsonArray = JSONArray.fromObject(list);

		return jsonArray;
	
	}
	@RequestMapping(value ="geteleby")
	public JSONArray geteleby(){
		
		 List<String> list=new ArrayList<String>();
		 list=page.geteleby();
		 List<String> list2=new ArrayList<String>();
		 list2=help.removeDuplicate(list);
		JSONArray jsonArray = JSONArray.fromObject(list2);
		return jsonArray;
	
	}
	@RequestMapping(value ="docase")
	public String docase(String[] pagename0,String[] elename0,String[] doname,String url,String[] sendinfo,String[] eleby,HttpServletRequest request){
		String[] data=request.getParameterValues("Submit");
//        testNG.setTestClasses(new Class[]{docaseservicesimpl.class});
//        testNG.run();

		System.out.println(pagename0.length);
		for (int i = 0; i < data.length; i++) {
			docaseservicesimpl.docase(elename0[i], doname[i], url, sendinfo[i], eleby[i]);
		}

//		for (int i=0; i<pagename0.length; i++){
//			docaseservicesimpl.docase(elename0[i], doname[i], url, sendinfo[i], eleby[i]);
//			if (i==0){
//				System.out.println(pagename0[i]+elename0[i]+doname[i]+url+eleby[i]);
//			}else{
//			System.out.println(pagename0[i]+elename0[i]+doname[i]+eleby[i]);
//			}
//		}
//		for(int i=0; i<pagename0.length; i++) {
//
//			docaseservicesimpl.docase(elename0[i], doname[i], url, sendinfo[i], eleby[i]);
//		}
		
		return "正在执行脚本！请勿操作！";
	}
	@RequestMapping(value="")
	public String test(HttpServletRequest request){
		String ds = request.getParameter("postData");
		JSONArray json=JSONArray.fromObject(ds); //使用net.sf.json.JSONObject对象来解析json
		JSONObject jsonOne;
		Map<String,Object> map=null;
		List<Map<String, Object>> listMap=new ArrayList<Map<String,Object>>(); 
		for(int i=0;i<json.size();i++){
		map = new HashMap<String,Object>();
		         jsonOne = json.getJSONObject(i); 
		         map.put("key", (String) jsonOne.get("Key"));
		         map.put("value", (String) jsonOne.get("Value"));
		         //只保留不为空的 键值对
		         if( (String) jsonOne.get("Value")!=""&&!"".equals( (String) jsonOne.get("Value"))){
		          listMap.add(map); 
		         }
		}
		return ds;
	}
	
}
