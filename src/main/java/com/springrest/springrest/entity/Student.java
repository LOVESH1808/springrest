package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int Student_Id;
	private String Course_Id;
	public Student(int student_Id, String course_Id) {
		super();
		Student_Id = student_Id;
		Course_Id = course_Id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	@Override
	public String toString() {
		return "Student [Student_Id=" + Student_Id + ", Course_Id=" + Course_Id + "]";
	}

	
}
