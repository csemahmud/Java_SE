/**
 * 
 */
package com.mahmud.OC016SBEncapsulationPkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Special {
		
		private final StringBuilder name;
		private final String name2;

		/**
		 * 
		 */
		public Special() {
			// TODO Auto-generated constructor stub
			
			name = new StringBuilder("Mahmudul");
			name2 = "Alia";
		}

		/**
		 * @return the name
		 */
		public synchronized final StringBuilder getName() {
			return name;
		}

		/**
		 * @return the name2
		 */
		public synchronized final String getName2() {
			return name2;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Special [name=").append(name)
			.append(", name2=").append(name2).append("]");
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
		
		MainProgram x = new MainProgram();
		Special special = x.new Special();
		final StringBuilder name = special.getName();
		String name2 = special.getName2();
		name2 += " Bhatt";
		name.append(" Hasan");
		System.out.println("\t" + special);
		System.out.println("\tname2 = " + name2);
	}

}
