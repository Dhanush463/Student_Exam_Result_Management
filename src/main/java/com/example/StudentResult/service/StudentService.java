package com.example.StudentResult.service;

import java.util.List;


import com.example.StudentResult.entity.Student;

public interface StudentService {
	Student save( Student student );

    void delete( int studentId );

    List<Student> all();

    Student findById( int studentId );

	Student findByRegNo(Long regNo);
}
