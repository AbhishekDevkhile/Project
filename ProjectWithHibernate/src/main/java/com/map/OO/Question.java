package com.map.OO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int queId;
	
	private String question;
	
	@OneToOne
	private Answer answer;

	@Override
	public String toString() {
		return "Question [queId=" + queId + ", question=" + question + ", answer=" + answer + "]";
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

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int queId, String question, Answer answer) {
		super();
		this.queId = queId;
		this.question = question;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
