package com.hcl.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdate {

	public static boolean updateQuery(int empId, String empName, String DOB, int salary, int age) {
		
		String SQL = "UPDATE employee " + "SET EmpName = '" + empName + "', DOB = '" + DOB + "', Salary = " + salary 
				+ ", Age = " + age
				+ " WHERE EmpId = " + empId;

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/emp_db", "root", "pwd1564");
				PreparedStatement ps = conn.prepareStatement(SQL)) {

			//ps.setInt(1, EmpId);
//			ps.setString(1, empName);
//			ps.setString(2, DOB);
//			ps.setInt(3, salary);
//			ps.setInt(4, age);
			
			ps.executeUpdate();
			
			return true;
		}
		catch(SQLException e) {
	
			e.printStackTrace();
		}
		catch(Exception e) {
	
			e.printStackTrace();
		}
		return false;
	}
}
