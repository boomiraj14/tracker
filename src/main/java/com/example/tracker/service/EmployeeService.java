package com.example.tracker.service;

import com.example.tracker.entity.Employee;
import com.example.tracker.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee){
        employee.setCreatedDate(LocalDateTime.now());
        employee.setEmail(employee.getEmail().toLowerCase());
        return employeeRepo.save(employee);
    }

    public Map getEmployeeList(String email){
        Employee employee = employeeRepo.getEmployeeByEmail(email);
        List<Employee> employees = employeeRepo.getEmployeesByTeamMgrId(employee.getId());
        Map<String, Object> empMap = new LinkedHashMap<>();
        empMap.put(email, employee);
        Employee manager = employeeRepo.getEmployeeById(employee.getTeamMgrId());
        empMap.put("Manager", manager);
        if(!employees.isEmpty())
        {
            empMap.put("People Reporting to", employees);
        } else {
            List<Employee> peopleWorkWith = employeeRepo.getEmployeesByTeamName(employee.getTeamName());
            peopleWorkWith.removeIf(employee1 ->   email.equals(employee1.getEmail()));
            empMap.put(employee.getFirstName()+ " works with", peopleWorkWith);
        }

        return empMap;
    }

}
