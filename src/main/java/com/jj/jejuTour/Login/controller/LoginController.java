package com.jj.jejuTour.Login.controller;

import com.jj.jejuTour.Tour.controller.TourController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login")
    public ModelAndView postLogin() {


    }
}
