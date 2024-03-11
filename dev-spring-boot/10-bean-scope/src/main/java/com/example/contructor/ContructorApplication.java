package com.example.contructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.contructor",
"util"}
)
public class ContructorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContructorApplication.class, args);
    }

}
