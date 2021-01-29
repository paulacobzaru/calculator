package com.calculator.controller;

import com.calculator.service.CalculatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {
    //    @Autowired
//    private Integer x;
//    @Autowired
//    private Integer y;
//    @Autowired(required = true)
    private Integer result1;
    private Integer result2;
    private Integer result3;
    private Integer result4;
    private Integer result5;


    @GetMapping("/addCalculator")
    public String add(@PathVariable int x, @PathVariable int y, Model model) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.add(x, y);
        model.addAttribute("Your addition result is: ", result1);
        return "/addCalculator";
    }

    @GetMapping("/subtractionCalculator")
    public String minus(@PathVariable int x, @PathVariable int y, Model model) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.minus(x, y);
        model.addAttribute("Your substraction result is: ", result2);
        return "/subtrationCalculator";
    }

    @GetMapping("/multiplyCalculator")
    public String multiply(@PathVariable int x, @PathVariable int y, Model model) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.multiply(x, y);
        model.addAttribute("Your multiply result is: ", result3);
        return "/multiplyCalculator";
    }

    @GetMapping("/divisionCalculator")
    public String division(@PathVariable int x, @PathVariable int y, Model model) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.division(x, y);
        model.addAttribute("Your division result is: ", result4);
        return "/divisionCalculator";
    }

    @GetMapping("/moduloCalculator")
    public String modulo(@PathVariable int x, @PathVariable int y, Model model) {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.modulo(x, y);
        model.addAttribute("Your modulo result is: ", result5);
        return "/moduloCalculator";
    }
}

