package com.jj.jejuTour.Login.dao;

import com.jj.jejuTour.Login.vo.LoginVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class Loginlmpl implements LoginDao{

    @Inject
    private SqlSession sqlSession;

    public int getAdminLogin(LoginVo loginVo) {
        return sqlSession.selectOne("LoginMapper.getAdminLogin" ,loginVo);
    };

    public String getSalt(String id) {
        return sqlSession.selectOne("LoginMapper.getSalt", id);
    };
}
