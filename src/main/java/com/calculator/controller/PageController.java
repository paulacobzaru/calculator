package com.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/ageCalculator")
    public String ageCalculator(Model model){

        return "/ageCalculator";
    }

}
