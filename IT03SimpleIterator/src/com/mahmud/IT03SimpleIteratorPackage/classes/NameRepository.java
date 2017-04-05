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
public class NameRepository implements Container<String> {
	
	private List<String> nameList;

	/**
	 * 
	 */
	public NameRepository() {
		// TODO Auto-generated constructor stub
		
		nameList = new ArrayList<>();
		nameList.add("Engr Mahmudul Hasan Khan");
		nameList.add("Alia Bhatt");
		nameList.add("Shraddha Kapoor");
		nameList.add("Kriti Shanon");
	}

	@Override
	public Iterator<String> getIterator() {
		// TODO Auto-generated method stub
		return new MyIterator<>(nameList);
	}

}
