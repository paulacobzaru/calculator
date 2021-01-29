package com.calculator.service;

import org.springframework.stereotype.Service;

import java.util.function.BinaryOperator;

@Service
public class CalculatorImpl implements Calculator{

//    BinaryOperator<Integer> addOperator = Integer::sum;
//    BinaryOperator<Integer> subtractOperator = (x, y) -> x - y;
//    BinaryOperator<Integer> multiplyOperator = (x, y) -> x * y;
//    BinaryOperator<Integer> divisionOperator = (x, y) -> x / y;
//    BinaryOperator<Integer> moduloOperator = (x, y) -> x % y;


    public Integer add(int x, int y) {
        int result = x+y;
        return result;
    }

    @Override
    public Integer minus(int x, int y) {
        int result = x-y;
        return result;
    }

    @Override
    public Integer multiply(int x, int y) {
        int result = x*y;
        return result;
    }

    @Override
    public Integer division(int x, int y) {
        int result = x/y;
        return result;
    }
    @Override
    public Integer modulo(int x, int y) {
        int result = x%y;
        return result;
    }
}