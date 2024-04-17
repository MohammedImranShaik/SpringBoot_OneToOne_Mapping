package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dto.EmployeeDTO;
import com.jpa.dto.PassportDTO;
import com.jpa.entity.Employee;
import com.jpa.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	// TODO: Create the Employee from the Employee Table
	@PostMapping("/createEmp")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee employee) {
		 //employeeService.createEmp(employee);
		 return new ResponseEntity<Employee>(employeeService.createEmp(employee), HttpStatus.CREATED );
	}
	
	//TODO: Find the Specific Employee in the Employee Table
	@GetMapping("/findEmp/{id}")
	public ResponseEntity<EmployeeDTO> findEmp(@PathVariable Integer id ) {
		EmployeeDTO employee =	employeeService.findEmpById(id);
		return new ResponseEntity<EmployeeDTO>(employee, HttpStatus.ACCEPTED.OK);
	}
	
	//TODO: Find the Specific Passport Data in the Passport Table
	@GetMapping("/findPassport/{id}")
	public ResponseEntity<PassportDTO> findPassport(@PathVariable Integer id) {
	PassportDTO passportDTO = employeeService.findPassport(id);
	return new ResponseEntity<PassportDTO>(passportDTO,HttpStatus.CREATED);
	}

}
