package com.neo.servicesimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neo.Entity.PageEntity;
import com.neo.mapper.PageMapper;
import com.neo.services.pageservices;

@Service
public class pageservicesimpl implements pageservices {

	@Resource
	PageMapper page;

	@Override
	public List<PageEntity> getAll() {
		// TODO Auto-generated method stub
		return page.allpage();
	}

	@Override
	public void setpageinfo(String pagename, String elename,
			String eleby, String eletype) {
		
		page.setpageinfo(pagename, elename, eleby, eletype);
	
	}

	@Override
	public List<String> getforpagename() {
		
		return page.getforpagename();
	}

	@Override
	public List<String> getelenameBypagename(String pagename) {
		// TODO Auto-generated method stub
		return page.getelenameBypagename(pagename);
	}

	@Override
	public List<String> getdocase() {
		// TODO Auto-generated method stub
		return page.getdocase();
	}

	@Override
	public List<String> geteleby() {
		// TODO Auto-generated method stub
		return page.geteleby();
	}
}
