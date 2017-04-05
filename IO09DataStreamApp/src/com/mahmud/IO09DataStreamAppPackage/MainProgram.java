/**
 * 
 */
package com.mahmud.IO09DataStreamAppPackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private static final String DATAFILE = "docs/invoicedata.txt";

	private static final double[] PRICES = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	private static final int[] UNITS = { 12, 8, 13, 29, 50 };
	private static final String[] DESCS = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};

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
		
		double price;
		int unit;
		String desc;
		double total = 0.0;
		
		try(DataOutputStream outputFile = new DataOutputStream(
				new BufferedOutputStream(
				          new FileOutputStream(DATAFILE)))) {
			
			for (int i = 0; i < PRICES.length; i ++) {
				outputFile.writeDouble(PRICES[i]);
				outputFile.writeInt(UNITS[i]);
				outputFile.writeUTF(DESCS[i]);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(DataInputStream inputFile = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(DATAFILE)))) {
			
			while (true) {
		        price = inputFile.readDouble();
		        unit = inputFile.readInt();
		        desc = inputFile.readUTF();
		        System.out.format("\tYou ordered %d" 
		        		+ " units of %s at $%.2f%n",
		        		unit, desc, price);
		        total += unit * price;
		    }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.format("%n%n\ttotal = $%.2f%n", total);

	}

}
