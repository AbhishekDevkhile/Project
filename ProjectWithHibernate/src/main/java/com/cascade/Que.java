package com.cascade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Que {
	@Id
	@Column(name="Que_id")
	private int queId;
	private String question;
	
	@OneToMany(mappedBy="ans",fetch	=FetchType.LAZY,cascade=CascadeType.PERSIST)                                 //erroe
	private List<Ans> ans;

	@Override
	public String toString() {
		return "Que [queId=" + queId + ", question=" + question + ", ans=" + ans + "]";
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

	
	public List<Ans> getAns() {
		return ans;
	}

	public void setAns(List<Ans> ans) {
		this.ans = ans;
	}

	

	public Que(int queId, String question, List<Ans> ans) {
		super();
		this.queId = queId;
		this.question = question;
		this.ans = ans;
	}

	public Que() {
		super();
		// TODO Auto-generated constructor stub
	}

}
