package com.example.StudentResult.Dto;



public class StudentDto {
	
	private Long regNo;
	
	private String firstName;

	private String lastName;

	private Integer tamilMark;

	private Integer englishMark;

	private Integer mathsMark;

	private Integer scienceMark;

	private Integer socialMark;

	private Integer total;
	
	private Integer percentage;
	
	private String status;
	
	
	
	public StudentDto(Long regNo, String firstName, String lastName, Integer tamilMark, Integer englishMark,
			Integer mathsMark, Integer scienceMark, Integer socialMark, Integer total, Integer percentage,
			String status) {
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

}
