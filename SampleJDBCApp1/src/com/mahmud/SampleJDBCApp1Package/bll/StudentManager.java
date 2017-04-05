/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package.bll;

import java.util.List;

import com.mahmud.SampleJDBCApp1Package.dal.StudentGateway;
import com.mahmud.SampleJDBCApp1Package.models.StudentDAO;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class StudentManager {
	
	private StudentGateway aStudentGatewayObj = new StudentGateway();

	/**
	 * 
	 */
	public StudentManager() {
		// TODO Auto-generated constructor stub
	}
	
	public String saveStudent(StudentDAO student){
		if(aStudentGatewayObj.insertStudent(student) > 0) {
			return "Student : " + student.getName() 
			+ " has been SAVED successfully"; 
		}
		
		return "Could not SAVE student : " + student.getName();
	}
	
	public List<StudentDAO> getAllStudents(){
		return aStudentGatewayObj.selectAllStudents();
	}
	
	public StudentDAO getStudentByName(String name){
		return aStudentGatewayObj.selectStudentByName(name);
	}
	
	public String editStudent(StudentDAO student){
		if(aStudentGatewayObj.updateStudentById(student) > 0) {
			return "Student : " + student.getName() 
			+ " has been UPDATED successfully"; 
		}
		
		return "Could not UPDATE student : " + student.getName();
	}
	
	public String removeStudent(int student_id, String name){
		if(aStudentGatewayObj.deleteStudentById(student_id) > 0) {
			return "Student : " + name 
			+ " has been REMOVED successfully"; 
		}
		
		return "Could not REMOVE student : " + name;
	}

}
