package com.oops;

//DTO : Data Transfer Object
//POJO : Plain Old Java Object
public class Employee {
	
	private int eid;
	private String ename;
	private double sal;
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEname( String ename) {
		this.ename=ename + "-Vcube";
	}
	public String getEname() {
		return ename;
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	public double getSal() {
		return sal;
	}

}
