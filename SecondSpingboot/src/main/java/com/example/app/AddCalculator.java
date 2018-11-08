package com.example.app;


import org.springframework.stereotype.Component;

@Component
public class AddCalculator implements   Calculator {
    @Override
    public int Calc(int a, int b) {
        return a+b;
    }
}
