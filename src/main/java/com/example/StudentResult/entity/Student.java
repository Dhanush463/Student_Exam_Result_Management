package com.example.StudentResult.entity;

import com.example.StudentResult.Dto.StudentDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="studentmark")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="reg_no")
	private Long regNo;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="tamil")
	private Integer tamilMark;
	
	@Column(name="english")
	private Integer englishMark;
	
	@Column(name="maths")
	private Integer mathsMark;
	
	@Column(name="science")
	private Integer scienceMark;
	
	@Column(name="social")
	private Integer socialMark;
	
	@Column(name="total")
	private Integer total;
	
	@Column(name="percentage")
	private Integer percentage;
	
	@Column(name="status")
	private String status;
	public Student() {
		
	}
	public Student(Long regNo, String firstName, String lastName, Integer tamilMark, Integer englishMark,
			Integer mathsMark, Integer scienceMark, Integer socialMark,Integer total, Integer percentage, String status) {
		super();
		this.regNo = regNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tamilMark = tamilMark;
		this.englishMark = englishMark;
		this.mathsMark = mathsMark;
		this.scienceMark = scienceMark;
		this.socialMark = socialMark;
		this.total = total;
		this.percentage = percentage;
		this.status = status;
	}
	
	public Student(StudentDto studentDto) {
		this.regNo = studentDto.getRegNo();
        this.firstName = studentDto.getFirstName();
        this.lastName = studentDto.getLastName();
        this.tamilMark = studentDto.getTamilMark();
        this.englishMark = studentDto.getEnglishMark();
        this.mathsMark = studentDto.getMathsMark();
        this.scienceMark = studentDto.getScienceMark();
        this.socialMark = studentDto.getSocialMark();
        this.total = studentDto.getTotal();
        this.percentage = studentDto.getPercentage();
        this.status = studentDto.getStatus();
        
        
    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Long getRegNo() {
		return regNo;
	}
	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getTamilMark() {
		return tamilMark;
	}
	public void setTamilMark(Integer tamilMark) {
		this.tamilMark = tamilMark;
	}
	
	public Integer getEnglishMark() {
		return englishMark;
	}
	public void setEnglishMark(Integer englishMark) {
		this.englishMark = englishMark;
	}
	
	public Integer getMathsMark() {
		return mathsMark;
	}
	public void setMathsMark(Integer mathsMark) {
		this.mathsMark = mathsMark;
	}
	
	public Integer getScienceMark() {
		return scienceMark;
	}
	public void setScienceMark(Integer scienceMark) {
		this.scienceMark = scienceMark;
	}
	
	public Integer getSocialMark() {
		return socialMark;
	}
	public void setSocialMark(Integer socialMark) {
		this.socialMark = socialMark;
	}
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	 public String toString() {
	        return "{regNo: "+regNo+", FirstName: "+firstName+", LastName: "+lastName+", Tamil: "+tamilMark+", English"+englishMark+", Maths: "+mathsMark+", Science: "+scienceMark+", Social: "+socialMark+", Total: "+total+", Percentage: "+percentage+", Status: "+status+"}";
	        
	    }
	
}
