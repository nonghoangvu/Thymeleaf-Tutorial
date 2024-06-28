package com.vunh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping
    public String index() {
        return "page/home";
    }
    @GetMapping("/about")
    public String about() {
        return "page/about";
    }
}
