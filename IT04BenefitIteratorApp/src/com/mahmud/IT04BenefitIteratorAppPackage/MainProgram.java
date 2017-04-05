/**
 * 
 */
package com.mahmud.IT04BenefitIteratorAppPackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

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
		
		List<String> stringList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			stringList.add("'" + i + "'");
		}

		System.out.print("\t{");
		try {
			int i = 0;
			for (String string : stringList) {
				System.out.print(string);
				i++;
				if(i < stringList.size()){
					System.out.print(",");
				}
				stringList.remove(string);
			}
		} catch (ConcurrentModificationException ex) {
			// TODO: handle exception
			
			System.out.print("'ex',");
			for (Iterator<String> it = stringList.iterator(); ; ) {
			   String str = it.next();
			   System.out.print(str);
			   if (it.hasNext()) {
				   it.remove();
				   System.out.print(",");     
			   } else {
				   it.remove();
				   break;
			   }
			}
		} finally {
			// TODO: handle finally clause
			
			System.out.println("}");
			System.out.println("\n\tNow Is the List Empty ? "
					+ stringList.isEmpty());
		}

	}

}
