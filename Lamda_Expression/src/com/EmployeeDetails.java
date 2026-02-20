package com;

public class EmployeeDetails {
	private int id;
	private String name;
	private double salary;
	private int deptno;
	private String emailid;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public EmployeeDetails(int id, String name, double salary, int deptno, String emailid, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptno = deptno;
		this.emailid = emailid;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", salary=" + salary + ", deptno=" + deptno
				+ ", emailid=" + emailid + ", gender=" + gender + "]";
	}
	public EmployeeDetails() {
		
	}
	
	
	

}
