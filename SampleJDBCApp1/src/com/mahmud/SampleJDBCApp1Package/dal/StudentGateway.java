/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mahmud.SampleJDBCApp1Package.models.StudentDAO;

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
	
	public int insertStudent(StudentDAO student) {
		String sql = 
				"INSERT INTO tbl_student (name, age, cgpa, s_class) VALUES (?, ?, ?, ?)";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {
			
			/*if(conn != null){
				System.out.println("\n\n\n\tDatabase is connected successfully");
			}*/
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setString(2, Integer.toString(student.getAge()));
			statement.setString(3, Double.toString(student.getCgpa()));
			statement.setString(4, Integer.toString(student.getS_class()));
			return statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -10;
	}
	
	public List<StudentDAO> selectAllStudents(){
		List<StudentDAO> allStudents = new ArrayList<>();
		String sql = 
				"SELECT * FROM tbl_student";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()){
				allStudents.add(new StudentDAO(
						result.getInt(1), result.getString("name"),
						result.getInt(3), result.getDouble("cgpa"),
						result.getInt("s_class")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allStudents;
	}
	
	public StudentDAO selectStudentByName(String name){
		StudentDAO selectedStudent = null;
		String sql = 
				"SELECT * FROM tbl_student WHERE name='" + name + "'";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			if(result.next()){
				selectedStudent = new StudentDAO(
						result.getInt("student_id"), result.getString(2),
						result.getInt("age"), result.getDouble(4),
						result.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return selectedStudent;
	}
	
	public int updateStudentById(StudentDAO student) {
		String sql = 
				"UPDATE tbl_student SET name=?, age=?, cgpa=?, s_class=? WHERE student_id=?";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {
			
			/*if(conn != null){
				System.out.println("\n\n\n\tDatabase is connected successfully");
			}*/
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setString(2, Integer.toString(student.getAge()));
			statement.setString(3, Double.toString(student.getCgpa()));
			statement.setString(4, Integer.toString(student.getS_class()));
			statement.setString(5, Integer.toString(student.getStudent_id()));
			return statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -10;
	}
	
	public int deleteStudentById(int student_id) {
		String sql = 
				"DELETE FROM tbl_student WHERE student_id=?";
		try(Connection conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD)) {
			
			/*if(conn != null){
				System.out.println("\n\n\n\tDatabase is connected successfully");
			}*/
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, Integer.toString(student_id));
			return statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -10;
	}

}
