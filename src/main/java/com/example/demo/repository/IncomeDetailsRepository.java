package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.binding.IncomeDetails;

@Repository
public interface IncomeDetailsRepository extends JpaRepository<IncomeDetails, Serializable> {

	
}
