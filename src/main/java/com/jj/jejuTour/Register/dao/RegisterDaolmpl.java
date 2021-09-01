package com.jj.jejuTour.Register.dao;

import com.jj.jejuTour.Register.vo.RegisterVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.lang.reflect.Field;

@Repository
public class RegisterDaolmpl implements RegisterDao {

    @Inject
    private SqlSession sqlSession;

    public int insertAdminRegister(RegisterVo registerVo) {
        try{
            Object obj= registerVo;
            for (Field field : obj.getClass().getDeclaredFields()){
                field.setAccessible(true);
                Object value=field.get(obj);
                System.out.println(field.getName()+","+value);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sqlSession.insert("RegisterMapper.insertAdminRegister", registerVo);
    }
}
