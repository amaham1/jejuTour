package com.jj.jejuTour.tour.dao;


import com.jj.jejuTour.tour.vo.TourVo;

import java.util.List;

public interface TourDao {

    List<TourVo> getTourInfoList(TourVo tourVo);

    int insertVisitJejuJson(List<TourVo> tourVo);

    int getTourInfoListCount();
}
