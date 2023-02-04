package com.example.tracker.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "TIME_TRACKER_NEW")
public class TimeTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "swipe_time")
    private LocalTime swipeTime;
    @Column(name = "type")
    private String type;
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "emp_id")
    private Integer empId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getSwipeTime() {
        return swipeTime;
    }

    public void setSwipeTime(LocalTime swipeTime) {
        this.swipeTime = swipeTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}

package com.example.tracker.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "TIME_TRACKER_NEW")
public class TimeTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "swipe_time")
    private LocalTime swipeTime;
    @Column(name = "type")
    private String type;
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "emp_id")
    private Integer empId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getSwipeTime() {
        return swipeTime;
    }

    public void setSwipeTime(LocalTime swipeTime) {
        this.swipeTime = swipeTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}

