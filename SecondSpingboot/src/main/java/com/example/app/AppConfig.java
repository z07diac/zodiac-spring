package com.example.app;

import org.springframework.context.annotation.Bean;

//@Configuration
public class AppConfig {
    @Bean
    Calculator calculator(){
        return new AddCalculator();
    }

    @Bean
    ArgumentResolver argumentResolver(){
        return  new ScannerArgumentResolver();
    }

    @Bean
    Frontend frontend(){
        return  new Frontend();
    }



    //DI without auto wired
    @Bean
    Frontend2 frontend2(){
        Frontend2 frontend2 =new Frontend2();
        frontend2.setCalculator(calculator());
        frontend2.setArgumentResolver(argumentResolver());
        return frontend2;
    }



    //Beside this one, we also can use the config.xml file for DI to create Bean


    //This class is not nessarty if we use componets
}
