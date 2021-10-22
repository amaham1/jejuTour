package com.jj.jejuTour.login.dao;

import com.jj.jejuTour.login.vo.LoginVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class Loginlmpl implements LoginDao{

    @Inject
    private SqlSession sqlSession;

    public LoginVo getAdminLogin(String id) {
        return sqlSession.selectOne("LoginMapper.getAdminLogin" ,id);
    };

    public String getSalt(String id) {
        return sqlSession.selectOne("LoginMapper.getSalt", id);
    };
}
