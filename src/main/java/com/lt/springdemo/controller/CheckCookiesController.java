package com.lt.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class CheckCookiesController {

    @GetMapping("/")
    public void checkCookies(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.addCookie(new Cookie("checkCookies","true"));
        request.getSession().setAttribute("checkCookies", "true");
        response.sendRedirect("/index");
    }
}
