package com.example.contructor.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TenisCoach implements Coach {
    public TenisCoach(){
        System.out.println("In constructor"+" "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
