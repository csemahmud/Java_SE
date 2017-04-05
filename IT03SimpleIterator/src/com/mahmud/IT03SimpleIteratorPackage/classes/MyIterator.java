/**
 * 
 */
package com.mahmud.IT03SimpleIteratorPackage.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MyIterator<Type> implements Iterator<Type> {
	
	private final List<Type> typeList;
	private int index;

	/**
	 * @param typeList
	 */
	public MyIterator(List<Type> typeList) {
		this.typeList = typeList;
	}

	/**
	 * 
	 */
	public MyIterator() {
		// TODO Auto-generated constructor stub
		this(new ArrayList<Type>());
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < typeList.size()){
			return true;
		}
		return false;
	}

	@Override
	public Type next() {
		// TODO Auto-generated method stub
		if(this.hasNext()){
			return typeList.get(index++);
		}
		return null;
	}

}
