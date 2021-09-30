package com.jj.jejuTour.Login.dao;

import com.jj.jejuTour.Login.vo.LoginVo;

public interface LoginDao {

    LoginVo getAdminLogin(String id);

    String getSalt(String id);
}
