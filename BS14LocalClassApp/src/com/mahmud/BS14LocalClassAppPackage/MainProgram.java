/**
 * 
 */
package com.mahmud.BS14LocalClassAppPackage;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	private static final String regularExpression 
		= "[^0-9]";
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	private interface IPhoneNumber {
		String getNumber();
		void printOriginalNumbers();
	}
	  
	/**
	 * @param phoneNumber1
	 * @param phoneNumber2
	 */
    private static void validatePhoneNumber(
        String phoneNumber1, String phoneNumber2) {
      
        final int numberLength = 10;
        
        // Valid in JDK 8 and later:
       
        // int numberLength = 10;
       
        // Local Class is defined inside a method
    	
//    	/**
//    		 * @author Mahmudul Hasan Khan CSE
//    		 *
//    		 */
//    	interface IPhoneNumber {
//    		String getNumber();
//    		void printOriginalNumbers();
//    	}
    	
    	// Compiler Error
    	// The member interface IPhoneNumber 
    	// can only be defined inside a top-level 
    	// class or interface or in a static context
        
        /**
         * @author Mahmudul Hasan Khan CSE
         *
         */
        final class PhoneNumber implements IPhoneNumber {
            
            String formattedPhoneNumber = null;

            /**
        	 * @param phoneNumber
        	 */
            PhoneNumber(String phoneNumber){
                // numberLength = 7;
                String currentNumber = phoneNumber.replaceAll(
                  regularExpression, "");
                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

			@Override
			public String getNumber() {
				// TODO Auto-generated method stub
				return formattedPhoneNumber;
			}
			
			// Valid in JDK 8 and later:

			@Override
			public void printOriginalNumbers() {
				// TODO Auto-generated method stub
				
				System.out.println("\tOriginal numbers are " + phoneNumber1 +
	                    " and " + phoneNumber2);
			}
        }

        // Objects of Local Class
        
        IPhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        IPhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        
        // Valid in JDK 8 and later:

        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null) {
            System.out.println("\tFirst number is invalid");
        } else {
            System.out.println("\tFirst number is " + myNumber1.getNumber());
        }
        if (myNumber2.getNumber() == null) {
            System.out.println("\tSecond number is invalid");
        } else {
            System.out.println("\tSecond number is " + myNumber2.getNumber());
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
		
		validatePhoneNumber("123-456-7890", "456-7890");

	}

}
