/**
 * 
 */
package com.mahmud.OC018TryPkg;

import java.util.Random;

// import java.io.IOException;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class MyException extends Exception {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -3005724558073978687L;
		private static final String MESSAGE
				= "Message from MyException";

		/**
		 * 
		 */
		public MyException() {
			// TODO Auto-generated constructor stub
			
			this(MESSAGE);
		}

//		/**
//		 * @param message
//		 */
//		public MyException(String message) {
//			super(message, new MyException());
//			// TODO Auto-generated constructor stub
//		}
		
		// Causes Stack OverFlow Exception
		
		/**
		 * @param message
		 */
		public MyException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class MyError extends Error {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 835426968772214398L;
		private static final String MESSAGE
				= "Message from MyError";

		/**
		 * 
		 */
		public MyError() {
			// TODO Auto-generated constructor stub
			
			this(MESSAGE);
		}
		
		/**
		 * @param message
		 */
		public MyError(String message) {
			super(message);
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
		
//		try {
//			method1();
//		}  catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Compiler Error
		// Unreachable catch block for 
		// MainProgram.MyException. 
		// It is already handled by the catch block 
		// for Exception
		
//		try {
//			method1();
//		}  catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Compiler Error
		// Unreachable catch block for IOException. 
		// This exception is never thrown from the 
		// try statement body
		
		try {
			System.out.println("\tInside main()");
			method1();
		}  catch (MyException ex) {
			// TODO Auto-generated catch block
			
			System.err.println("\t" + ex.getMessage());
		}
		
//		try {
//			System.out.println("\tInside main()");
//			method1();
//		} finally {
//			
//		}
		
		// Compiler Error
		// Unhandled exception type 
		// MainProgram.MyException

		System.out.println();
		try {
			badMethod();	
		} catch (Exception | Error e) {
			// TODO: handle exception
			
			System.out.println("\t" + e + " :\n\t" 
					+ e.getMessage());
            
            StackTraceElement elements[] = e.getStackTrace();
            for (StackTraceElement stackTraceElement : elements) {
            	System.out.println("\t" 
            			+ stackTraceElement.getFileName()
                        + ":" + stackTraceElement.getLineNumber() 
                        + ">> "
                        + stackTraceElement.getMethodName() + "()");
			}
		}
	}

	private static void badMethod() {
		// TODO Auto-generated method stub
		
		doStuff();
	}

	private static void doStuff() {
		// TODO Auto-generated method stub
		
		try{
			int rndInt = new Random().nextInt(2);
			int result = 10 / rndInt;
			System.out.printf("\t%d / %d = %d%n",
					10, rndInt, result);
			MainProgram x = new MainProgram();
			throw x.new MyError();
		} catch (Error me) {
			throw me;
		}
	}

	private static void method1() throws MyException {
		// TODO Auto-generated method stub
//		try (BufferedReader bufferedReader =
//                new BufferedReader(new FileReader(""))) {
//			
//			method2();
//			
//		}
		
		// Finally not required
		// Only for try with resources
		
		try {
			
			System.out.println("\tCalling method1() .....");
			method2();
			
		} finally {
			System.out.println("\tFinally is required");
		}
	}

	private static void method2() throws MyException {
		// TODO Auto-generated method stub
		
		System.out.println("\tCalling method2() .....");
		
		String string = " I am Mahmud"; 
		// String reverseStr = '\t';
		// Compiler Error
		// Type mismatch: cannot 
		// convert from char to String
		String reverseStr = null;
		
		for(int i = string.length() - 1; i >=0; i--)
			reverseStr += string.charAt(i);
		reverseStr = '\t' + reverseStr;		
		reverseStr += 321;
		
		System.out.println(reverseStr);
		
		MainProgram x = new MainProgram();
		throw x.new MyException();
	}

}
