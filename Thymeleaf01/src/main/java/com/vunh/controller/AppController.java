package com.vunh.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private HttpSession session;
    @Autowired
    private ServletContext servletContext;

    @RequestMapping(method = RequestMethod.GET, path = "/day1")
    public String index(Model model) {
        model.addAttribute("model", "This  attribute is the model");
        this.session.setAttribute("session_value", "This attribute is the session attribute");
        this.servletContext.setAttribute("servlet_context_value", "This servlet context is the servlet context");
        model.addAttribute("numbers", List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        return "index";
    }
}
//https://raw.githubusercontent.com/VuScriptMasterForge/ProjectJava5/main/Demo-Java5/src/main/resources/templates/StoreProduct.html?token=GHSAT0AAAAAACUDEZQ3MK4CKUNTVJXVLDMUZT6REBQ