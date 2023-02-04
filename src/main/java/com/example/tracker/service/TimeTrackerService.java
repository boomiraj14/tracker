package com.example.tracker.service;

import com.example.tracker.entity.TimeTracker;
import com.example.tracker.repo.TimeTrackerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeTrackerService {

    @Autowired
    private TimeTrackerRepo timeTrackerRepo;

    public String swipeInOut(TimeTracker timeTracker){
        timeTrackerRepo.save(timeTracker);
        return timeTracker.getId() + " is swipe " + timeTracker.getType();
    }

    public List<TimeTracker> getInOutHistory(Integer empId){
        return timeTrackerRepo.getTimeTrackersByEmpId(empId);
    }
}
