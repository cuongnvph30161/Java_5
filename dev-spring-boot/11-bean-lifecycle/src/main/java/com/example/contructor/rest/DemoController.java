package com.example.contructor.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.contructor.common.Coach;

@RestController

public class DemoController {
    //khởi tạo
    private Coach myCoach;

    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
