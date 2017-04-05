/**
 * 
 */
package com.mahmud.CL16PropertiesAppPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

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
		
		Properties table = new Properties();
		
		table.setProperty("color", "blue");
		table.setProperty("width", "200");		
		System.out.println("\tAfter SETTING properties : ");
		listproperties(table);
		
		table.setProperty("color", "red");		
		System.out.println("\tAfter REPLACING properties : ");
		listproperties(table);
		
		saveproperties(table);
		System.out.println("\tAfter SAVING Properties : ");
		listproperties(table);
		
		table.clear();
		System.out.println("\tAfter CLEARING Properties : ");
		listproperties(table);
		
		loadproperties(table);
		System.out.println("\tAfter LOADING Properties : ");
		listproperties(table);

	}

	private static void loadproperties(Properties properties) {
		// TODO Auto-generated method stub
		
		try(FileInputStream input 
				= new FileInputStream("docs/properties.txt")){
			
			properties.load(input);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void saveproperties(Properties properties) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream output 
				= new FileOutputStream("docs/properties.txt")){
			
			properties.store(output, "Sample Properties");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void listproperties(Properties properties) {
		// TODO Auto-generated method stub
		
		for (Object key : properties.keySet()) {
			System.out.printf(
					"\t%s: \t%s%n", key, 
					properties.getProperty(key.toString()));
		}
		
		if(properties.isEmpty()) {
			System.out.println("\tNothing to show .....");
		}
		
		System.out.println();
	}

}
