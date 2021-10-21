package com.jj.jejuTour.Tour.service;

import com.jj.jejuTour.Tour.dao.TourDao;
import com.jj.jejuTour.Tour.vo.TourVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {

    private final Logger logger = LoggerFactory.getLogger(TourService.class);

    @Autowired
    private TourDao tourDao;

    public List<TourVo> getTourInfoList() {
        return tourDao.getTourInfo();
    }
}
