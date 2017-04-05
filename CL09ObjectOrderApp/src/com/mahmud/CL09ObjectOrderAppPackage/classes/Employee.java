/**
 * 
 */
package com.mahmud.CL09ObjectOrderAppPackage.classes;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Employee implements Comparable<Employee> {
	
	public static final Comparator<Employee> SENIORITY_ORDER = 
        new Comparator<Employee>() {
		public int compare(Employee junioremployee, Employee seniorEmployee) {
			int dateCmp = junioremployee.getHireDate().compareTo(seniorEmployee.getHireDate());
			if (dateCmp != 0) {
				return dateCmp;
			}
			
			return (seniorEmployee.getNumber() < junioremployee.getNumber() ? 1 :
					(seniorEmployee.getNumber() > junioremployee.getNumber() ? -1 : 0));
		}
	};
	
	private Name name;
	private int number;
	private LocalDate hireDate;

	/**
	 * @param name
	 * @param number
	 * @param hireDate
	 */
	public Employee(Name name, int number, LocalDate hireDate) {
		this();
		this.name = name;
		this.number = number;
		this.hireDate = hireDate;
	}

	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the hireDate
	 */
	public LocalDate getHireDate() {
		return hireDate;
	}

	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return name.compareTo(emp.getName());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", number=").append(number).append(", hireDate=")
				.append(hireDate).append("]");
		return builder.toString();
	}

}
