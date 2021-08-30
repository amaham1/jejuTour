package com.jj.jejuTour.Tour.service;

import com.jj.jejuTour.Tour.controller.HomeController;
import com.jj.jejuTour.Tour.dao.TourDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TourService {

    private final Logger logger = LoggerFactory.getLogger(TourService.class);

    @Autowired
    private TourDao tourDao;


    public void getTourInfoList() {

        logger.info("getTourInfoList" + tourDao.getTourInfo().getTour_place_name());

    }
}
