package com.example.app;


//DI withou autowired
public class Frontend2 {


    public void setArgumentResolver(ArgumentResolver argumentResolver) {
        this.argumentResolver = argumentResolver;
    }

    ArgumentResolver argumentResolver;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    Calculator calculator;

    public void run (){
        System.out.print("Input a and b");
        Argument argument =argumentResolver.resolver(System.in);
        int result =calculator.Calc(argument.getA(),argument.getB());
    }


}
