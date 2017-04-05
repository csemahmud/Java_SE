/**
 * 
 */
package com.mahmud.IT03SimpleIteratorPackage.classes;

import java.util.Iterator;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public interface Container<Type> {
	public Iterator<Type> getIterator();
}
