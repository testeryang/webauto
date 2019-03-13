package com.neo.servicesimpl;

import com.neo.mapper.CaseMapper;
import com.neo.mapper.PageMapper;
import com.neo.services.deletecaseservices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class deletecaseservicesimpl implements deletecaseservices {
    @Resource
    CaseMapper case1;

    @Override
    public void deletecaes(int id) {
        case1.deletecase(id);
    }
}
