package com.jj.jejuTour.login.controller;

import com.jj.jejuTour.login.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource(name ="LoginService")
    private LoginService loginService;

    @RequestMapping(value = "/loginPage", method = {RequestMethod.GET, RequestMethod.POST})
    public String LoginPage() {
        return "login/loginPage";
    }
}
