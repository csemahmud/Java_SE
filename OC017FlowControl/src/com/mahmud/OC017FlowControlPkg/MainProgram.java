/**
 * 
 */
package com.mahmud.OC017FlowControlPkg;

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		int x = 0, y = 0, z = 0, a;
		
		if(x > 3)
			y = 2;
		z += 8;
		a = x + y + z;
		System.out.printf("\t%d + %d + %d = %d%n",
				x, y, z, a);
		
		boolean done;
		int getScore = 80;
		if(done = false)
			if(getScore < 61)
				System.out.println("\tTry again");
				// System.out.println("\tTry again");
				// Compiler Error
				// Syntax error on token "else"
			else if(getScore < 81)
				System.out.println("\tPassed");
			else
				System.out.println("\tJava Master");
		else
			System.out.println("\tExam is going on .....");
		
		done = true;
		
		if(done)
			if(getScore < 61)
				System.out.println("\tTry again");
			else if(getScore < 81)
				System.out.println("\tPassed");
			else
				System.out.println("\tJava Master");
		else
			System.out.println("\tExam is going on .....");
		

//		if(getScore = 0)
//			System.out.println("\tyour score is 0");
		
		// Compiler Error
		// Type mismatch: cannot convert 
		// from int to boolean
		
		getScore = 0;
		if(getScore == 0)
			System.out.println("\tgetScore = 0");
		
		x = y = 50;
		done = true;
		
		if(((x > 0) && (y < 100)) | (done = false))
			System.out.printf("\tdone = %b%n", done);

		if(((x > 0) && (y < 100)) || (done = true))
			System.out.printf("\tdone = %b%n", done);
		
		System.out.println();
		
		byte b = (byte) 170;
		switch(b){
			
		// case 170:
		// Compiler Error 
		// Type mismatch: cannot convert from int to byte
		
		case (byte) 170: {
			
		}
		
		// case 23:
		// Compiler Error : Duplicate Case
			
		case 23: {
			
			System.out.println("\tb = " + b);
		}
		
		default: {
			
			System.out.println(
					"\tDefault is also executed");
		}			
		}
		
//		switch(b){
//		
//		case (byte) 170 {
//			
//		}			
//		case 23 {
//			
//			System.out.println("\tb = " + b);
//		}		
//		default {
//			
//			System.out.println(
//					"\tDefault is also executed");
//		}			
//		}
		
		// Compiler Error
		// Syntax error, insert ":" to complete SwitchLabel
		
//		switch(b){
//		
//		(byte) 170: {
//			
//		}			
//		23: {
//			
//			System.out.println("\tb = " + b);
//		}		
//		default: {
//			
//			System.out.println(
//					"\tDefault is also executed");
//		}			
//		}
		
		// Compiler Error
		// Syntax error on token "{", 
		// case expected after this token
		
		String month = "March";
		System.out.print("\t");
		switch(month){
		case "MARCH":
			System.out.print("MARCH, ");
		default:
			System.out.print("default, ");
		case "APRIL":
			System.out.print("APRIL, ");
		case "MAY":
			System.out.print("MAY, ");
		case "March":
			System.out.print("March");
		}
		
		System.out.println();
		System.out.print("\t");
		
		switch(month.toLowerCase()){
		case "MARCH":
			System.out.print("MARCH, ");
		default:
			System.out.print("default, ");
		case "APRIL":
			System.out.print("APRIL, ");
		case "MAY":
			System.out.print("MAY, ");
		case "March":
			System.out.print("March");
		}
		
		System.out.println("\n");
		System.out.print("\t");
		
		
		// double i = 0, j = 0;
		
		// Compiler Error
		// Duplicate local variable i
		// Duplicate local variable j
		
		for(double i = 0, j = 5;; j++, i+=j){
			System.out.printf("(%.0f,%.0f), ", i, j);
			if(i > 30)
				break;
		}
		// System.out.printf("(%.0f,%.0f), ", i, j);
		// Compiler Error
		// i cannot be resolved to a variable
		// j cannot be resolved to a variable
		
		System.out.println();
		System.out.print("\t");
		
		double i, j;
		
		for(i = 0, j = 5;; j++, i+=j){
			System.out.printf("(%.0f,%.0f), ", i, j);
			if(i > 30)
				break;
		}
		
		System.out.printf("(%.0f,%.0f)", i, j);
		
//		for(i = 0, j = 0; (i < 10) , (j < 15); i++, j+=2){
//			
//		}
		
		// Compiler Error
		// The left-hand side of 
		// an assignment must be a variable
	}

}
