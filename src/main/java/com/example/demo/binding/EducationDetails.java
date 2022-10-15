package com.example.demo.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EducationDetails {

	private Integer CaseNumber;
	
	private String higherDegree;
	
	private String universityName;
	
	private LocalDate graduationYear;
}
