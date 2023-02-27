package com.ridham.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class ModelController {

    @RequestMapping("/model")
    public String modelExa(Model model){

        System.out.println("This is model Controller");

        model.addAttribute("name","Ridham");

        return "model-confirmation";


    }
}
