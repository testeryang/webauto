package com.neo.mapper;

import com.neo.Entity.CaseEnity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CaseMapper {

    @Select("SELECT * FROM `case`")
    List<CaseEnity> getcase();
}
