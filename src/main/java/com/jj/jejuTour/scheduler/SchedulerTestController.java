package com.jj.jejuTour.scheduler;

import com.jj.jejuTour.util.NormalUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class SchedulerTestController {
    private final Logger logger = LoggerFactory.getLogger(SchedulerTestController.class);

    @Resource(name = "normalUtil")
    private NormalUtil normalUtil;

    //Json Insert 스케줄러
    @RequestMapping(value = "/cms/sheduletest1", method = RequestMethod.GET)
    public ModelAndView schedulerTest1(ModelAndView modelAndView) {
        logger.debug("===== schedulerTest1 RAN =====");
        modelAndView.setViewName("jsonView");
        if ( normalUtil.getVisitJejuJson() != 0 ) {
            modelAndView.addObject("resultMessage", "GoodScheduler");
            modelAndView.addObject("resultCode", 200);
        } else {
            modelAndView.addObject("resultMessage", "WorstScheduler");
            modelAndView.addObject("resultCode", 500);
        }

        return modelAndView;
    }
}
