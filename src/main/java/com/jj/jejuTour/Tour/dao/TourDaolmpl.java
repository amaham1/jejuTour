package com.jj.jejuTour.Tour.dao;

import com.jj.jejuTour.Tour.vo.TourVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class TourDaolmpl implements TourDao{

    @Inject
    private SqlSession sqlSession;

    public List<TourVo> getTourInfo() {
        return sqlSession.selectList("TourInfo.getTourInfoList");

    }
}
