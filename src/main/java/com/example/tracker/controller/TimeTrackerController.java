package com.example.tracker.controller;

import com.example.tracker.entity.TimeTracker;
import com.example.tracker.service.TimeTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class TimeTrackerController {

    @Autowired
    private TimeTrackerService timeTrackerService;

    @PostMapping("/swipe")
    public String swipeInOut(@RequestBody TimeTracker timeTracker){
        timeTracker.setDate(LocalDate.now());
        timeTracker.setSwipeTime(LocalDateTime.now().toLocalTime());
        return timeTrackerService.swipeInOut(timeTracker);
    }

}
