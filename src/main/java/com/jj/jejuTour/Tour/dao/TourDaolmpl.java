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

    public List<TourVo> getTourInfoList() {
        return sqlSession.selectList("TourInfo.getTourInfoList");
    }

    public int insertVisitJejuJson(List<TourVo> tourVo) {
        return sqlSession.insert("TourInfo.insertVisitJejuJson", tourVo);
    }
}
