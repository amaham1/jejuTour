package com.jj.jejuTour.Login.dao;

import com.jj.jejuTour.Login.vo.LoginVo;

public interface LoginDao {

    int getAdminLogin(LoginVo loginVo);

    String getSalt(String id);
}
