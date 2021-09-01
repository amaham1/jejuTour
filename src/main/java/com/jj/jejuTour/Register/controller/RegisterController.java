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

import javax.annotation.Resource;
import java.lang.reflect.Field;

@Controller
public class RegisterController {
    private final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Resource(name = "registerService")
    private RegisterService registerService;

    @RequestMapping(value = "/cms/adminRegisterPage", method = RequestMethod.GET)
    public String getLoginRegisterPage() {
        return "register/adminRegister";
    }

    @ResponseBody
    @RequestMapping(value = "/ajax/adminRegister", method = RequestMethod.POST)
    public ModelAndView postLoginRegister(ModelAndView modelAndView, RegisterVo registerVo) {

        int c = registerService.insertAdminRegister(registerVo);
        logger.info("int   "+c);

        modelAndView.setViewName("jsonView");
        modelAndView.addObject("resultCode", 200);
        modelAndView.addObject("resultMessage", "Success");

        return modelAndView;
    }
}
