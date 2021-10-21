package com.jj.jejuTour.AdminRegister.service;

import com.jj.jejuTour.AdminRegister.dao.AdminRegisterDao;
import com.jj.jejuTour.AdminRegister.vo.AdminRegisterVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jj.jejuTour.util.SHA512;

@Service
public class AdminRegisterService {

    private final Logger logger = LoggerFactory.getLogger(AdminRegisterService.class);

    @Autowired
    private AdminRegisterDao adminRegisterDao;

    //관리자 회원가입
    public int insertAdminRegister(AdminRegisterVo adminRegisterVo){
        logger.debug("====== insertAdminRegister =====");

        SHA512 sha512 = new SHA512();
        String salt = sha512.Salt();
        String sha512Pwd = sha512.SHA512(adminRegisterVo.getAdmin_pwd(), salt);
        adminRegisterVo.setAdmin_pwd(sha512Pwd);
        adminRegisterVo.setSalt(salt);

        return adminRegisterDao.insertAdminRegister(adminRegisterVo);
    }

    //관리자 id 유무체크
    public int selectAdminId(String admin_id){
        logger.debug("===== selectAdminId =====");
        return adminRegisterDao.selectAdminId(admin_id);
    }
}
