package com.example.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "hello";
    }
    // need a controller method to read form data and
    // and data to the model

//    @RequestMapping("/processFormVersionTwo")
//    public String letsShoutDude(HttpServletRequest request, Model model){
//
//
//    }

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("student") String theName, Model model){
      theName = theName.toUpperCase();
      String result = "Hey My Friend"+theName;
      model.addAttribute("message",result);
     return "hello";
    }
}
