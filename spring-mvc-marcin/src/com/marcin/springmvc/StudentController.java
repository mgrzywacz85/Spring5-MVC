package com.marcin.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create new Student object

		Student theStudent = new Student();

		// add Student object as model attribute

		theModel.addAttribute("student", theStudent);

		return "student-form";
	}
	

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		
		System.out.println("theStudent: " + theStudent.getFirstName() 
							+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}

}
