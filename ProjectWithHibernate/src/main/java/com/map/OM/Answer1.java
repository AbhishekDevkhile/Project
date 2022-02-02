package com.map.OM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer1 
{
	@Id
	@Column(name="answer_id")
private int ansId;
	
private String answer;


public Answer1() {
	super();
	// TODO Auto-generated constructor stub
}
public Answer1(int ansId, String answer) {
	super();
	this.ansId = ansId;
	this.answer = answer;
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

@Override
public String toString() {
	return "Answer [ansId=" + ansId + ", answer=" + answer + "]";
}

 

}
