package com.employeemanage;

public interface EmployeeInterf {
	
	//create employee
	public void createEmployee(Employee emp);
	
	//show employee
	public void showEmployee();
	
	//show employee based on id
	public void showEmployeeBasedOnId(int id);
	
	//update employee
	public void updateEmployee(int id, String field, String value);
	
	//delete employee
	public void deleteEmployee(int id);

}
