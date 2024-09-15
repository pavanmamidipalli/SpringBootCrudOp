package com.example.demo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Studentname;
	public student(int id, String studentname, String studentmail) {
		super();
		this.id = id;
		Studentname = studentname;
		Studentmail = studentmail;
	}
	public student() {
		
	}
	private String Studentmail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getStudentmail() {
		return Studentmail;
	}
	public void setStudentmail(String studentmail) {
		Studentmail = studentmail;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", Studentname=" + Studentname + ", Studentmail=" + Studentmail + "]";
	}
	

}
