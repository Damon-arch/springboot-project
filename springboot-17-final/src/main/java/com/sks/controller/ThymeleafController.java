package com.sks.controller;

import com.sks.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("/exp1")
    public String exp1(Model model) {
        model.addAttribute("site", "www.baidu.com");
        model.addAttribute("user", new User(1, "Lolita", "女", 19));
        return "exp1";
    }
}
