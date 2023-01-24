package com.example.controller;

import com.example.modelEntity.Employee;
import com.example.repositoryDAO.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmp")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

    @GetMapping("/getEmp")  // get all the employee details from the DB
    public List<Employee> fetchEmpDetails (){
        return employeeRepo.findAll();
    }

    /*@GetMapping("/getEmp/{id}")
        Need to analysis about the path variable concept and
*/

}
