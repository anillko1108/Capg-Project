package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyIntitializer","handler"})
@Entity
public class Student implements Serializable {
	@Id
	String sname;
	String department;
	int regno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String department, int regno) {
		super();
		this.sname = sname;
		this.department = department;
		this.regno = regno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", department=" + department + ", regno=" + regno + "]";
	}
	

}
