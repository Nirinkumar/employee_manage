package com.employeemanage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInterfImplem implements EmployeeInterf{
	
	Connection conn;

	public void createEmployee(Employee emp) {
		conn=JDBCConnection.createDBConnection();
		String query="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement pstm=conn.prepareStatement(query);
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setDouble(3, emp.getSalary());
			pstm.setInt(4, emp.getAge());
			pstm.setString(5, emp.getDesignation());
			pstm.setString(6, emp.getRole());
			pstm.setString(7, emp.getGender());
			pstm.setString(8, emp.getJoinDate());
			pstm.setInt(9, emp.getManagerId());
			pstm.setString(10, emp.getEmail());
			pstm.setLong(11, emp.getMobile());
			
			int check=pstm.executeUpdate();
			
			if(check!=0) {
				System.out.println("Employee Details Inserted Successfully!!!");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showEmployee() {
		conn=JDBCConnection.createDBConnection();
		String query="select * from employee";
//		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
//		System.out.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","ID", "Name", "Salary   ", "Age", "Designation   ", "Role   ", "Gender   ", "Date_of_Joining   ", "Manager_ID   ", "Email   ", "Mobile");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		try{
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
//				System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getDouble(3) +" "+ rs.getInt(4));
				System.out.format("%d\t%s\t%f\t%d\t%s\t%s\t%s\t%s\t%d\t%s\t%d\n",rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10), rs.getLong(11));
			}
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		} catch(Exception e) {
			e.printStackTrace();
		    }
	     }

	
	public void showEmployeeBasedOnId(int id) {
		conn=JDBCConnection.createDBConnection();
		String query="select * from employee where id="+id;
//		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
//		System.out.format("%s\t%s\t%s\t%s\n","ID", "Name", "Salary   ", "Age");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		try{
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t%s\t%s\t%s\t%s\t%d\t%s\t%d\n",rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10), rs.getLong(11));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void updateEmployee(int id, String field, String value) {
		conn=JDBCConnection.createDBConnection();
		String query="update employee set " + field +"='" + value + "' where id=" +id;
		//System.out.println(query);
		try {
			Statement stm=conn.createStatement();
			int status=stm.executeUpdate(query);
			if(status!=0) {
				System.out.println("Employee Details Updated Successfully!!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int id) {
		conn=JDBCConnection.createDBConnection();
		String query="delete from employee where id="+id;
//		System.out.println(query);
		try {
			Statement stm=conn.createStatement();
			int status=stm.executeUpdate(query);
			if(status!=0) {
				System.out.println("Employee Has Been Deleted Successfully!!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
