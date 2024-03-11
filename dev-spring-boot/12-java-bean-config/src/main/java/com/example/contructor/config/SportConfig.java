package com.example.contructor.config;

import com.example.contructor.common.Coach;
import com.example.contructor.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
