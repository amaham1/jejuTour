package com.jj.jejuTour.login.dao;

import com.jj.jejuTour.login.vo.LoginVo;

public interface LoginDao {

    LoginVo getAdminLogin(String id);

    String getSalt(String id);
}
