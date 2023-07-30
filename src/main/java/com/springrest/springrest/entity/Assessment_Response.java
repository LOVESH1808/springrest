package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Assessment_Response {
	@Id
	private String Assessment_Response_Id;
	private int Student_Id;
	private String Question_Id,Course_Id,Question_Paper_Id;
	private boolean Is_Correct;
	public Assessment_Response(String assessment_Response_Id, int student_Id, String question_Id, String course_Id,
			String question_Paper_Id, boolean is_Correct) {
		super();
		Assessment_Response_Id = assessment_Response_Id;
		Student_Id = student_Id;
		Question_Id = question_Id;
		Course_Id = course_Id;
		Question_Paper_Id = question_Paper_Id;
		Is_Correct = is_Correct;
	}
	public Assessment_Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAssessment_Response_Id() {
		return Assessment_Response_Id;
	}
	public void setAssessment_Response_Id(String assessment_Response_Id) {
		Assessment_Response_Id = assessment_Response_Id;
	}
	public int getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}
	public String getQuestion_Id() {
		return Question_Id;
	}
	public void setQuestion_Id(String question_Id) {
		Question_Id = question_Id;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	public String getQuestion_Paper_Id() {
		return Question_Paper_Id;
	}
	public void setQuestion_Paper_Id(String question_Paper_Id) {
		Question_Paper_Id = question_Paper_Id;
	}
	public boolean isIs_Correct() {
		return Is_Correct;
	}
	public void setIs_Correct(boolean is_Correct) {
		Is_Correct = is_Correct;
	}
	@Override
	public String toString() {
		return "Assessment_Response [Assessment_Response_Id=" + Assessment_Response_Id + ", Student_Id=" + Student_Id
				+ ", Question_Id=" + Question_Id + ", Course_Id=" + Course_Id + ", Question_Paper_Id="
				+ Question_Paper_Id + ", Is_Correct=" + Is_Correct + "]";
	}
	
}
