package com.jj.jejuTour.Tour.dao;


import com.jj.jejuTour.Tour.vo.TourVo;

import java.util.List;

public interface TourDao {

    List<TourVo> getTourInfo();

    public int insertVisitJejuJson(List<TourVo> tourVo);

}
