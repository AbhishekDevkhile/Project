package com.ConstructorInj;

public class certificate {
	
	private String CertName;

	public certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public certificate(String certName) {
		super();
		CertName = certName;
	}

	public String getCertName() {
		return CertName;
	}

	public void setCertName(String certName) {
		CertName = certName;
	}

	@Override
	public String toString() {
		return "certificate [CertName=" + CertName + "]";
	}
	

}
