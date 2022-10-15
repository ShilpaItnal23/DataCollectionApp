package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.binding.CreateCase;
import com.example.demo.binding.EducationDetails;
import com.example.demo.binding.IncomeDetails;
import com.example.demo.binding.KidsDetails;
import com.example.demo.binding.PlanSelection;

@Service
public interface DataCollectionService {
	
	public Integer createCase(CreateCase appId );
	
	public String createIncomeDetails(IncomeDetails incomeDetails);
	
	public Boolean createPlanSelection(PlanSelection planSelection);
	
	public Boolean createKidsDetails(KidsDetails kidsDetails);
	
	public Boolean createEducationDetails(EducationDetails eduDetails);
	
	
}
