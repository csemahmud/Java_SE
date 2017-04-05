/**
 * 
 */
package com.mahmud.StudentDBWebAppPackage.dal;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class RootGateway {
	
	protected final String DBURL;
	protected final String USERNAME;
	protected final String PASSWORD;

	/**
	 * 
	 */
	public RootGateway() {
		// TODO Auto-generated constructor stub
		
		DBURL = "jdbc:mysql://localhost:3306/db_student_db_web_app";
		USERNAME = "root";
		PASSWORD = "";
	}

}
