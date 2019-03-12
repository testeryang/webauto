package com.neo.servicesimpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.neo.Entity.CaseEnity;
import com.neo.mapper.CaseMapper;
import org.apache.ibatis.annotations.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.Entity.PageEntity;
import com.neo.mapper.PageMapper;
import com.neo.services.pageservices;

@Service
public class pageservicesimpl implements pageservices {


	@Resource
	PageMapper page;
	@Resource
	CaseMapper case1;

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
	@Override
	public List<CaseEnity> getcase(){
		return case1.getcase();
	}

}
