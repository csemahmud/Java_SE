/**
 * 
 */
package com.mahmud.BS01NumLiteralsAppPackage;

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
		
		long creditCardNumber = 1234_5678_9012_3456L;
		System.out.println("\tcreditCardNumber = " 
				+ creditCardNumber);
		
		// creditCardNumber = (long)12345678901;
		// creditCardNumber = 12345678901;
		// Compiler Error
		// The literal 12345678901 of 
		// type int is out of range 
		
		long socialSecurityNumber = 999_99_9999L;
		System.out.println("\tsocialSecurityNumber = "
				+ socialSecurityNumber);
		
		float pi =  3.14_15F;
		System.out.println("\tpi = " + pi);
		
		long hexBytes = 0xFF_EC_DE_5E;
		System.out.println("\thexBytes = " + hexBytes);
		System.out.printf("\thexBytes = %x%n", hexBytes);
		
		hexBytes = -hexBytes;
		System.out.println("\t(-1) * hexBytes = " + hexBytes);
		System.out.printf("\t(-1) * hexBytes = %x%n", hexBytes);
		
		long hexWords = 0xCAFE_BABE;
		System.out.println("\thexWords = " + hexWords);
		System.out.printf("\thexWords = %x%n", hexWords);
		
		hexWords = -hexWords;
		System.out.println("\t(-1) * hexWords = " + hexWords);
		System.out.printf("\t(-1) * hexWords = %x%n", hexWords);
		
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		System.out.println("\tmaxLong = " + maxLong);
		System.out.printf("\tmaxLong = %x%n", maxLong);
		
		byte nybbles = 0b0010_0101;
		System.out.println("\tnybbles = " + nybbles);
		System.out.println("\tnybbles = " 
				+ Integer.toBinaryString(nybbles));
		
		long bytes = 0b11010010_01101001_10010100_10010010;
		System.out.println("\tbytes = " + bytes);
		System.out.println("\tbytes = " 
				+ Long.toBinaryString(bytes));
		
		int octaclTen = 012;
		System.out.println("\toctaclTen = " + octaclTen
				+ " = " 
				+ Integer.toOctalString(octaclTen));
		
		// Invalid: cannot put underscores
		// adjacent to a decimal point
		// float pi1 = 3_.1415F;
		// Invalid: cannot put underscores 
		// adjacent to a decimal point
		// float pi2 = 3._1415F;
		// Invalid: cannot put underscores 
		// prior to an L suffix
		// long socialSecurityNumber1 = 999_99_9999_L;

		// OK (decimal literal)
		int x1 = 5_2;
		System.out.println("\tx1 = " + x1);
		// Invalid: cannot put underscores
		// At the end of a literal
		// int x2 = 52_;
		// OK (decimal literal)
		int x3 = 5_______2;
		System.out.println("\tx3 = " + x3);

		// Invalid: cannot put underscores
		// in the 0x radix prefix
		// int x4 = 0_x52;
		// Invalid: cannot put underscores
		// at the beginning of a number
		// int x5 = 0x_52;
		// OK (hexadecimal literal)
		long x6 = 0xF_5_2_A; 
		System.out.println("\tx6 = " + x6);
		System.out.printf("\tx6 = %x%n", x6);
		// Invalid: cannot put underscores
		// at the end of a number
		// int x7 = 0x52_;
		// Invalid: cannot put underscores
		// at the beginning of a number
		// int x8 = _1_000_000;

		// Won't compile because of comma
		// int x9 = 10,000;
		
		char letterM = '\u004D';
		System.out.println("\tletterM = " + letterM);
		char ch = 65535;
		System.out.println("\tch = " + ch);
		char ch2 = (char) 65536;
		System.out.println("\tch2 = " + ch2);
	}

}
