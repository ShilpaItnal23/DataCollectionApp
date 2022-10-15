package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.binding.CreateCase;
import com.example.demo.binding.EducationDetails;
import com.example.demo.binding.IncomeDetails;
import com.example.demo.binding.KidsDetails;
import com.example.demo.binding.PlanSelection;
import com.example.demo.service.DataCollectionService;

@Controller
public class DataCollectionController {

	@Autowired
	private DataCollectionService service;

	@PostMapping("/appid")
	public ResponseEntity<String> createCaseApp(@RequestBody CreateCase appId) {

		Integer status = service.createCase(appId);
		if (status > 0) {

			return new ResponseEntity<>("Case created with Case Id : " + status, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Case Not created ", HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/income-details")
	public ResponseEntity<String> createIncomeDetailsApp(@RequestBody IncomeDetails incomeDetails) {
		String createIncomeDetails = service.createIncomeDetails(incomeDetails);

		return new ResponseEntity<>(createIncomeDetails, HttpStatus.CREATED);
	}

	@PostMapping("/plan-selection")
	public ResponseEntity<String> createPlanSelectionApp(@RequestBody PlanSelection planSelection) {

		Boolean planStatus = service.createPlanSelection(planSelection);
		if (planStatus) {
			return new ResponseEntity<>("Plan is created ", HttpStatus.CREATED);

		} else {

			return new ResponseEntity<>("Plan is not selected ", HttpStatus.BAD_REQUEST);

		}

	}

	@PostMapping("edu-details")
	public ResponseEntity<String> createEducationDetailsApp(@RequestBody EducationDetails eduDetails) {

		Boolean eduDetailsStatus = service.createEducationDetails(eduDetails);

		if (eduDetailsStatus) {
			return new ResponseEntity<>("Education details  created ", HttpStatus.CREATED);

		} else {

			return new ResponseEntity<>("Education details not created", HttpStatus.BAD_REQUEST);

		}
	}

	@PostMapping("/kids-details")
	public ResponseEntity<String> createKidsDetailsApp(@RequestBody KidsDetails kidsDetails) {

		Boolean kidsDetailsStatus = service.createKidsDetails(kidsDetails);

		if (kidsDetailsStatus) {
			return new ResponseEntity<>("Kids details  created ", HttpStatus.CREATED);

		} else {

			return new ResponseEntity<>("Kids details not created", HttpStatus.BAD_REQUEST);

		}

	}

}
