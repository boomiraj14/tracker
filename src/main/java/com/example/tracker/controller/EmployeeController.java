package com.example.tracker.controller;

import com.example.tracker.entity.Employee;
import com.example.tracker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        String message = "";
        try{
            employeeService.addEmployee(employee);
            message = "Employee " + employee.getFirstName() + employee.getLastName() + " Successfully added";
        }catch (Exception e){
            message = "Employee " + employee.getFirstName() + employee.getLastName() + " NOT added due to tech error.";
        }
        return message;
    }

    @PostMapping("/employeeDetails")
    public Map getEmployeeDetails(@RequestParam String email)
    {
        Map<String, Object> employees = null;
        try{
           employees = employeeService.getEmployeeList(email.toLowerCase());
        }catch (Exception e){
            e.printStackTrace();
        }
        return employees;
    }
}
