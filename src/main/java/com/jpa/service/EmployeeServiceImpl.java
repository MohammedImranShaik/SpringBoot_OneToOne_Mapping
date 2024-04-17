package com.jpa.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.jpa.dto.EmployeeDTO;
import com.jpa.dto.PassportDTO;
import com.jpa.entity.Employee;
import com.jpa.entity.Passport;
import com.jpa.repository.EmployeeRepository;
import com.jpa.repository.PassportRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PassportRepository passportRepository;
	
	private ModelMapper modelMapper;
	
	@Bean
	public ModelMapper getModelMapper() {
		modelMapper = new ModelMapper();
		return modelMapper;
	}
 
	@Override
	public Employee createEmp(Employee employee) {

		//passportRepository.save(employee.getPassport());

		return employeeRepository.save(employee);
	}

	// Model mapper Object is user for convert one object to another object Like
	// EmployeeEntity to EmployeeDTO

	@Override
	public EmployeeDTO findEmpById(Integer id) {

		Employee employeeEntity = employeeRepository.findById(id).get();

		//ModelMapper modelMapper = new ModelMapper();

		EmployeeDTO employeeDTO = modelMapper.map(employeeEntity, EmployeeDTO.class);

		return employeeDTO;
	}

	@Override
	public PassportDTO findPassport(Integer id) {
	Passport passport = passportRepository.findById(id).get();
	return modelMapper.map(passport, PassportDTO.class);
	}

	

	

}
