package com.example;

import com.example.app.Argument;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@EnableAutoConfiguration
@ComponentScan
//@Import(AppConfig.class)
public class App implements CommandLineRunner
{

    //use CommandLineRunner,withoutr frontend class
    @Autowired
    ArgumentResolver argumentResolver;

    @Autowired
    Calculator calculator;

    @Override
    public void run(String... strings) throws Exception {

        System.out.print("Input a b");
        Argument argument=argumentResolver.resolver(System.in);
        int result =calculator.Calc(argument.getA(), argument.getB());
        System.out.print(result);

    }

    public static void main( String[] args ){
        SpringApplication.run(App.class,args);

}
    /*
    public static void main( String[] args )
    {
        try(ConfigurableApplicationContext context= SpringApplication.run(App.class,args))
        {
            /*  Way A
            Scanner scanner =new Scanner(System.in);
            System.out.print("Input A, b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Calculator calculator =context.getBean(Calculator.class);
            int result = calculator.Calc(a,b);
            System.out.print(result);
            */

            /*Way b
            System.out.print("Input A, b");
            ArgumentResolver argumentResolver=context.getBean(ArgumentResolver.class);
            Argument argument=argumentResolver.resolver(System.in);
            Calculator calculator =context.getBean(Calculator.class);
            int result = calculator.Calc(argument.getA(),argument.getB());
            System.out.print(result);
            */

            /*way c
            Frontend frontend = context.getBean(Frontend.class);
            frontend.run();
        }
    }*/
}
