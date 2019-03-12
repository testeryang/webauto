package com.neo.services;

import java.util.List;
import java.util.Map;

import com.neo.Entity.CaseEnity;
import com.neo.Entity.PageEntity;

public interface pageservices {
	List<PageEntity> getAll();
	void setpageinfo(String pagename,String elename,String eleby,String eletype);
	List<String> getforpagename();
	List<String> getelenameBypagename(String pagename);
	List<String> getdocase();
	List<String> geteleby();
	List<CaseEnity> getcase();
 }

