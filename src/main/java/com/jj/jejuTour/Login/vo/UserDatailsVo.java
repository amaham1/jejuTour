package com.jj.jejuTour.Login.vo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDatailsVo implements UserDetails {
    private static final long serialVersionUID = 1L;

    private String username; // ID
    private String password; // PW
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

    public void setAuthorities(List<String> authList) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (String s : authList) {
            authorities.add(new SimpleGrantedAuthority(s));
        }

        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    // 계정이 만료 되지 않았는가?
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    // 계정이 잠기지 않았는가?
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    // 패스워드가 만료되지 않았는가?
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    // 계정이 활성화 되었는가?
    @Override
    public boolean isEnabled() {
        return false;
    }
}
