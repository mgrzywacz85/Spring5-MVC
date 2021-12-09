package com.marcin.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// creating a controller method to display the initial HTML form

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// deprecated: creating the first version of the controller method to process
	// the HTML form

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// creating the second version of the controller method to process the HTML form
	// and add data to the model

	@RequestMapping("/processFormTwo")
	public String changeNameToUpperCase(HttpServletRequest request, Model model) {

		// read the request parameter from HTML form

		String studentName = request.getParameter("studentName");

		// convert data

		studentName = studentName.toUpperCase();

		String messageToStudent = "Hey " + studentName;

		// add message to the Model

		model.addAttribute("message", messageToStudent);

		return "helloworld";

	}

}
