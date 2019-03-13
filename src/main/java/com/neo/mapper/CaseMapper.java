package com.neo.mapper;

import com.neo.Entity.CaseEnity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CaseMapper {
    @Select("SELECT * FROM `case`")
    List<CaseEnity> getcase();
    @Delete("DELETE FROM `case` WHERE id=#{id}")
    void deletecase(@Param("id")int id);
}
