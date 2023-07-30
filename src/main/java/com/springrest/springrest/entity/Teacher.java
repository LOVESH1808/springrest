package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int Teacher_Id;
	private String Course_Id;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teacher_Id, String course_Id) {
		super();
		Teacher_Id = teacher_Id;
		Course_Id = course_Id;
	}
	public int getTeacher_Id() {
		return Teacher_Id;
	}
	public void setTeacher_Id(int teacher_Id) {
		Teacher_Id = teacher_Id;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	@Override
	public String toString() {
		return "Teacher [Teacher_Id=" + Teacher_Id + ", Course_Id=" + Course_Id + "]";
	}
	
}
