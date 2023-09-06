package com.es.atividade.beans;

public class StudentDTO {

	String name;
	int age;
	String registrationNumber;
	String registrationStatus;

	public StudentDTO(String name, int age, String registrationNumber, String registrationStatus) {
		this.name = name;
		this.age = age;
		this.registrationNumber = registrationNumber;
		this.registrationStatus = registrationStatus;
	}

}
