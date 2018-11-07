package com.neo.services;

import java.util.List;

import com.neo.Entity.UserEntity;

public interface userservices {
	UserEntity findusername(String username);
	void changepassword(String password,String username);
	List<UserEntity> getAll();
	
}
