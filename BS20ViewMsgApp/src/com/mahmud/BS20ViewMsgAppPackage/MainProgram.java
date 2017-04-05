/**
 * 
 */
package com.mahmud.BS20ViewMsgAppPackage;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	public class Base {
		
		private final String message 
			= "Message from Base";

		/**
		 * 
		 */
		public Base() {
			// TODO Auto-generated constructor stub
		}
		
		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}

		public void viewMessage(){
			System.out.println("\t" + getMessage());
		}

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	public class Derived1 extends Base {
		
		private final String message 
			= "Message from Derived1";

		/**
		 * 
		 */
		public Derived1() {
			// TODO Auto-generated constructor stub
		}

		/* (non-Javadoc)
		 * @see com.mahmud.BS20ViewMsgAppPackage.MainProgram.Base#getMessage()
		 */
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return message;
		}

		/* (non-Javadoc)
		 * @see com.mahmud.BS20ViewMsgAppPackage.MainProgram.Base#viewMessage()
		 */
		@Override
		public void viewMessage() {
			// TODO Auto-generated method stub
			System.out.println("\t" + getMessage());
		}

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	public class Derived2 extends Derived1 {

		/**
		 * 
		 */
		public Derived2() {
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
		MainProgram x = new MainProgram();
		Base base = x.new Derived2();
		base.viewMessage();

	}

}
