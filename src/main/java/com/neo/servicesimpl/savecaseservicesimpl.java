package com.neo.servicesimpl;

import com.neo.mapper.PageMapper;
import com.neo.services.savecaseservices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class savecaseservicesimpl implements savecaseservices {

    @Resource
    PageMapper pageMapper;

    @Override
    public void savecase(String pagename, String elename, String doname, String sendinfo) {
        pageMapper.savacase(pagename,elename,doname,sendinfo);
    }
}
