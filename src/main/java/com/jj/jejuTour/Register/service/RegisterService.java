package com.jj.jejuTour.Register.service;

import com.jj.jejuTour.Register.dao.RegisterDao;
import com.jj.jejuTour.Register.vo.RegisterVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private final Logger logger = LoggerFactory.getLogger(RegisterService.class);

    @Autowired
    private RegisterDao registerDao;
    public int insertAdminRegister(RegisterVo registerVo){
        return registerDao.insertAdminRegister(registerVo);
    }
}
