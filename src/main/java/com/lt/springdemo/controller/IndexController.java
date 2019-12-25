package com.lt.springdemo.controller;


import com.lt.springdemo.dto.PaginationDTO;
import com.lt.springdemo.dto.ResultDTO;
import com.lt.springdemo.exception.CustomizeErrorCode;
import com.lt.springdemo.exception.CustomizeException;
import com.lt.springdemo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/index")
    public String index(HttpServletRequest request,
                        HttpServletResponse response,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "5") Integer size) {




        PaginationDTO pagination = questionService.list(page, size);
        model.addAttribute("pagination", pagination);
        return "index";
    }

}
