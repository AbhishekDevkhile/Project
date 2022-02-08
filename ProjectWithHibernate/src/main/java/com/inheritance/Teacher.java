package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
public class Teacher {
	@Id
	private int tId;
	private String tNmae;
	
	
	public Teacher() {
		super();
		
	}
	public Teacher(int tId, String tNmae) {
		super();
		this.tId = tId;
		this.tNmae = tNmae;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettNmae() {
		return tNmae;
	}

	public void settNmae(String tNmae) {
		this.tNmae = tNmae;
	}

	

	
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tNmae=" + tNmae + "]";
	}
	

}
