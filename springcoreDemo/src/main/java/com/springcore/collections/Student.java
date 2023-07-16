package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private List<Integer> id;
	private Set<String> phno;
	private Map<String, String> nameDept;
	private Properties dbConfig;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(List<Integer> id, Set<String> phno, Map<String, String> nameDept,
			Properties dbConfig) {
		super();
		this.id = id;
		this.phno = phno;
		this.nameDept = nameDept;
		this.dbConfig = dbConfig;
	}
	public List<Integer> getId() {
		return id;
	}
	public void setId(List<Integer> id) {
		this.id = id;
	}
	public Set<String> getPhno() {
		return phno;
	}
	public void setPhno(Set<String> phno) {
		this.phno = phno;
	}
	public Map<String, String> getNameDept() {
		return nameDept;
	}
	public void setNameDept(Map<String, String> nameDept) {
		this.nameDept = nameDept;
	}
	public Properties getDbConfig() {
		return dbConfig;
	}
	public void setDbConfig(Properties dbConfig) {
		this.dbConfig = dbConfig;
	}
	@Override
	public String toString() {
		return "Student [name=" + ", id=" + id + ", phno=" + phno + ", nameDept=" + nameDept + ", dbConfig="
				+ dbConfig + "]";
	}
	
	
	
}
