package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Payment implements InitializingBean,DisposableBean{
	private String tnxName;
	private int tnxId;
	public Payment() {
		super();
	}
	public Payment(String tnxName, int tnxId) {
		super();
		this.tnxName = tnxName;
		this.tnxId = tnxId;
	}
	public String getTnxName() {
		return tnxName;
	}
	public void setTnxName(String tnxName) {
		System.out.println("Setting transaction name");
		this.tnxName = tnxName;
	}
	public int getTnxId() {
		return tnxId;
	}
	public void setTnxId(int tnxId) {
		System.out.println("Setting transaction Id");
		this.tnxId = tnxId;
	}
	@Override
	public String toString() {
		return "Payment [tnxName=" + tnxName + ", tnxId=" + tnxId + "]";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method : Payment");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method : Payment");
		
	}
	
	
}
