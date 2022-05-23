package com.EmployeeLab.EmployeeLab;

import com.EmployeeLab.EmployeeLab.Models.Employee;
import com.EmployeeLab.EmployeeLab.Repositories.EmployeeRespository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeLabApplicationTests {
	@Autowired
	EmployeeRespository employeeRespository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee(){
		Employee Jim= new Employee("Jim", "Jones", 34, 8976,"jj@gmail.com");
		employeeRespository.save(Jim);
	}
	}


