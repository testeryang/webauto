package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neo.Entity.PageEntity;

@Mapper
public interface PageMapper {
	
	@Select("SELECT * FROM pagemanage")
	List<PageEntity> allpage();
	
	@Insert("INSERT INTO pagemanage (pagename, elename,eleby,eletype) VALUES (#{pagename}, #{elename},#{eleby},#{eletype})")
	void setpageinfo(@Param("pagename")String pagename,@Param("elename")String elename,@Param("eleby")String eleby,@Param("eletype")String eletype);
	
	@Select("SELECT pagename FROM pagemanage ")
	List<String> getforpagename();
	
	@Select("SELECT elename FROM pagemanage where pagename=#{pagename}")
	List<String> getelenameBypagename(@Param("pagename")String pagename);
	
	@Select("SELECT docase FROM do" )
	List<String> getdocase();
	
	@Select("SELECT eleby FROM pagemanage" )
	List<String> geteleby();

	@Insert("INSERT INTO case (pagename, elename,doname,sendinfo) VALUES (#{pagename}, #{elename},#{doname},#{sendinfo})")
	void savacase(@Param("pagename")String pagename,@Param("elename")String elename,@Param("doname")String doname,@Param("sendinfo")String sendinfo);

}
