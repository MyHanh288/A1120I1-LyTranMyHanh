package com.example.demo.controller;

import com.example.demo.model.MyCount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycount")
public class CountController {
    @ModelAttribute("mycount")
    public MyCount setUpCount(){
        return new MyCount();
    }

    @GetMapping("/")
    public String get(@ModelAttribute ("mycount") MyCount myCount){
        myCount.increment();
        return "index";
    }
}
