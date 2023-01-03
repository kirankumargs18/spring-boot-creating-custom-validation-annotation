package com.kirangs.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kirangs.customannotation.ValidateEmployeeType;

public class Employee {

	private Integer empId;

	@NotBlank(message = "first name should not be empty or null")
	private String firstName;

	@NotBlank(message = "last name should not be empty or null")
	private String lastName;

	@Past(message = "start date should not be before current date")
	@JsonFormat(pattern = "dd-mm-yyyy")
	private Date doj;

	@NotBlank(message = "department should not be null")
	private String dept;

	@Email(message = "email address should be valid")
	private String email;

	//here i have used my custom annotation
	
//	@ValidateEmployeeType(message = "Not a valid one")
	@ValidateEmployeeType
	private String employeeType;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

}
