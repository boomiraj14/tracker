package com.example.tracker.repo;

import com.example.tracker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    public Employee getEmployeeByEmail(String email);
    public List<Employee> getEmployeesByTeamMgrId(Integer teamMgrId);
    public Employee getEmployeeById(Integer id);
    public  List<Employee> getEmployeesByTeamName(String teamName);
}
