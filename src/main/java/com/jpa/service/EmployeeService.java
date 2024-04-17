package com.jpa.service;

import com.jpa.dto.EmployeeDTO;
import com.jpa.dto.PassportDTO;
import com.jpa.entity.Employee;
import com.jpa.entity.Passport;

public interface EmployeeService {
	
	Employee createEmp(Employee employee);
	
	EmployeeDTO findEmpById(Integer id);
	
	PassportDTO findPassport(Integer id);

}
