package com.kirangs.customannotation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmployeeTypeValidator implements ConstraintValidator<ValidateEmployeeType, String> {

	@Override
	public boolean isValid(String employeeType, ConstraintValidatorContext context) {

		List<String> employeeTypes = Arrays.asList("permanent", "vendor");

//		if (employeeType.contains(employeeType.toLowerCase())) {
//			return true;
//		}
//		return false;

		return employeeTypes.contains(employeeType.toLowerCase());
	}
	
	
}
