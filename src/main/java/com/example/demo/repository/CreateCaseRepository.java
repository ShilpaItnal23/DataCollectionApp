package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.CreateCase;

public interface CreateCaseRepository extends JpaRepository<CreateCase, Serializable> {

}
