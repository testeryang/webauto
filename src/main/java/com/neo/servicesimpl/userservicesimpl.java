package com.neo.servicesimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neo.Entity.UserEntity;
import com.neo.mapper.UserMapper;
import com.neo.services.userservices;

@Service
public class userservicesimpl implements userservices {
	@Resource
	UserMapper user;
	
	public UserEntity findusername(String username) {
		return user.getUserByName(username);
	}

	@Override
	public void changepassword(String password, String username) {
		user.changepassword(password, username);
	}

	@Override
	public List<UserEntity> getAll() {
		// TODO Auto-generated method stub
		return user.getAll();
	}
	
	
}
