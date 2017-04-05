/**
 * 
 */
package com.mahmud.IT01IteratorPatternAppPackage.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class NameRepository implements MyContainer {
	
	private final List<String> nameList;

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

	/* (non-Javadoc)
	 * @see com.mahmud.IT01IteratorPatternAppPackage.classes.MyContainer#getMyIterator()
	 */
	@Override
	public MyIterator getMyIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class NameIterator implements MyIterator {
		
		int index;

		/**
		 * 
		 */
		public NameIterator() {
			// TODO Auto-generated constructor stub
		}

		/* (non-Javadoc)
		 * @see com.mahmud.IT01IteratorPatternAppPackage.classes.MyIterator#myHasNext()
		 */
		@Override
		public boolean myHasNext() {
			// TODO Auto-generated method stub
			
			if(index < nameList.size()){
	            return true;
	         }
			return false;
		}

		/* (non-Javadoc)
		 * @see com.mahmud.IT01IteratorPatternAppPackage.classes.MyIterator#myNext()
		 */
		@Override
		public Object myNext() {
			// TODO Auto-generated method stub
			if(this.myHasNext()){
	            return nameList.get(index++);
            }
			return null;
		}

	}

}
