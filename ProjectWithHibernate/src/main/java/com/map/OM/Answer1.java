package com.map.OM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 
{
	@Id
	@Column(name="answer_id")
private int ansId;
	
private String answer;


@ManyToOne 
private Question1 question;


public Answer1() {
	super();
	// TODO Auto-generated constructor stub
}


public Answer1(int ansId, String answer, Question1 question) {
	super();
	this.ansId = ansId;
	this.answer = answer;
	this.question = question;
}


public int getAnsId() {
	return ansId;
}


public void setAnsId(int ansId) {
	this.ansId = ansId;
}


public String getAnswer() {
	return answer;
}


public void setAnswer(String answer) {
	this.answer = answer;
}


public Question1 getQuestion() {
	return question;
}


public void setQuestion(Question1 question) {
	this.question = question;
}


@Override
public String toString() {
	return "Answer1 [ansId=" + ansId + ", answer=" + answer + ", question=" + question + "]";
}





}


