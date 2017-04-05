/**
 * 
 */
package com.mahmud.StudentDBWebAppPackage.bll;

import com.mahmud.StudentDBWebAppPackage.dal.StudentGateway;
import com.mahmud.StudentDBWebAppPackage.models.StudentDAO;

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
	
	public long saveStudent(StudentDAO student){
		return aStudentGatewayObj.insertStudent(student);
	}

}
