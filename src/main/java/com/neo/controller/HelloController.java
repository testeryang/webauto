package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class HelloController {
	
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}