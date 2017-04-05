/**
 * 
 */
package com.mahmud.IT01IteratorPatternAppPackage;

import com.mahmud.IT01IteratorPatternAppPackage.classes.MyIterator;
import com.mahmud.IT01IteratorPatternAppPackage.classes.NameRepository;

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
		NameRepository namesRepository = new NameRepository();
		
		for(MyIterator iter = namesRepository.getMyIterator(); iter.myHasNext();){
			String name = (String)iter.myNext();
			System.out.println("\tName : " + name);
		}

	}

}
