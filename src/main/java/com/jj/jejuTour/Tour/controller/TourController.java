package com.jj.jejuTour.Tour.controller;

import com.jj.jejuTour.Tour.service.TourService;
import com.jj.jejuTour.Tour.vo.TourVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/cms")
@Controller
public class TourController {

	@Resource(name = "tourService")
	private TourService tourService;
	
	private final Logger logger = LoggerFactory.getLogger(TourController.class);

	@RequestMapping(value = "/getTourInfoList", method = RequestMethod.GET)
	public String getTourInfoList(Model model) {

		List<TourVo> tourInfoList = tourService.getTourInfoList();
		
		model.addAttribute("tourInfoList", tourInfoList );
		
		return "tourInfoList";
	}


	
}
