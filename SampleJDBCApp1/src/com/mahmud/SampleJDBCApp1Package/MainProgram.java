/**
 * 
 */
package com.mahmud.SampleJDBCApp1Package;

import java.util.List;

import com.mahmud.SampleJDBCApp1Package.bll.StudentManager;
import com.mahmud.SampleJDBCApp1Package.models.StudentDAO;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private static StudentManager aStudentManagerObj = new StudentManager();
	private static List<StudentDAO> allStudents;

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
		
		System.out.println("\n\n\n\t" + aStudentManagerObj.saveStudent(
				new StudentDAO("Mahmud", 25, 3.98, 10)));
		System.out.println("\t" + aStudentManagerObj.saveStudent(
				new StudentDAO("Alia", 20, 3.02, 8)));
		System.out.println("\t" + aStudentManagerObj.saveStudent(
				new StudentDAO("Karina", 22, 3.12, 9)));
		if(aStudentManagerObj.getStudentByName("Naila") == null){
			System.out.println("\t" + aStudentManagerObj.saveStudent(
					new StudentDAO("Naila", 20, 2.98, 7)));
		}
		
		allStudents = aStudentManagerObj.getAllStudents();
		
		printStudents();
		System.out.println();
		
		allStudents.stream().forEach(aStudent -> {
			if(aStudent.getName().equals("Mahmud")){
				aStudent.setCgpa(4.00);
				System.out.println("\t" + aStudentManagerObj.editStudent(
						aStudent));
				allStudents = aStudentManagerObj.getAllStudents();
			} else if (aStudent.getName().equals("Alia")) {
				aStudent.setAge(21);
				System.out.println("\t" + aStudentManagerObj.editStudent(
						aStudent));
				allStudents = aStudentManagerObj.getAllStudents();
			} else if (aStudent.getName().equals("Karina")) {
				aStudent.setS_class(10);
				System.out.println("\t" + aStudentManagerObj.editStudent(
						aStudent));
				allStudents = aStudentManagerObj.getAllStudents();
			}
		});
		
		printStudents();
		
		allStudents.stream().forEach(aStudent -> {
			if(aStudent.getName().equals("Karina")){
				System.out.println("\n\t" + aStudentManagerObj.removeStudent(
						aStudent.getStudent_id(), aStudent.getName()));
				allStudents = aStudentManagerObj.getAllStudents();
			}
		});
		
		printStudents();
		
		allStudents.stream().forEach(aStudent -> {
			if(aStudent.getName().equals("Alia")){
				System.out.println("\n\t" + aStudentManagerObj.removeStudent(
						aStudent.getStudent_id(), aStudent.getName()));
				allStudents = aStudentManagerObj.getAllStudents();
			}
		});
		
		allStudents.stream().forEach(aStudent -> {
			if(aStudent.getName().equals("Mahmud")){
				System.out.println("\t" + aStudentManagerObj.removeStudent(
						aStudent.getStudent_id(), aStudent.getName()));
				allStudents = aStudentManagerObj.getAllStudents();
			}
		});
		
		printStudents();

	}

	private static void printStudents() {
		// TODO Auto-generated method stub
		
		if(allStudents.size() > 0) {
			System.out.println("\n\tTotal "
					+ allStudents.size() + " Students Are : ");
			System.out.println("\n\tId\tName\tAge\tCGPA\tClass");
		
			allStudents.stream().forEach(aStudent -> {
				System.out.println(aStudent);
			});
		} else {
			System.out.println("\n\tNo student to show .....");
		}
	}

}
