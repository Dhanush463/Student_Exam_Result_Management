package com.example.StudentResult.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.StudentResult.entity.Student;
import com.example.StudentResult.repository.StudentRepository;

@Service
public class StudentServiceMySQL  implements StudentService{
	private final StudentRepository studentRepository;

    public StudentServiceMySQL( @Autowired StudentRepository studentRepository )
    {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save( Student student )
    {
        return studentRepository.save( student );
    }

    @Override
    public void delete( int studentId )
    {
        studentRepository.deleteById( studentId );
    }

    @Override
    public List<Student> all()
    {
        List<Student> result = new ArrayList<>();
        studentRepository.findAll().forEach( result::add );
        return result;
    }

    @Override
    public Student findById( int studentId )
    {
        return studentRepository.findById( studentId ).get();
    } 
    
    @Override
    public Student findByRegNo(Long regNo) {
        return studentRepository.findByRegNo(regNo).orElse(null);
    }
	
}
