package com.neo.Entity;

import com.neo.enums.UserSexEnum;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	public int id;
    @Size(max = 10,min = 1,message = "请输入1-10以内的姓名")
	public String username;
	public String password;
	public UserSexEnum user_sex;
	public String nickname;

	public UserEntity() {
		super();
	}

	public UserEntity(String userName, String passWord, UserSexEnum user_sex) {
		super();
		this.password = passWord;
		this.username = userName;
		this.user_sex = user_sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassWord() {
		return password;
	}

	public void setPassWord(String password) {
		this.password = password;
	}

	public UserSexEnum getUserSex() {
		return user_sex;
	}

	public void setUserSex(UserSexEnum user_sex) {
		this.user_sex = user_sex;
	}

	public String getNickName() {
		return nickname;
	}

	public void setNickName(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "userName " + this.username + ", password " + this.password + "sex " + user_sex.name()+"nickname"+this.nickname;
		
	}

}