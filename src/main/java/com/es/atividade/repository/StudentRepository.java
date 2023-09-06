package com.es.atividade.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.es.atividade.beans.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
    @Query("{name:'?0'}")
    Student findItemByName(String name);

    long count();

    Optional<Student> findById(String registrationNumber);
}
