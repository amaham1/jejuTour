package com.jj.jejuTour.login.vo;

public class LoginVo {

    private String id;
    private String pwd;
    private int login_fail_count;

    private String login_type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getLogin_fail_count() {
        return login_fail_count;
    }

    public void setLogin_fail_count(int login_fail_count) {
        this.login_fail_count = login_fail_count;
    }

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type;
    }
}
