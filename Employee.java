package com.employeemanage;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private int age;
	private String designation;
	private String role;
	private String gender;
	private String joinDate;
	private int managerId;
	private String email;
	private long mobile;
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String name, double salary, int age, String designation, String role, String gender, String joinDate, int managerId, String email, long mobile) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.designation=designation;
		this.role=role;
		this.gender=gender;
		this.joinDate=joinDate;
		this.managerId=managerId;
		this.email=email;
		this.mobile=mobile;
	}
	
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
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	
	public String getRole() {
		return role;
	}	
	public void setRole(String role) {
		this.role=role;
	}
	
	
	public String getGender(){
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate=joinDate;
	}
	
	
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId=managerId;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile=mobile;
	}
	
	
	public String toString(){
		return "Employee{" + "id=" + id + ", name='" + name + "', salary=" + salary + ", age=" + age + ", designation='" + designation + "', role='" + role + "', gender='" + gender + "', joinDate='"+ joinDate +"', managerId=" + managerId + ", email='" + email + "', mobile=" +mobile+ "};";
	}

}
