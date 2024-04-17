package com.jpa.dto;

import com.jpa.entity.Passport;

public class EmployeeDTO {
	
	
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	
	private PassportDTO passportDTO;;
	
	

	public PassportDTO getPassportDTO() {
		return passportDTO;
	}

	public void setPassportDTO(PassportDTO passportDTO) {
		this.passportDTO = passportDTO;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
