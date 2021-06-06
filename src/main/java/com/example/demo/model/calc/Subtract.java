package com.example.demo.model.calc;

import org.springframework.stereotype.Component;

@Component
public class Subtract implements Action {

    @Override
    public double calculate(double x, double y) {
        double result = x - y;
        return result;
    }
}