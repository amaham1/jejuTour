package com.jj.jejuTour.scheduler;

import com.jj.jejuTour.Tour.service.TourService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class SchedulerTestController {
    private final Logger logger = LoggerFactory.getLogger(SchedulerTestController.class);

    @Resource(name = "scheduler")
    private Scheduler scheduler;

    //Json Insert 스케줄러
    @RequestMapping(value = "/cms/sheduletest1", method = RequestMethod.GET)
    public ModelAndView schedulerTest1(ModelAndView modelAndView) {
        modelAndView.setViewName("jsonView");
        if ( scheduler.tourPlaceInsertJsonScheduler() != 0 ) {
            modelAndView.addObject("resultMessage", "GoodScheduler");
            modelAndView.addObject("resultCode", 200);
        } else {
            modelAndView.addObject("resultMessage", "WorstScheduler");
            modelAndView.addObject("resultCode", 500);
        }

        return modelAndView;
    }
}
