package com.example.StudentResult.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.StudentResult.Dto.StudentDto;
import com.example.StudentResult.entity.Student;

import com.example.StudentResult.service.StudentService;


@RestController
@RequestMapping("/api/v1/")
public class StudentController {
	
	final StudentService studentService;

	@Autowired 
    public StudentController(StudentService studentService )
    {
        this.studentService = studentService;
    }
	
	
    @GetMapping( "/all" )
    public Iterable<Student> getAllStudent()
    {
        return studentService.all();
    }
    @GetMapping("/students/{regNo}")
    public ResponseEntity<Student> getStudentByRegNo(@PathVariable Long regNo) {
        Student student = studentService.findByRegNo(regNo);
        if(student != null) {
        	return ResponseEntity.ok(student);
        } else {
        	return ResponseEntity.notFound().build();
        }
        
    }
    
    @CrossOrigin
    @PostMapping("/update")
    public Student saveStudent( @RequestBody StudentDto studentDto )
    {
        return studentService.save( new Student(studentDto) );
    }

    @GetMapping( "/{id}" )
    public Student findStudentById( @PathVariable Integer id )
    {
        return studentService.findById( id );
    }

    @PutMapping( "/{id}" )
    public Student update( @RequestBody StudentDto studentDto, @PathVariable Integer id )
    {
        Student stu = studentService.findById( id );
        stu.setRegNo( studentDto.getRegNo() );
        stu.setFirstName( studentDto.getFirstName() );
        stu.setLastName( studentDto.getLastName() );
        stu.setTamilMark( studentDto.getTamilMark() );
        stu.setEnglishMark( studentDto.getEnglishMark() );
        stu.setMathsMark( studentDto.getMathsMark() );
        stu.setScienceMark( studentDto.getScienceMark() );
        stu.setSocialMark( studentDto.getSocialMark() );
        stu.setTotal( studentDto.getTotal() );
        stu.setPercentage( studentDto.getPercentage() );
        stu.setStatus( studentDto.getStatus() );
        
        return studentService.save( stu );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        studentService.delete( id );
    }
	/*@Autowired
	private StudentService studentService;
	
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students",studentService.getAllStudent());
		return "students";
	} */

	/*private final StudentRepository studentRepository;
	public StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	//get all StudentsMarks
	@GetMapping("/students")
	public List<Student>  getAllStudent(){
		return studentRepository.findAll();
	}
	@GetMapping("/students/{id}")
	public Optional<Student> getStudentId(@PathVariable Integer id){
		return studentRepository.findById(id);
	}
	/*@GetMapping("/students/{firstName}")
	public List<Student> getStudentId(@PathVariable("firstName") String firstName){
		if(firstName != null) {
			return studentRepository.findByFirstName(firstName);
		}
		else {
			return new ArrayList<>();
		}
	}*/
	/*@PostMapping("/students/update")
	public Student createNewStudent(@RequestBody Student stu) {
		Student newStudent = this.studentRepository.save(stu);
		return newStudent;
	}
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable Integer id,@RequestBody Student s) {
		Optional<Student> studentToUpdateOptional = this.studentRepository.findById(id);
		if(!studentToUpdateOptional.isPresent()) {
			return null;
		}
		Student studentToUpdate = studentToUpdateOptional.get();
		if(s.getRegNo() !=null) {
			studentToUpdate.setRegNo(s.getRegNo());
		}
		if(s.getFirstName() !=null) {
			studentToUpdate.setFirstName(s.getFirstName());
		}
		if(s.getLastName() !=null) {
			studentToUpdate.setLastName(s.getLastName());
		}
		if(s.getFirstName() !=null) {
			studentToUpdate.setFirstName(s.getFirstName());
		}
		if(s.getTamilMark() !=null) {
			studentToUpdate.setTamilMark(s.getTamilMark());
		}
		if(s.getEnglishMark() !=null) {
			studentToUpdate.setEnglishMark(s.getEnglishMark());
		}
		if(s.getMathsMark() !=null) {
			studentToUpdate.setMathsMark(s.getMathsMark());
		}
		if(s.getScienceMark() !=null) {
			studentToUpdate.setScienceMark(s.getScienceMark());
		}
		if(s.getSocialMark() !=null) {
			studentToUpdate.setSocialMark(s.getSocialMark());
		}
		if(s.getTotal() !=null) {
			studentToUpdate.setTotal(s.getTotal());
		}
		if(s.getPercentage() !=null) {
			studentToUpdate.setPercentage(s.getPercentage());
		}
		if(s.getStatus() !=null) {
			studentToUpdate.setStatus(s.getStatus());
		}
		
		Student updateStudent = this.studentRepository.save(studentToUpdate);
		return updateStudent;
	}
	@DeleteMapping("/students/{id}")
	public Student deleteStudent(@PathVariable Integer id) {
		Optional<Student> studentToDeleteOptional = studentRepository.findById(id);
		if(!studentToDeleteOptional.isPresent()) {
			return null;
		}
		Student studentToDelete = studentToDeleteOptional.get();
		studentRepository.delete(studentToDelete);
		return studentToDelete;
		
		
		
	}*/
	
}
