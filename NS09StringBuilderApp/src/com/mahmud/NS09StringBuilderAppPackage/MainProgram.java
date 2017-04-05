/**
 * 
 */
package com.mahmud.NS09StringBuilderAppPackage;

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
		BLACK, RED, BLUE, SILVER, GOLDEN_RED
	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Car {
		

		private String name;
		private Double speed;
		private Double price;
		private Color color;

		/**
		 * @param name
		 * @param speed
		 * @param price
		 * @param color
		 */
		public Car(String name, Double speed, Double price, Color color) {
			this();
			this.name = name;
			this.speed = speed;
			this.price = price;
			this.color = color;
		}

		/**
		 * 
		 */
		public Car() {
			// TODO Auto-generated constructor stub
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Car [name=").append(name).append(", speed=").append(speed).append("kph, price=").append(price)
					.append("$, color=").append(color).append("]");
			return builder.toString();
		}

	}
	
	private static Car car;

	/**
	 * @param name
	 * @param speed
	 * @param price
	 * @param color
	 */
	public MainProgram(String name, Double speed, Double price, Color color) {
		// TODO Auto-generated constructor stub
		car = new Car(name, speed, price, color);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n");
		displayPelindrome("dot saw I was tod");
		displayPelindrome("Mahmudul Hasan Khan");
		
		int initCapacity = 100;
		StringBuilder stringBuilder = new StringBuilder(initCapacity);
		System.out.print("\n\tstringBuilder initial capacity() = " + stringBuilder.capacity());
		
		double result = 3 + Math.PI;
		char[] characterArray = {'M', 'a', 'h', 'm', 'u', 'd'};
		new MainProgram("Lamborghini", 500.0, 100000.0, Color.GOLDEN_RED);
		double sum = 2.5 + 2;
		
		stringBuilder.append(3)
		.append('+').append(Math.PI).append(" == ")
		.append(result).append(" => ")
		.append(3 + Math.PI == result).append(";\n\t")
		.append(-10f).append('*').append(2.5f)
		.append(" == ").append(25f).append(" => ")
		.append(-10f * 2.5f == 25f)
		.append(";\n\tcharacterArray = ")
		.append(characterArray).append(";\n\t")
		.append(car)
		.insert(0, ";\n\t").insert(0, 2.5 + 2 == sum)
		.insert(0, " => ").insert(0, 2.5 + 2)
		.insert(0, " == ").insert(0, 2.5).insert(0, '+')
		.insert(0, 2).insert(0, "stringBuilder = {\n\t")
		.append(";\n\tR")
		.setCharAt(stringBuilder.length()-1, '}');
		
		// Return type is void
		
		stringBuilder.append(";\tcapacity = ")
		.append(stringBuilder.capacity())
		.append(";\tlength() = ;");
		
		long length = stringBuilder.length();
		length += Long.toString(length).length();
		stringBuilder.insert(stringBuilder.length() - 1, length);
		
		System.out.println("\n\t" + stringBuilder);
		
		stringBuilder.delete(
				stringBuilder.indexOf("{") + 1, 
				stringBuilder.indexOf("}"));
		
		String lengthStr = Long.toString(length);
		
		stringBuilder.replace(stringBuilder.indexOf(lengthStr), 
				stringBuilder.indexOf(lengthStr) + lengthStr.length(), 
				Integer.toString(stringBuilder.length()));
		
		System.out.println("\n\tDeleting stringBuilder : \n\t"
				+ stringBuilder);
		
		stringBuilder.ensureCapacity(1000);
		stringBuilder.setLength(stringBuilder.indexOf("=") + 1);
		
		System.out.println("\n\tAfter Setting New Length : \""
				+ stringBuilder + "\"");
		System.out.println("\tNew Capacity = "
				+ stringBuilder.capacity());
		stringBuilder.deleteCharAt(stringBuilder.indexOf(" "));
		System.out.println("\tAfter Deleting \" \" : "
				+ stringBuilder );
		
		char[] charArray = new char[stringBuilder.length()];
		stringBuilder.getChars(0, stringBuilder.length(), 
				charArray, 0);
		System.out.println("\tThe characters are : ");
		System.out.print("\t{");
		for (char ch : charArray) {
			System.out.printf(" '%c',", ch);
		}
		System.out.println(" }");

	}

	private static void displayPelindrome(String string) {
		// TODO Auto-generated method stub
		
		System.out.print("\n\tGiven string : " + string);
		StringBuilder stringBuilder = new StringBuilder(string);
		if(stringBuilder.reverse().toString().equals(string)){
			System.out.println(" => is a pelindrome");
		} else {
			System.out.println(" => is NOT a pelindrome");
		}
		System.out.println("\tReverse String : " + stringBuilder);
	}

}
