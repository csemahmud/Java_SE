/**
 * 
 */
package com.mahmud.OC013EqualityPkg;

import java.util.Arrays;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private enum Color {
		RED, BLUE
	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private static class ColorClass {
		
		public static final ColorClass RED, BLUE;
		
		private final String name;
		private final int index;
		private static int staticIndex;
		private static final ColorClass[] values;
		
		static {
			values = new ColorClass[1000];
			RED = new ColorClass("RED");
			BLUE = new ColorClass("BLUE");
		}

		/**
		 * @param name
		 */
		private ColorClass(String name) {
			super();
			this.name = name;
			index = staticIndex++;
			values[index] = this;
		}

		/**
		 * @return the values
		 */
		public static final ColorClass[] getValues() {
			final ColorClass[] copyValues =
					Arrays.copyOfRange(values, 0, staticIndex);
			return copyValues;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return name;
		}

	}

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
			builder.append("Person [getFirstName()=")
			.append(getFirstName())
			.append(", getLastName()=")
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
		
		MainProgram x = new MainProgram();
		Person person1 = x.new Person();
		Person person2 = x.new Person();
		Person person3 = person1;
		
		String string1 = "Bob";
		String string2 = "Bob";
		String string3 = "bob";
		
		Color color1 = Color.RED;
		Color color2 = Color.RED;
		
		ColorClass colorClass1 = ColorClass.RED;
		ColorClass colorClass2 = ColorClass.RED;

		System.out.printf(
				"\tperson1.equals(person2) = %b%n",
				person1.equals(person2));
		System.out.printf(
				"\tperson1.equals(person3) = %b%n",
				person1.equals(person3));
		
		System.out.println();
		
		System.out.printf(
				"\tstring1.equals(string2) = %b%n",
				string1.equals(string2));
		System.out.printf(
				"\tstring1.equals(string3) = %b%n",
				string1.equals(string3));
		System.out.printf(
				"\tstring1.equalsIgnoreCase(string3) = %b%n",
				string1.equalsIgnoreCase(string3));

		System.out.println();
		
		System.out.printf(
				"\tcolor1 == color2 : %b%n",
				color1 == color2);
		System.out.printf(
				"\tcolor1.equals(color2) = %b%n",
				color1.equals(color2));

		System.out.println();
		
		System.out.printf(
				"\tcolorClass1 == colorClass2 : %b%n",
				colorClass1 == colorClass2);
		System.out.printf(
				"\tcolorClass1.equals(colorClass2) = %b%n",
				colorClass1.equals(colorClass2));
		
		System.out.println("\tElements of ColorClass are : ");
		for (ColorClass colorClass : ColorClass.getValues()) {
			System.out.print("\t" + colorClass);
		}
		System.out.println();
	}

}
