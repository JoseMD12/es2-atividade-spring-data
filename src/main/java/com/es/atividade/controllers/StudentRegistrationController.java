package com.es.atividade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.atividade.beans.*;
import com.es.atividade.repository.StudentRepository;

@RestController
public class StudentRegistrationController {
	@Autowired
	StudentRepository studentRepository;

	// public StudentRegistrationController(StudentRepository studentRepository) {
	// 	this.studentRepository = studentRepository;
	// }

	@PostMapping("/register/student")
	public StudentDTO registerStudent(@RequestBody Student student) {
		Student studentDB = studentRepository.save(student);
		System.out.println("In registerStudent");
		StudentDTO stdregreply = new StudentDTO(student.getName(), student.getAge(), student.getRegistrationNumber(), "Sucesso");

		return stdregreply;
	}

}
