package com.jj.jejuTour.tour.dao;

import com.jj.jejuTour.tour.vo.TourVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class TourDaolmpl implements TourDao{

    @Inject
    private SqlSession sqlSession;

    public List<TourVo> getTourInfoList(TourVo tourVo) {
        return sqlSession.selectList("TourInfo.getTourInfoList", tourVo);
    }
    public int getTourInfoListCount(){
        return sqlSession.selectOne("TourInfo.getTourInfoListCount");
    }

    public int insertVisitJejuJson(List<TourVo> tourVo) {
        return sqlSession.insert("TourInfo.insertVisitJejuJson", tourVo);
    }
}
