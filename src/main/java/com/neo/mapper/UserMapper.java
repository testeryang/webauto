package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neo.Entity.UserEntity;
import com.neo.enums.UserSexEnum;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM users")
/*	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})*/
	List<UserEntity> getAll();
	
	@Select("SELECT * FROM users WHERE id = #{id}")
/*	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})*/
	UserEntity getOne(int id);

	@Select("select * from users where username=#{username}")
	UserEntity getUserByName(String username);
	
	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(UserEntity user);

	@Update("UPDATE users SET username=#{username},nick_name=#{nickname} WHERE id =#{id}")
	void update(UserEntity user);

	@Update("UPDATE users SET password=#{password} WHERE username =#{username}")
	void changepassword(@Param("password")String password,@Param("username")String username);
	
	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(int id);
	
	@Delete("DELETE FROM users WHERE username =#{username}")
	void deletebyusername(String username);
}