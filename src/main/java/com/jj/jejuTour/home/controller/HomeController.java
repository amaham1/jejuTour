package com.jj.jejuTour.home.controller;

import com.jj.jejuTour.Login.controller.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/cms/home")
    public String getHome() {
        return "decorators/mainLayout";
    }
}
