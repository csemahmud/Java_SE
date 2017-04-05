/**
 * 
 */
package com.mahmud.DatabaseConectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_test", "root", "");) {
			
			// System.out.println("Connection Succeed");
			String query = "SELECT * FROM tbl_student";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("\tId\tName\tAge\tCGPA\tClass");
			while(rs.next()){
				System.out.println("\t"
						+ rs.getInt("student_id")
						+ "\t" + rs.getString("name")
						+ "\t" + rs.getInt("age")
						+ "\t" + rs.getDouble("cgpa")
						+ "\t" + rs.getInt("s_class"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}

	}

}
