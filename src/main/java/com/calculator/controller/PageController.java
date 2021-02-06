package com.calculator.controller;

import com.calculator.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {
    @Autowired(required = true)
    Calculator calculator;

    @PostMapping("/add")
    public String add(Model model, int inputOne, int inputTwo) {
        int result =calculator.add(inputOne,inputTwo);
        model.addAttribute("result", result);
        return "index";
    }

    @PostMapping("/subtract")
    public String subtract(Model model, int inputOne, int inputTwo) {
        int result =calculator.minus(inputOne,inputTwo);
        model.addAttribute("result", result);
        return "index";
    }

}

