package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;
import com.example.demo.repo.reposit;

@RestController
public class controller {
	@Autowired
	reposit re;
	@PostMapping("/api/student")
	public ResponseEntity<student> savestudnts(@RequestBody student Student) {
		return new ResponseEntity<>(re.save(Student),HttpStatus.ACCEPTED);
	}
	@GetMapping("/api/student")
	public ResponseEntity <List<student>> getstudents(@RequestBody student Student){
		return new ResponseEntity<>(re.findAll(),HttpStatus.OK);
	}
	@GetMapping("/api/students/{id}")
	public ResponseEntity<student> getbystudents(@PathVariable int id){
		Optional<student> stu = re.findById(id);
		if(stu.isPresent()) {
			return new ResponseEntity<>(stu.get(),HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	@DeleteMapping("/api/students/{id}")
	public ResponseEntity<student> delbystudents(@PathVariable int id){
		Optional<student> stu = re.findById(id);
		if(stu.isPresent()) {
			re.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}

}
