package com.sks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JspController {
    @RequestMapping("/main")
    public String main(HttpServletRequest request) {
        request.setAttribute("data","把项目达成war包");
        return "index";
    }
}
