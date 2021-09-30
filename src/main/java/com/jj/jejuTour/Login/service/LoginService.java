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
        ApplicationContext ctx = new GenericXmlApplicationContext("classpath:*/webapp/WEB-INF/spring/root-context.xml");
        UserDetailsVo userDetails = new UserDetailsVo();
        BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();

        LoginVo loginVo = loginDao.getAdminLogin(id);
        logger.debug("getId   " + loginVo.getId());
        logger.debug("getPwd   " + loginVo.getPwd());

        String pwd = loginVo.getPwd();
        String encodedPw1 = pwEncoder.encode(pwd);
        String encodedPw2 = pwEncoder.encode(pwd);

        System.out.println("원본 : " + pwd);
        System.out.println("첫번 째 인코딩 : " + encodedPw1);
        System.out.println("두번 째 인코딩 : " + encodedPw2);

        System.out.println("matches 메소드 사용 비교 : " + pwEncoder.matches(pwd, encodedPw1));
        System.out.println("matches 메소드 사용 비교2 : " + pwEncoder.matches(pwd, encodedPw2));

        /*SHA512 sha512 = new SHA512();
        String salt = loginDao.getSalt(loginVo.getId());
        String sha512Pwd = sha512.SHA512(loginVo.getPwd(), salt);
        loginVo.setPwd(sha512Pwd);*/
// 최종적으로 리턴해야할 객체


        userDetails.setUsername(loginVo.getId());
        userDetails.setPassword(encodedPw2);

        System.out.println("gogo111 " + loginVo.getId());
        System.out.println("gogo2222 " + loginVo.getPwd());
        System.out.println("gogo1 " + userDetails.getUsername());
        System.out.println("gogo2 " + userDetails.getPassword());
        return userDetails;
    }
    /*
    public int getAdminLogin(LoginVo loginVo) {
        SHA512 sha512 = new SHA512();
        String salt = loginDao.getSalt(loginVo.getId());
        String sha512Pwd = sha512.SHA512(loginVo.getPwd(), salt);
        loginVo.setPwd(sha512Pwd);

        return loginDao.getAdminLogin(loginVo);
    }*/

}
