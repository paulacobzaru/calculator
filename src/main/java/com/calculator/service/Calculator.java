package com.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator{

    public int add(int x, int y) {
        return x+y;
    }

    public int minus(int x, int y) {
        return x-y;
    }

    public int multiply(int x, int y) {
        return x*y;
    }

    public int division(int x, int y) {
        return x/y;
    }

    public int modulo(int x, int y) {
        return x%y;
    }
}