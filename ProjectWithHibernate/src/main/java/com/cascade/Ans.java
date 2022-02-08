package com.cascade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans 
{
	@Id
	@Column(name="Ans_id")
	private int ansId;
	private String ans;
	@ManyToOne
	private Que que;
	
	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	
}

	@Override
	public String toString() {
		return "Ans [ansId=" + ansId + ", ans=" + ans + ", que=" + que + "]";
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Que getQue() {
		return que;
	}

	public void setQue(Que que) {
		this.que = que;
	}

	public Ans(int ansId, String ans, Que que) {
		super();
		this.ansId = ansId;
		this.ans = ans;
		this.que = que;
	}
}