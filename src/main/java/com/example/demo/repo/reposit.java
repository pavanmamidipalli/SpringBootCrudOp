package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.student;

public interface reposit extends JpaRepository<student,Integer> {

}
