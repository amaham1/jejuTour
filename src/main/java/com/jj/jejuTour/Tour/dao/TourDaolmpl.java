package com.jj.jejuTour.Tour.dao;

import com.jj.jejuTour.Tour.vo.TourVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class TourDaolmpl implements TourDao{

    @Inject
    private SqlSession sqlSession;

    public TourVo getTourInfo() {
        return sqlSession.selectOne("TourInfo.getTourInfo");

    }
}
