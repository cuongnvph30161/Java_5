package com.example.contructor.common;

import com.example.contructor.common.Coach;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        System.out.println("my coach 1");
        return "Practice fast bowling for 15 minutes";
    }
}
