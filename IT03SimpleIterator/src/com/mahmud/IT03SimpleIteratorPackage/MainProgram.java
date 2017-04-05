/**
 * 
 */
package com.mahmud.IT03SimpleIteratorPackage;

import java.util.Iterator;

import com.mahmud.IT03SimpleIteratorPackage.classes.CarRepository;
import com.mahmud.IT03SimpleIteratorPackage.classes.NameRepository;

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
		
		System.out.println("\n\n\n\tDiplaying all names : ");
		display(new NameRepository().getIterator());
		System.out.println("\n\tDiplaying all cars : ");
		display(new CarRepository().getIterator());

	}

	private static void display(Iterator<?> iterator) {
		// TODO Auto-generated method stub
		
		while(iterator.hasNext()){
			System.out.println("\t" + iterator.next());
		}
	}

}
