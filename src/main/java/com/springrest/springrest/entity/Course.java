package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private String Course_Id;
	private String Name;
	private String Teacher_Id;
	public Course(String course_Id, String name, String teacher_Id) {
		super();
		Course_Id = course_Id;
		Name = name;
		Teacher_Id = teacher_Id;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTeacher_Id() {
		return Teacher_Id;
	}
	@Override
	public String toString() {
		return "Course [Course_Id=" + Course_Id + ", Name=" + Name + ", Teacher_Id=" + Teacher_Id + "]";
	}
	public void setTeacher_Id(String teacher_Id) {
		Teacher_Id = teacher_Id;
	}
	
}
