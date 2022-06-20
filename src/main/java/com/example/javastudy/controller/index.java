package com.example.javastudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {

    @RequestMapping("/index")
    public String index(){
        System.out.println("controller=index");

        return "/index";
    }

    @RequestMapping("/index2")
    public String index2(){
        System.out.println("controller=index2");

        return "/index2";
    }

    @RequestMapping("/cboy")
    public String cboy(){

        return "/cboy";
    }
}
