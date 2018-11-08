package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Frontend {
    @Autowired
    ArgumentResolver argumentResolver;
    @Autowired
    Calculator calculator;

    public void run (){
        System.out.print("Input a and b");
        Argument argument =argumentResolver.resolver(System.in);
        int result =calculator.Calc(argument.getA(),argument.getB());
        System.out.print(result);
    }
}
