/**
 * 
 */
package com.mahmud.BS04InstanceOfAppPackage;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	public class Other {

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	public interface AnOther {

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Child extends Parent implements MyInterface {

		/**
		 * 
		 */
		public Child() {
			// TODO Auto-generated constructor stub
		}

		public void printChild(){
			System.out.println("\tI am Child");
		}
	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Parent {

		/**
		 * 
		 */
		public Parent() {
			// TODO Auto-generated constructor stub
		}

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private interface MyInterface {

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
		
		MainProgram x = new MainProgram();
		Parent parent = x.new Parent();
        Parent child = x.new Child();

        System.out.println("\tparent instanceof Parent: "
            + (parent instanceof Parent));
        System.out.println("\tparent instanceof Child: "
            + (parent instanceof Child));
        System.out.println("\tparent instanceof MyInterface: "
            + (parent instanceof MyInterface));
        System.out.println("\tchild instanceof Parent: "
            + (child instanceof Parent));
        System.out.println("\tchild instanceof Child: "
            + (child instanceof Child));
        System.out.println("\tchild instanceof MyInterface: "
            + (child instanceof MyInterface));

        System.out.println(); 
        printValue(child);
        

//        System.out.println("\tchild instanceof MyInterface: "
//            + (child instanceof Other));
        // Compiler Error 
        // Incompatible conditional operand types 
        // MainProgram.Parent and MainProgram.Other
        
        System.out.println("\tchild instanceof AnOther: "
                + (child instanceof AnOther));
        
        System.out.println("\tAfter setting child as null,");
        child = null;
        System.out.println("\tchild instanceof Object: "
                + (child instanceof Object));
        
        System.out.println();
        
        int integer = 10;
//        System.out.println(
//        		"\tinteger instanceof Integer: "
//                + (integer instanceof Integer));
     // Compiler Error 
     // Incompatible conditional operand types 
     // Incompatible conditional operand types 
     // int and Integer
        
        System.out.println(
        		"\tInteger.valueOf(integer) instanceof Integer: "
                + (Integer.valueOf(integer) instanceof Integer));
        
        int[] integerArray = new int[3];
        System.out.println(
        		"\tintegerArray instanceof Object: "
                + (integerArray instanceof Object));
	}

	private static void printValue(Parent parent) {
		// TODO Auto-generated method stub
		
		if(parent instanceof Child){
			((Child) parent).printChild();
			System.out.println(
					"\tparent refers to child");
		}
	}

}
