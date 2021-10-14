package com.kodluyoruz.weektwo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Scanner;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeektwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeektwoApplication.class, args);
    }

}
