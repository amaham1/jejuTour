package com.jj.jejuTour.login.vo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetailsVo implements UserDetails {
    private static final long serialVersionUID = 1L;

    private String username; // ID
    private String password; // PW
    private String id;
    private String pwd;
    private List<GrantedAuthority> authorities;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public void setAuthorities(List<String> authList) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (String s : authList) {
            authorities.add(new SimpleGrantedAuthority(s));
            System.out.println("1111`` " + s);
        }

        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    // 계정이 만료 되지 않았는가?
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 계정이 잠기지 않았는가?
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 패스워드가 만료되지 않았는가?
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 계정이 활성화 되었는가?
    @Override
    public boolean isEnabled() {
        return true;
    }
}
