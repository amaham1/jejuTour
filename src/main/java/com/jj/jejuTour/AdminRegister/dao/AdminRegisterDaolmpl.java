package com.jj.jejuTour.AdminRegister.dao;

import com.jj.jejuTour.AdminRegister.vo.AdminRegisterVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.lang.reflect.Field;

@Repository
public class AdminRegisterDaolmpl implements AdminRegisterDao {

    @Inject
    private SqlSession sqlSession;

    //관리자 회원가입
    public int insertAdminRegister(AdminRegisterVo adminRegisterVo) {
        try{
            Object obj= adminRegisterVo;
            for (Field field : obj.getClass().getDeclaredFields()){
                field.setAccessible(true);
                Object value=field.get(obj);
                System.out.println(field.getName()+","+value);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sqlSession.insert("AdminRegisterMapper.insertAdminRegister", adminRegisterVo);
    }

    //관리자 id 유무체크
    public int selectAdminId(String admin_id) {
        return sqlSession.selectOne("AdminRegisterMapper.selectAdminId", admin_id);
    }
}
