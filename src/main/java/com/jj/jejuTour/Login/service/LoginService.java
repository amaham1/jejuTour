package com.jj.jejuTour.Login.service;

import com.jj.jejuTour.Login.dao.LoginDao;
import com.jj.jejuTour.Login.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private LoginDao loginDao;

    public int getAdminLogin(LoginVo loginVo) {
        return loginDao.getAdminLogin(loginVo);
    }
}
