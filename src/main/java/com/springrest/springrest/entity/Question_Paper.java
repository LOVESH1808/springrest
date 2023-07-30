package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Question_Paper {
	@Id
	private String Question_Paper_Id;
	private String name;
	private String Course_Id;
	public Question_Paper(String question_Paper_Id, String name, String course_Id) {
		super();
		Question_Paper_Id = question_Paper_Id;
		this.name = name;
		Course_Id = course_Id;
	}
	public Question_Paper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQuestion_Paper_Id() {
		return Question_Paper_Id;
	}
	public void setQuestion_Paper_Id(String question_Paper_Id) {
		Question_Paper_Id = question_Paper_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	@Override
	public String toString() {
		return "Question_Paper [Question_Paper_Id=" + Question_Paper_Id + ", name=" + name + ", Course_Id=" + Course_Id
				+ "]";
	}
	
}
