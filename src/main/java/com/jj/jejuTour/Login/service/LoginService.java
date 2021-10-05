package com.jj.jejuTour.Login.service;

import com.jj.jejuTour.Login.dao.LoginDao;
import com.jj.jejuTour.Login.vo.LoginVo;
import com.jj.jejuTour.Login.vo.UserDetailsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import util.SHA512;

@Service("LoginService")
public class LoginService implements UserDetailsService {
    private final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private LoginDao loginDao;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        UserDetailsVo userDetails = new UserDetailsVo();
        BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();

        LoginVo loginVo = loginDao.getAdminLogin(id);
        if(loginVo == null) {
            throw new UsernameNotFoundException("ㅇ이이이이이");
        }
        String pwd = loginVo.getPwd();
        String encodedPw = pwEncoder.encode(pwd);

        userDetails.setUsername(loginVo.getId());
        userDetails.setPassword(encodedPw);

        return userDetails;
    }

}
