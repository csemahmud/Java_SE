/**
 * 
 */
package com.mahmud.EX02DivideBy0AppPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private static final class FinishException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 8838298639074751229L;

		/**
		 * 
		 */
		public FinishException() {
			// TODO Auto-generated constructor stub
		}

	}

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
		
		try {
			
			System.out.println("\tIn Main() before methods");
			method1();
			System.out.println("\tIn Main() after methods");
			
		} catch (Exception ex) {
			// TODO: handle exception
			
			System.out.printf("\t%s%n\thandled in Main()%n", ex);
			System.out.printf("\tex.getMessage() = %s%n", 
					ex.getMessage());
			
			System.out.printf("\t%-45s\t%-16s\t%-4s\t%-7s%n",
					"Class", "File", "Line", "Method");
			
			for (StackTraceElement stackTraceElement : ex.getStackTrace()) {
				
				System.out.printf("\t%-45s\t%-16s\t%-4s\t%-7s%n",
						stackTraceElement.getClassName(),
						stackTraceElement.getFileName(),
						stackTraceElement.getLineNumber(),
						stackTraceElement.getMethodName());
				
			}
			
		} finally {
			
			System.out.println("\tFinally executed in Main()");
			
		}
	}

	private static void method1() throws Exception {
		// TODO Auto-generated method stub
		
		method2();
		
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		
		method3();
		
	}

	private static void method3() throws Exception {
		// TODO Auto-generated method stub
		
		try{
			method4();
		}catch (Exception ex) {
			// TODO: handle exception
			

			System.out.printf("\t%s%n\thandled in method3()%n", ex);
			throw new Exception("exception thrown from method3()",
					ex);
		}
		
	}

	private static void method4() throws Exception {
		// TODO Auto-generated method stub
		
		try{
			method5();
		}catch (Exception ex) {
			// TODO: handle exception
			

			System.out.printf("\t%s%n\thandled in method4()%n", ex);
			throw new Exception("exception thrown from method4()",
					ex);
		}
		
	}

	private static void method5() throws Exception {
		// TODO Auto-generated method stub
		
		int numerator = 0;
		int denominator = 0;
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("\tEnter an Integer numerator: ");
			numerator = scanner.nextInt();
			System.out.println();
			System.out.print("\tEnter an Integer denominator: ");
			denominator = scanner.nextInt();
			
			// if denominator == 0, then, divideByZero
			// Exception will be thrown
			
			int result = quotient(numerator, denominator);
			System.out.println();
			System.out.printf("\tresult = %d / %d = %d%n",
					numerator, denominator, result);
			throw new FinishException();
			
		} catch (ArithmeticException | InputMismatchException ex) {
			
			System.out.println();
			double result = numerator / (double) denominator;
			System.out.printf("\tresult = %d / %d = %f%n",
					numerator, denominator, result);
			System.out.printf("\t%s%n\thandled in method5()%n", ex);
			throw new Exception("exception thrown from method5()",
					ex);
			
			// TODO: handle exception
		} catch (Exception ex) {
			// TODO: handle exception
			
			System.out.printf("\t%s%n\thandled in method5()%n", ex);
			throw new Exception("exception thrown from method5()",
					ex);
		
		} finally {
			
			System.out.println("\tFinally executed in method5()");
			
		}
		
	}

	private static int quotient(int numerator, int denominator)
		throws ArithmeticException {
		// TODO Auto-generated method stub
		return numerator / denominator;
	}

}
