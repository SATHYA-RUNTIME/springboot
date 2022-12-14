package com.afterlearn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.afterlearn.demo.repositry.CricketRepository;

@Controller
public class Cricketcontroller {
    @Autowired 
    CricketRepository cricketRepository;
    
    
    
}
