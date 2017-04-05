/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package.dal;

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
		
		DBURL = "jdbc:mysql://localhost/db_test";
		USERNAME = "root";
		PASSWORD = "";
	}

}
