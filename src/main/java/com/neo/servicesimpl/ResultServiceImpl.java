package com.neo.servicesimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neo.Entity.Result;
import com.neo.mapper.ResultMapper;
import com.neo.services.ResultService;


@Service
@Transactional
public class ResultServiceImpl implements ResultService{
	
	@Resource
	ResultMapper resultmapper;
	

	@Override
	public Result getresult() {
		
		return resultmapper.getresultinfo();
	}


	/*@Override
	public List<String> get01success() {
		
		return resultmapper.get01success();
	}


	@Override
	public List<String> get02success() {
		// TODO Auto-generated method stub
		return resultmapper.get02success();
	}


	@Override
	public List<String> get03success() {
		// TODO Auto-generated method stub
		return resultmapper.get03success();
	}


	@Override
	public List<String> get04success() {
		// TODO Auto-generated method stub
		return resultmapper.get04success();
	}


	@Override
	public List<String> get05success() {
		// TODO Auto-generated method stub
		return resultmapper.get05success();
	}


	@Override
	public List<String> get06success() {
		// TODO Auto-generated method stub
		return resultmapper.get06success();
	}


	@Override
	public List<String> get07success() {
		// TODO Auto-generated method stub
		return resultmapper.get07success();
	}


	@Override
	public List<String> get08success() {
		// TODO Auto-generated method stub
		return resultmapper.get08success();
	}


	@Override
	public List<String> get09success() {
		// TODO Auto-generated method stub
		return resultmapper.get09success();
	}


	@Override
	public List<String> get10success() {
		// TODO Auto-generated method stub
		return resultmapper.get10success();
	}


	@Override
	public List<String> get11success() {
		// TODO Auto-generated method stub
		return resultmapper.get11success();
	}
	
	@Override
	public List<String> get12success() {
		// TODO Auto-generated method stub
		return resultmapper.get12success();
	}


 * 错误
 * @see com.eumji.zblog.service.ResultService#get1fail()
 


	@Override
	public List<String> get1fail() {
		// TODO Auto-generated method stub
		return resultmapper.get1fail();
	}


	@Override
	public List<String> get02fail() {
		// TODO Auto-generated method stub
		return resultmapper.get02fail();
	}


	@Override
	public List<String> get03fail() {
		// TODO Auto-generated method stub
		return resultmapper.get03fail();
	}


	@Override
	public List<String> get04fail() {
		// TODO Auto-generated method stub
		return resultmapper.get04fail();
	}


	@Override
	public List<String> get05fail() {
		// TODO Auto-generated method stub
		return resultmapper.get05fail();
	}


	@Override
	public List<String> get06fail() {
		// TODO Auto-generated method stub
		return resultmapper.get06fail();
	}


	@Override
	public List<String> get07fail() {
		// TODO Auto-generated method stub
		return resultmapper.get07fail();
	}


	@Override
	public List<String> get08fail() {
		// TODO Auto-generated method stub
		return resultmapper.get08fail();
	}


	@Override
	public List<String> get09fail() {
		// TODO Auto-generated method stub
		return resultmapper.get09fail();
	}


	@Override
	public List<String> get10fail() {
		// TODO Auto-generated method stub
		return resultmapper.get10fail();
	}


	@Override
	public List<String> get11fail() {
		// TODO Auto-generated method stub
		return resultmapper.get11fail();
	}


	@Override
	public List<String> get12fail() {
		// TODO Auto-generated method stub
		return resultmapper.get12fail();
	}*/


	@Override
	public List<String> getsucess(String no,String passorfail) {

		return resultmapper.getsuccess(no, passorfail);
	}

	

}
