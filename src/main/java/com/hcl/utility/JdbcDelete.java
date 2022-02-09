package com.hcl.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDelete {
	
	public static boolean deleteQuery(int empId) {
		
		
		String SQL = "DELETE FROM employee WHERE empId = " + empId;

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/emp_db", "root", "pwd1564");
				PreparedStatement ps = conn.prepareStatement(SQL)) {

			
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
