/**
 * 
 */
package com.mahmud.NS04CharacterAppPackage;

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
		
		char[] charArray = { 'S', 'h', 'e', ' ',  
				's', 'a', 'i', 'd', ' ', 
				'\"', 'H', 'e', 'l', 'l', 'o', '!', '\"', ' ',
				't', 'o', ' ', 'm', 'e', '.', '\n',
				'\t', 'C', 'O', 'D', 'E',  ':',
				'3', '5', '\u03A9'};
		
		String string = "";
		
		System.out.println("\n\n\n\tThe Characters in Array are : \n");
		
		boolean key = false;
		
		for (char ch : charArray) {
			Character character = new Character(ch);
			System.out.print("\t\'" + Character.toUpperCase(character)
					+ "\' -> \'" + Character.toLowerCase(character) + "\' : ");
			if(Character.isLetter(character)){
				System.out.print("Letter ");
			}
			
			if(Character.isDigit(character)){
				System.out.print("Digit ");
			}
			
			if(Character.isWhitespace(character)){
				System.out.print("Whitespace ");
			}
			
			if(Character.isUpperCase(character)){
				System.out.print("UpperCase ");
			}
			
			if(Character.isLowerCase(character)){
				System.out.print("LowerCase ");
			}
			
			string += character;
			
			// String s = character;
			// Compiler Error
			// Type mismatch: cannot 
			// convert from Character to String
			
			if(key){
				System.out.println();
			} else {
				System.out.print(";");
			}
			
			key = !key;
		}
		
		System.out.println("\n\tThe String is : \n\t" + string);

	}

}
