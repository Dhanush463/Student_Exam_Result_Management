package com.example.StudentResult.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.example.StudentResult.entity.Student;


public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	Optional<Student> findByRegNo(Long regNo);
}
