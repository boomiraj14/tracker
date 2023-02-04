package com.example.tracker.repo;

import com.example.tracker.entity.TimeTracker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimeTrackerRepo extends JpaRepository<TimeTracker, Integer> {
    public List<TimeTracker> getTimeTrackersByEmpId(Integer empId);
}
