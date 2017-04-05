/**
 * 
 */
package com.mahmud.BackGroundAppPackage.classes;

import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Counter implements Runnable {
	
	private List<Boolean> booleanSubList;
	private int result;

	/**
	 * @param booleanSubList
	 */
	public Counter(List<Boolean> booleanSubList) {
		this.booleanSubList = booleanSubList;
	}

	/**
	 * 
	 */
	public Counter() {
		// TODO Auto-generated constructor stub
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		booleanSubList.stream().forEach(aBoolean -> {
			
			// count true values
			if(aBoolean){
				result++;
			}
		});
	}

	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

}
