package com.kodluyoruz.weektwo.ApplicationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ApplicationConfiguration {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

}
