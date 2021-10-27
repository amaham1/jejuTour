package com.jj.jejuTour.tour.controller;

import com.jj.jejuTour.paging.vo.PagingVO;
import com.jj.jejuTour.tour.service.TourService;
import com.jj.jejuTour.tour.vo.TourVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TourController {
	private final Logger logger = LoggerFactory.getLogger(TourController.class);

	@Resource(name = "tourService")
	private TourService tourService;


	@RequestMapping(value = "/cms/tourInfo", method = RequestMethod.GET)
	public String tourInfo(Model model) {
		return "tour/tourInfo";
	}

	@RequestMapping(value = "/cms/tourInfoList", method = RequestMethod.GET)
	public String tourInfoList(Model model) {

		//List<TourVo> tourInfoList = tourService.getTourInfoList();
		//model.addAttribute("tourInfoList", tourInfoList );

		return "tour/tourInfoList";
	}

	@ResponseBody
	@RequestMapping(value = "/ajax/tourInfoList", method = RequestMethod.POST)
	public PagingVO ajaxTourInfoList(TourVo tourVo) {
		int draw = tourVo.getDraw();
		int start = tourVo.getStart();
		int length = tourVo.getLength();

		List<TourVo> tourInfoList = tourService.getTourInfoList(tourVo);
		int tourInfoListCount = tourService.getTourInfoListCount();

		PagingVO pagingVO = new PagingVO();
		pagingVO.setDraw(draw);
		pagingVO.setRecordsTotal(tourInfoListCount);
		pagingVO.setRecordsFiltered(tourInfoListCount);
		pagingVO.setData(tourInfoList);

		return pagingVO;
	}

	@RequestMapping(value = "/cms/tourInfoWrite", method = RequestMethod.GET)
	public String tourInfoWrite(Model model) {

		//List<TourVo> tourInfoList = tourService.getTourInfoList();

		model.addAttribute("tourInfoList", "1" );

		return "tour/tourInfoWrite";
	}

	@ResponseBody
	@RequestMapping(value = "/cms/postTourInfo", method = RequestMethod.POST, produces = "application/json")
	public ModelAndView postTourInfoWrite(TourVo tourVo, ModelAndView modelAndView) {

		modelAndView.setViewName("jsonView");
		modelAndView.addObject("resultMessage", "SUCCESS");
		modelAndView.addObject("resultCode", 200);
		logger.info("postTourInfo");
		logger.info(tourVo.getAlltag());
		logger.info(tourVo.getContentscd());
		logger.info(tourVo.getTitle());
		logger.info(tourVo.getRegion1cd());
		logger.info(tourVo.getAddress());
		logger.info(tourVo.getIntroduction());
		logger.info(tourVo.getLatitude());
		logger.info(tourVo.getLongitude());
		logger.info(tourVo.getPhoneno());
		logger.info(tourVo.getImgpath());
		logger.info(tourVo.getThumbnailpath());

		return modelAndView;
	}
	
}
