package com.jj.jejuTour.Login.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(
            HttpServletRequest request
            , HttpServletResponse response
            , Authentication authentication) throws IOException, ServletException {

        // IP, 세션 ID
        WebAuthenticationDetails web = (WebAuthenticationDetails) authentication.getDetails();
        System.out.println("IP : " + web.getRemoteAddress());
        System.out.println("Session ID : " + web.getSessionId());
        // 인증 ID
        System.out.println("name : " + authentication.getName());

        // 권한 리스트
        List<GrantedAuthority> authList = (List<GrantedAuthority>) authentication.getAuthorities();
        System.out.print("권한 : ");
        for (GrantedAuthority grantedAuthority : authList) {
            System.out.print(grantedAuthority.getAuthority() + " ");
        }
        System.out.println();

        response.sendRedirect("/cms/tourInfoList");
    }
}
