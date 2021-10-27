package com.jj.jejuTour.tour.service;

import com.jj.jejuTour.tour.dao.TourDao;
import com.jj.jejuTour.tour.vo.TourVo;
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

    public List<TourVo> getTourInfoList(TourVo tourVo) {
        return tourDao.getTourInfoList(tourVo);
    }
    public int getTourInfoListCount() {
        return tourDao.getTourInfoListCount(); }
    public int insertTourPlaceInfo(TourVo tourVo) {
        return tourDao.insertTourPlaceInfo(tourVo);
    }
}
