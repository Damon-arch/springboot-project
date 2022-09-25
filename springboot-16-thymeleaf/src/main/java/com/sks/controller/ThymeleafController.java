package com.sks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request, Model model) {
        request.setAttribute("data", "模板引擎");
        model.addAttribute("model", "模特");
        return "hello";
    }
}
