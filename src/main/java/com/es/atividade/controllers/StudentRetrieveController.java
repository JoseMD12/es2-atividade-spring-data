//
//  Comentário no pod
//

package com.es.atividade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.es.atividade.beans.Student;
import com.es.atividade.beans.StudentRegistration;
import com.es.atividade.repository.StudentRepository;

@RestController
public class StudentRetrieveController {
	@Autowired
	StudentRepository studentRepository;

	public StudentRetrieveController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@GetMapping("/student/allstudent")
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
