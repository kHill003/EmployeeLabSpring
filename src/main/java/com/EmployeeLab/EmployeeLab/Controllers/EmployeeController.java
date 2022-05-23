package com.EmployeeLab.EmployeeLab.Controllers;
import com.EmployeeLab.EmployeeLab.Models.Employee;
import com.EmployeeLab.EmployeeLab.Repositories.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRespository employeeRespository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRespository.findAll();
    }
    @GetMapping(value = "/employees/{id}")

    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeRespository.findById(id);
    }


}
