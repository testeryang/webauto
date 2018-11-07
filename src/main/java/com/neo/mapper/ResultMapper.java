package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.neo.Entity.Result;



@Mapper
public interface ResultMapper {
	
	@Select("select * from result limit 1")
	Result getresultinfo();
	
	@Select("select * from result where resultinfo=#{success} and date_format(date,'-%m-')=#{no};")
	List<String> getsuccess(@Param("no")String no, @Param("success")String success);
	
/*	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-01-';")
	List<String> get01success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-02-';")
	List<String> get02success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-03-';")
	List<String> get03success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-04-';")
	List<String> get04success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-05-';")
	List<String> get05success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-06-';")
	List<String> get06success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-07-';")
	List<String> get07success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-08-';")
	List<String> get08success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-09-';")
	List<String> get09success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-10-';")
	List<String> get10success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-11-';")
	List<String> get11success();
	
	@Select("select * from result where resultinfo='pass' and date_format(date,'-%m-')='-12-';")
	List<String> get12success();
	 
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-01-';")
	List<String> get1fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-02-';")
	List<String> get02fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-03-';")
	List<String> get03fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-04-';")
	List<String> get04fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-05-';")
	List<String> get05fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-06-';")
	List<String> get06fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-07-';")
	List<String> get07fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-08-';")
	List<String> get08fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-09-';")
	List<String> get09fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-10-';")
	List<String> get10fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-11-';")
	List<String> get11fail();
	
	@Select("select * from result where resultinfo='failed' and date_format(date,'-%m-')='-12-';")
	List<String> get12fail();*/
}
