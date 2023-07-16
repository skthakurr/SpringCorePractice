package com.springcore.ci;

public class Certificate {
   private String javCertificate;

public Certificate(String javCertificate) {
	super();
	this.javCertificate = javCertificate;
}

public String getJavCertificate() {
	return javCertificate;
}

public void setJavCertificate(String javCertificate) {
	this.javCertificate = javCertificate;
}

@Override
public String toString() {
	return "Certificate [javCertificate=" + javCertificate + "]";
}


   
   
}
