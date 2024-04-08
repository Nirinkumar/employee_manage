package com.employeemanage;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int id;
		String name;
		double salary;
		int age;
		String designation;
		String role;
		String gender;
		String joinDate;
		int managerId;
		String email;
		long mobile;
		String field;
		String value;
		
		EmployeeInterf intfObj=new EmployeeInterfImplem();
		try (Scanner sn = new Scanner(System.in)) {
			System.out.println("Welcome to Employee Management Application" + '\n');
			
			do {
				System.out.println("1. Add New Employee \n" +
						"2. Show All Employee Details \n" +
						"3. Show Employee Details Based On Id \n" +
						"4. Update Employee Details \n" +
						"5. Delete Employee \n" +
						"6. To Exit");
				System.out.print("Enter the Choice: ");
			
			int step=sn.nextInt();
			switch(step) {
			     		     
			case 1:
				Employee emp=new Employee();
				System.out.print("Enter ID: ");
				id=sn.nextInt();
				System.out.print("Enter Name: ");
				name=sn.next();
				System.out.print("Enter Salary: ");
				salary=sn.nextDouble();
				System.out.print("Enter Age: ");
				age=sn.nextInt();
				System.out.print("Enter Designation: ");
				designation=sn.next();
				System.out.print("Enter Role: ");
				role=sn.next();
				System.out.print("Enter Date of Joining: ");
				joinDate=sn.next();
				System.out.print("Enter Gender: ");
				gender=sn.next();
				System.out.print("Enter Manager ID: ");
				managerId=sn.nextInt();
				System.out.print("Enter Email Address: ");
				email=sn.next();
				System.out.print("Enter Mobile Number: ");
				mobile=sn.nextLong();
				
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);
				emp.setDesignation(designation);
				emp.setRole(role);
				emp.setGender(gender);
				emp.setJoinDate(joinDate);
				emp.setManagerId(managerId);
				emp.setEmail(email);
				emp.setMobile(mobile);
				
				intfObj.createEmployee(emp);
				break;
				
		    case 2:
			   intfObj.showEmployee();
			   break;
			
		    case 3:
			   System.out.print("Enter the Employee ID: ");
			   id=sn.nextInt();
			   intfObj.showEmployeeBasedOnId(id);
			   break;
				
		    case 4:
			   System.out.print("Enter Employee ID: ");
			   id=sn.nextInt();
			   System.out.print("Enter Employee Field Name that Need to Update(id/emp_name/salary/age/designation/role/gender/date_of_joining/manager_id/email/mobile: ");
			   field=sn.next();
			   System.out.print("Enter New " + field + " To Update: ");
			   value=sn.next();
			   intfObj.updateEmployee(id, field, value);
			   break;
				
		    case 5:
			   System.out.print("Enter Employee ID: ");
			   id=sn.nextInt();
			   intfObj.deleteEmployee(id);
			   break;
				
		    case 6:
			   System.out.println("Thank you using our Application!!!");
			   System.exit(0);
				
		    default:
			   System.out.println("Kindly Enter the Valid Choice Number!");
		    }
			
	    }while(true);
	  }
	}

}
