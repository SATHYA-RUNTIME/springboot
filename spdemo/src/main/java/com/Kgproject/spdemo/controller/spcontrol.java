package com.Kgproject.spdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Kgproject.spdemo.model.Book;
import com.Kgproject.spdemo.repository.Bookrepo;


@Controller

public class spcontrol {

    @Autowired
     Bookrepo bookrepo;
     

    @RequestMapping("/go")
    @ResponseBody
    String return1(){
        System.out.println("working");
        return "hello";
    }
    @RequestMapping("/view")   
    String myview(ModelMap model){
        // System.out.println("working");
        // model.addAttribute("message", "Programmer Gate");
        List<Book> students = new ArrayList<>();
        bookrepo.findAll().forEach(students::add);
        System.out.println(students);
        model.addAttribute("list", students);

        return "hello.jsp";
    }
    @RequestMapping("/books")
    @ResponseBody
    public List<Book> getall(){
        List<Book> students = new ArrayList<>();
        bookrepo.findAll().forEach(students::add);
        System.out.println(students);
       return bookrepo.findAll();
        
    }
@RequestMapping("/gp")
public String tamil(){
    return "tamil.jsp";
}


  
}
