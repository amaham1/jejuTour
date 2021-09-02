package com.jj.jejuTour.Login.service;

import com.jj.jejuTour.Login.dao.LoginDao;
import com.jj.jejuTour.Login.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import util.SHA512;

@Service
public class LoginService implements UserDetailsService {
    private final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private LoginDao loginDao;

    public int getAdminLogin(LoginVo loginVo) {
        SHA512 sha512 = new SHA512();
        String salt = loginDao.getSalt(loginVo.getId());
        String sha512Pwd = sha512.SHA512(loginVo.getPwd(), salt);
        loginVo.setPwd(sha512Pwd);

        return loginDao.getAdminLogin(loginVo);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return null;
    }
}
