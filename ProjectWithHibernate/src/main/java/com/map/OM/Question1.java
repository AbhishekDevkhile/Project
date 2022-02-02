package com.map.OM;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question1 {
	@Id
	@Column(name="question_id")
	private int queId;
	private String question;
	
	
	@OneToMany
	private List<Answer1> answer;
	
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question1(int queId, String question, List<Answer1> answer) {
		super();
		this.queId = queId;
		this.question = question;
		this.answer = answer;
	}

	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [queId=" + queId + ", question=" + question + ", answer=" + answer + "]";
	}
	

	
	
	
	

}
