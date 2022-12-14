package com.afterlearn.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afterlearn.demo.model.Cricket;
import com.afterlearn.demo.repositry.CricketRepository;

@Controller
public class Cricketcontroller {
    @Autowired 
    CricketRepository cricketRepository;
    

    @GetMapping("/list")
    @ResponseBody
    public List<Cricket> getmydata()
    {
        System.out.println("jhfghfdgcgfe"+cricketRepository.findAll());
        return cricketRepository.findAll();
    }
    
    
}
