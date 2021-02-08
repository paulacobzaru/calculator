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
        Calculator calculator = new Calculator();
        int result1 =calculator.add(inputOne,inputTwo);
        model.addAttribute("result1", result1);
        return "/index";
    }

    @PostMapping("/subtract")
    public String subtract(Model model, int inputOne, int inputTwo) {
        Calculator calculator = new Calculator();
        int result2 =calculator.minus(inputOne,inputTwo);
        model.addAttribute("result2", result2);
        return "index";
    }

    @PostMapping("/multiply")
    public String multiply(Model model, int inputOne, int inputTwo) {
        Calculator calculator = new Calculator();
        int result3 =calculator.multiply(inputOne,inputTwo);
        model.addAttribute("result3", result3);
        return "index";
    }

    @PostMapping("/division")
    public String divisiont(Model model, int inputOne, int inputTwo) {
        Calculator calculator = new Calculator();
        int result4 =calculator.division(inputOne,inputTwo);
        model.addAttribute("result4", result4);
        return "index";
    }

    @PostMapping("/modulo")
    public String modulo(Model model, int inputOne, int inputTwo) {
        Calculator calculator = new Calculator();
        int result5 =calculator.modulo(inputOne,inputTwo);
        model.addAttribute("result5", result5);
        return "index";
    }

    @PostMapping("/power")
    public String pow(Model model, double inputOne, double inputTwo) {
        Calculator calculator = new Calculator();
        double result6 =calculator.pow(inputOne,inputTwo);
        model.addAttribute("result6", result6);
        return "index";
    }

    @PostMapping("/root")
    public String root(Model model, double inputOne, double inputTwo) {
        Calculator calculator = new Calculator();
        double result7 =calculator.root(inputOne,inputTwo);
        model.addAttribute("result7", result7);
        return "index";
    }
}

