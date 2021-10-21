package com.jj.jejuTour.AdminRegister.controller;

import com.jj.jejuTour.AdminRegister.service.AdminRegisterService;
import com.jj.jejuTour.AdminRegister.vo.AdminRegisterVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class AdminRegisterController {
    private final Logger logger = LoggerFactory.getLogger(AdminRegisterController.class);

    @Resource(name = "adminRegisterService")
    private AdminRegisterService adminRegisterService;

    //관리자 회원가입페이지
    @RequestMapping(value = "/cms/adminRegisterPage", method = RequestMethod.GET)
    public String adminRegisterPage() {
        logger.debug("====== /cms/adminRegisterPage =====");
        return "adminregister/adminRegister";
    }

    //관리자 회원가입
    @ResponseBody
    @RequestMapping(value = "/ajax/adminRegister", method = RequestMethod.POST)
    public ModelAndView postAdminRegister(ModelAndView modelAndView, AdminRegisterVo adminRegisterVo) {
        logger.debug("====== /ajax/adminRegister =====");
        modelAndView.setViewName("jsonView");

        int var = adminRegisterService.insertAdminRegister(adminRegisterVo);
        if (var > 0) {
            modelAndView.addObject("resultCode", 200);
            modelAndView.addObject("resultMessage", "Success");
        } else {
            modelAndView.addObject("resultCode", 500);
            modelAndView.addObject("resultMessage", "Fail");
        }

        return modelAndView;
    }

    //관리자 id 유무체크
    @RequestMapping(value = "/ajax/adminIdDupleCheck", method = RequestMethod.POST)
    public ModelAndView postAdminIdDupleCheck(ModelAndView modelAndView, String admin_id) {
        logger.debug("====== /ajax/adminIdDupleCheck =====");

        int var = adminRegisterService.selectAdminId(admin_id);
        if ( var == 0) {
            modelAndView.addObject("result", false);
        } else modelAndView.addObject("result", true);

        modelAndView.addObject("resultCode", 200);
        modelAndView.addObject("resultMessage","Success");
        modelAndView.setViewName("jsonView");
        return modelAndView;
    }

}
