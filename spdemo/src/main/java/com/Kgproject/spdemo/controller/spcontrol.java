package com.Kgproject.spdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class spcontrol {
    @RequestMapping("/go")
    @ResponseBody
    String return1(){
        System.out.println("working");
        return "hello";
    }
    @RequestMapping("/play")

  
}
