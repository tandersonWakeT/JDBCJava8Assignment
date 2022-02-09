package com.hcl.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hcl.entity.Employee;

public class JdbcSelect {
	
	//private String SQL = "";
	
	public static List<Employee> selectQuery(String query) {
		
		String SQL = query;
		List<Employee> returnedEmps = new ArrayList<>();
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/emp_db", "root", "pwd1564");
				PreparedStatement ps = conn.prepareStatement(SQL)) {
			
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()) {
				
				Employee emp = new Employee();
				
				emp.setEmpId(rs.getInt("EmpId"));
				emp.setEmpName(rs.getString("EmpName"));
				emp.setDOB(rs.getString("DOB"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setAge(rs.getInt("Age"));
				
				returnedEmps.add(emp);
			}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnedEmps;
	}
}
