/**
 * 
 */
package com.mahmud.IT02EnumToIteratorAppPackage;

import java.util.Iterator;

import com.mahmud.IT02EnumToIteratorAppPackage.classes.EnumProduct;
import com.mahmud.IT02EnumToIteratorAppPackage.classes.EnumToIteratorAdapter;

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
		EnumProduct enumProduct = new EnumProduct();
		EnumToIteratorAdapter enumToIteratorAdapter 
			= new EnumToIteratorAdapter(enumProduct.getProduct());
		displayProduct(enumToIteratorAdapter);
	}

	private static void displayProduct(Iterator<?> iterator) {
		// TODO Auto-generated method stub
		
		while(iterator.hasNext()){
			System.out.println("\t" + iterator.next());
		}
	}

}
