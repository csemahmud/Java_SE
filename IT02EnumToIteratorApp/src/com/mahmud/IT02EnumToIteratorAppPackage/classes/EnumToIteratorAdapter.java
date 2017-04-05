/**
 * 
 */
package com.mahmud.IT02EnumToIteratorAppPackage.classes;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */

public class EnumToIteratorAdapter implements Iterator<Object> {
	
	private Enumeration<?> anEnum;

	/**
	 * @param anEnum
	 */
	public EnumToIteratorAdapter(Enumeration<?> anEnum) {
		this();
		this.anEnum = anEnum;
	}

	/**
	 * 
	 */
	public EnumToIteratorAdapter() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return anEnum.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return anEnum.nextElement();
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
		
		// throw new Exception();
		// Compiler Error
	}

}
