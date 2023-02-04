package com.example.tracker.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "EMPLOYEE_NEW")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "portfolio")
    private String portfolio;
    @Column(name = "portfolio_manager_id")
    private Integer protfolioMgrId;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "team_mgr_id")
    private Integer teamMgrId;
    @Column(name = "designation")
    private String designation;
    @Column(name = "email")
    private String email;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "empId")
    private List<TimeTracker> timeTracker;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public Integer getProtfolioMgrId() {
        return protfolioMgrId;
    }

    public void setProtfolioMgrId(Integer protfolioMgrId) {
        this.protfolioMgrId = protfolioMgrId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getTeamMgrId() {
        return teamMgrId;
    }

    public void setTeamMgrId(Integer teamMgrId) {
        this.teamMgrId = teamMgrId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public List<TimeTracker> getTimeTracker() {
        return timeTracker;
    }

    public void setTimeTracker(List<TimeTracker> timeTracker) {
        this.timeTracker = timeTracker;
    }
}
