package com.learningstuff.helloworld;

import com.learningStuff.checker.Checker;
import com.learningStuff.coreUtils.StringUtils;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @Bean
    ApplicationRunner runner() {
        return args -> {

            System.out.println(StringUtils.isEmpty(""));
            System.out.println(Checker.isString(""));

        };
    }

}
