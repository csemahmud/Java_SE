/**
 * 
 */
package com.mahmud.StudentDBWebAppPackage.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mahmud.StudentDBWebAppPackage.models.StudentDAO;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class StudentGateway extends RootGateway {

	/**
	 * 
	 */
	public StudentGateway() {
		// TODO Auto-generated constructor stub
	}
	
	public long insertStudent(StudentDAO student) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO: handle exception
			System.err.println(e);
			//System.exit(-1);
		}
		String sql = 
				"INSERT INTO tbl_student (name, reg_no, age, cgpa) VALUES (?, ?, ?, ?)";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {
			
			/*if(conn != null){
				System.out.println("\n\n\n\tDatabase is connected successfully");
			}*/
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setString(2, student.getRegNo());
			statement.setString(3, Integer.toString(student.getAge()));
			statement.setString(4, Double.toString(student.getCgpa()));
			return statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -10;
	}

}
