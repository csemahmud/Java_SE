/**
 * 
 */
package com.mahmud.CL09ObjectOrderAppPackage;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.mahmud.CL09ObjectOrderAppPackage.classes.Employee;
import com.mahmud.CL09ObjectOrderAppPackage.classes.Name;

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
	
	public static final Name NAMEARRAY[] = {
            new Name("Mahmudul", "Hasan"),
            new Name("Alia", "Khan"),
            new Name("Mahmudul", "Hasan"),
            new Name("Shraddha", "Kapoor"),
            new Name("Alia", "Bhatt"),
            new Name("Puja", "Bhatt")
        };
	
	public static final Collection<Employee> EMPLOYEES 
				= Arrays.asList(
						new Employee(NAMEARRAY[0], 5, 
								LocalDate.of(2014, Month.MAY, 5)),
						new Employee(NAMEARRAY[1], 2, 
								LocalDate.of(2014, Month.AUGUST, 10)),
						new Employee(NAMEARRAY[2], 3, 
								LocalDate.of(2014, Month.AUGUST, 10)),
						new Employee(NAMEARRAY[3], 3, 
								LocalDate.of(2014, Month.AUGUST, 10)),
						new Employee(NAMEARRAY[4], 4, 
								LocalDate.of(2015, Month.FEBRUARY, 20)),
						new Employee(NAMEARRAY[5], 1, 
								LocalDate.of(2015, Month.APRIL, 25)));

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");

        List<Name> names = Arrays.asList(NAMEARRAY);
        Collections.sort(names);
        System.out.println("\tnames : " + names);
        List<Employee> employeeList = new ArrayList<>(EMPLOYEES);
        Collections.sort(employeeList);
        System.out.println("\n\tAfter Sorting, employeeList : ");
        for (Employee employee : employeeList) {
			System.out.println("\t" + employee);
		}
        
        Collections.sort(employeeList, Employee.SENIORITY_ORDER);
        System.out.println("\n\tAfter Sorting by SENIORITY_ORDER, employeeList : ");
        for (Employee employee : employeeList) {
			System.out.println("\t" + employee);
		}

	}

}
