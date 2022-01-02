package com.marcin.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {

		coursePrefix = courseCode.value();
		
	}

	@Override
	public boolean isValid(String htmlFormData, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result;
				
		if(htmlFormData != null) {
		result = htmlFormData.startsWith(coursePrefix);
		} else {
			result = false;
		}
		
		return result;
	}


	
	

}
