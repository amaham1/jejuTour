package com.jj.jejuTour.Register.controller;

import com.jj.jejuTour.Register.service.RegisterService;
import com.jj.jejuTour.Register.vo.RegisterVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import util.SHA512;

import javax.annotation.Resource;
import java.lang.reflect.Field;

@Controller
public class RegisterController {
    private final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Resource(name = "registerService")
    private RegisterService registerService;

    //관리자 회원가입페이지
    @RequestMapping(value = "/cms/adminRegisterPage", method = RequestMethod.GET)
    public String getLoginRegisterPage() {
        logger.debug("====== /cms/adminRegisterPage =====");
        return "register/adminRegister";
    }

    //관리자 회원가입
    @ResponseBody
    @RequestMapping(value = "/ajax/adminRegister", method = RequestMethod.POST)
    public ModelAndView postLoginRegister(ModelAndView modelAndView, RegisterVo registerVo) {
        logger.debug("====== /ajax/adminRegister =====");
        modelAndView.setViewName("jsonView");

        SHA512 sha512 = new SHA512();
        String salt = sha512.Salt();
        String sha512Pwd = sha512.SHA512(registerVo.getAdmin_pwd(), salt);
        registerVo.setAdmin_pwd(sha512Pwd);

        int var = registerService.insertAdminRegister(registerVo);
        if (var > 0) {
            modelAndView.addObject("resultCode", 200);
            modelAndView.addObject("resultMessage", "Success");
        } else {
            modelAndView.addObject("resultCode", 500);
            modelAndView.addObject("resultMessage", "Fail");
        }

        return modelAndView;
    }
}
