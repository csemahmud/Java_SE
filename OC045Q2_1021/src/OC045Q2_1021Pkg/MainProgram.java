/**
 * 
 */
package OC045Q2_1021Pkg;

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
		String string = "hello";
		StringBuilder stringBuilder
			= new StringBuilder(string);
		String reverseString = "";
		
		stringBuilder.reverse();
		// reverseString = string.reverse();
		// Compilation Error
		// The method reverse() is undefined 
		// for the type String
		
		for(int i = string.length() - 1; i >= 0; i-- ) {
			reverseString += string.charAt(i);
		}
		
		System.out.println("\t" + reverseString 
				+ " : " + stringBuilder);
		
		if(reverseString.equals(stringBuilder)){
			System.out.println(
					"\treverseString.equals(stringBuilder)");
		} else if(reverseString.equals(
				stringBuilder.toString())) {
			System.out.println(
					"\treverseString.equals(" 
					+ "stringBuilder.toString())");
		}
	}

}