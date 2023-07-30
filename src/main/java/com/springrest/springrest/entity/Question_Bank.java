package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Question_Bank {
	@Id
	private String Question_Bank_Id;
	private String Question,Option1,Option2,Option3,Option4,Answer,Justfication;
	public Question_Bank(String question_Bank_Id, String question, String option1, String option2, String option3,
			String option4, String answer, String justfication) {
		super();
		Question_Bank_Id = question_Bank_Id;
		Question = question;
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
		Answer = answer;
		Justfication = justfication;
	}
	public Question_Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQuestion_Bank_Id() {
		return Question_Bank_Id;
	}
	public void setQuestion_Bank_Id(String question_Bank_Id) {
		Question_Bank_Id = question_Bank_Id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public String getJustfication() {
		return Justfication;
	}
	public void setJustfication(String justfication) {
		Justfication = justfication;
	}
	@Override
	public String toString() {
		return "Question_Bank [Question_Bank_Id=" + Question_Bank_Id + ", Question=" + Question + ", Option1=" + Option1
				+ ", Option2=" + Option2 + ", Option3=" + Option3 + ", Option4=" + Option4 + ", Answer=" + Answer
				+ ", Justfication=" + Justfication + "]";
	}
	
}
