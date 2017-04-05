/**
 * 
 */
package com.mahmud.OC011GarbageColPkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Person {
		
		private final String firstName, lastName;

		/**
		 * @param firstName
		 * @param lastName
		 */
		public Person(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		/**
		 * 
		 */
		public Person() {
			// TODO Auto-generated constructor stub
			
			this("", "");
		}

		/**
		 * @return the firstName
		 */
		public synchronized final String getFirstName() {
			return firstName;
		}

		/**
		 * @return the lastName
		 */
		public synchronized final String getLastName() {
			return lastName;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Person [getFirstName()=").append(getFirstName()).append(", getLastName()=")
					.append(getLastName()).append("]");
			return builder.toString();
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
		Runtime runtime = Runtime.getRuntime();
		System.out.println("\tTotal JVM memory = "
				+ runtime.totalMemory());
		System.out.println("\tBefore Free memory = "
				+ runtime.freeMemory());
		
		Person person;
		MainProgram x;
		for(int i = 0; i < 10000; i++){
			x = new MainProgram();
			person = x.new Person();
			person.toString();
			// person = null;
			// x = null;
		}
		System.out.println("\tAfter Free memory = "
				+ runtime.freeMemory());
		
		runtime.gc();
		
		System.out.println("\tAfter GC memory = "
				+ runtime.freeMemory());
	}

}
