package com.EmployeeLab.EmployeeLab.Repositories;

import com.EmployeeLab.EmployeeLab.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository  extends JpaRepository<Employee, Long> {
}
