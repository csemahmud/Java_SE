/**
 * 
 */
package com.mahmud.IO10ObjStreamAppPackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3166735119449563053L;

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Product implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 8286249210732569572L;
		
		private double price;
		private int unit;
		private String desc;

		public Product(double price, int unit, String desc) {
			this();
			this.price = price;
			this.unit = unit;
			this.desc = desc;
		}

		/**
		 * 
		 */
		public Product() {
			// TODO Auto-generated constructor stub
		}

		public double getPrice() {
			return price;
		}

		public int getUnit() {
			return unit;
		}

		@Override
		public String toString() {
			return String.format("\tYou ordered %d" 
	        		+ " units of %s at $%.2f%n",
	        		unit, desc, price);
		}

	}

	private static final String DATAFILE = "docs/invoicedata.txt";

	private static final MainProgram X = new MainProgram();
	
	private static final Product[] PRODUCTS =
		{
			X.new Product(19.99, 12, "Java T-shirt"),
			X.new Product(9.99, 8, "Java Mug"),
			X.new Product(15.99, 13, "Duke Juggling Dolls"),
			X.new Product(3.99, 29, "Java Pin"),
			X.new Product(4.99, 50, "Java Key Chain")	
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
		
		double total = 0.0;
		
		try(ObjectOutputStream outputFile = new ObjectOutputStream(
				new BufferedOutputStream(
				          new FileOutputStream(DATAFILE)))) {
			
			for (int i = 0; i < PRODUCTS.length; i ++) {
				outputFile.writeObject(PRODUCTS[i]);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(ObjectInputStream inputFile = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(DATAFILE)))) {
			
			while (true) {
				Product product = (Product) inputFile.readObject();
		        System.out.print(product);
		        total += product.getUnit() * product.getPrice();
		    }
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.format("%n%n\ttotal = $%.2f%n", total);

	}

}
