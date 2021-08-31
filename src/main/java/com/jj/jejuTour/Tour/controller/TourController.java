package com.jj.jejuTour.Tour.controller;

import com.jj.jejuTour.Tour.service.TourService;
import com.jj.jejuTour.Tour.vo.TourVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TourController {

	@Resource(name = "tourService")
	private TourService tourService;
	
	private final Logger logger = LoggerFactory.getLogger(TourController.class);

	@RequestMapping(value = "/cms/getTourInfoList", method = RequestMethod.GET)
	public String getTourInfoList(Model model) {

		List<TourVo> tourInfoList = tourService.getTourInfoList();
		
		model.addAttribute("tourInfoList", tourInfoList );
		logger.info("ddddddddddddddddd");
		return "tourInfoList";
	}

	@ResponseBody
	@RequestMapping(value = "/cms/postTourInfo", method = RequestMethod.POST)
	public ModelAndView postTourInfoWrite(ModelAndView modelAndView) {

		modelAndView.setViewName("jsonView");
		modelAndView.addObject("resultMessage", "SUCCESS");
		modelAndView.addObject("resultCode", 200);

		return modelAndView;
	}
	
}
