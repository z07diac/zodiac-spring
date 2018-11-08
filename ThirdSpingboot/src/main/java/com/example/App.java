package com.example;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import sun.print.CUPSPrinter;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan
public class App  implements CommandLineRunner
{
    @Autowired
    CustomerService customerService;
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        customerService.save(new Customer(1, "Zuo","zuo"));
        customerService.save(new Customer(2, "Zuo2","zuo"));
        customerService.save(new Customer(3, "Zuo3","zuo"));

        customerService.findAll().forEach(System.out::println);


    }
}
