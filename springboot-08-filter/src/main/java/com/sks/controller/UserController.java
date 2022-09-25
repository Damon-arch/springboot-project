package com.sks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String user() {
        return "页面";
    }
    
    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        return "query";
    }
}
