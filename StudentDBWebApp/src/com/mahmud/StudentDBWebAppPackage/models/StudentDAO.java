/**
 * 
 */
package com.mahmud.StudentDBWebAppPackage.models;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class StudentDAO {
	
	private int studentID;
	private String name;
	private String regNo;
	private double cgpa;
	private int age;

	/**
	 * @param studentID
	 * @param name
	 * @param regNo
	 * @param cgpa
	 * @param age
	 */
	public StudentDAO(int studentID, String name, String regNo, double cgpa, int age) {
		this(name,regNo,cgpa,age);
		this.studentID = studentID;
	}

	/**
	 * @param name
	 * @param regNo
	 * @param cgpa
	 * @param age
	 */
	public StudentDAO(String name, String regNo, double cgpa, int age) {
		this();
		this.name = name;
		this.regNo = regNo;
		this.cgpa = cgpa;
		this.age = age;
	}

	/**
	 * 
	 */
	public StudentDAO() {
		// TODO Auto-generated constructor stub
		this.studentID = 0;
	}

	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the regNo
	 */
	public String getRegNo() {
		return regNo;
	}

	/**
	 * @param regNo the regNo to set
	 */
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}

	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentDAO [name=").append(name).append(", regNo=").append(regNo).append(", cgpa=").append(cgpa)
				.append(", age=").append(age).append("]");
		return builder.toString();
	}

}
