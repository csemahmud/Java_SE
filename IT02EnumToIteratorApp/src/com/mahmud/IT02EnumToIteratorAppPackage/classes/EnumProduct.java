/**
 * 
 */
package com.mahmud.IT02EnumToIteratorAppPackage.classes;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class EnumProduct {
	
	private final Vector<String> product;

	/**
	 * 
	 */
	public EnumProduct() {
		// TODO Auto-generated constructor stub
		
		product = new Vector<>();
		addProduct("ProductA");
		addProduct("ProductB");
		addProduct("ProductC");
	}

	/**
	 * @return the product.elements()
	 */
	public Enumeration<String> getProduct() {
		return product.elements();
	}

	/**
	 * @param productName the product to add
	 */
	public void addProduct(String productName) {
		product.add(productName);
	}

}
