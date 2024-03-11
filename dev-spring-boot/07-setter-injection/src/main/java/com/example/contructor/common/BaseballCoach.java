package com.example.contructor.common;

import org.springframework.stereotype.Component;

@Component("BaseballCoach")
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practive";
    }
}
