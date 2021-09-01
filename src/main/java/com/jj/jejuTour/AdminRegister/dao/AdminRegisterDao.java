package com.jj.jejuTour.AdminRegister.dao;

import com.jj.jejuTour.AdminRegister.vo.AdminRegisterVo;

public interface AdminRegisterDao {
    //관리자 회원가입
    int insertAdminRegister(AdminRegisterVo adminRegisterVo);

    //관리자 id 유무체크
    int selectAdminId(String admin_id);
}
