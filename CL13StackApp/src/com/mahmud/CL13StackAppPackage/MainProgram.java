/**
 * 
 */
package com.mahmud.CL13StackAppPackage;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

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
		
		List<Number> numberList = 
				Arrays.asList( 0, 3, 3, 
				null, -2.5F, Double.MAX_VALUE, 12L);
		
		Stack<Number> numberStack = new Stack<>();
		for(Iterator<Number> iterator = numberList.iterator();;){
			Number num = iterator.next();
			numberStack.push(num);
			System.out.println("\tPushing : " + num);
			System.out.println("\tStack : " + numberStack);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			if(!iterator.hasNext()){
				break;
			}
		}
		
		try {
			for(;;){
				System.out.println("\tPopping : " + numberStack.pop());
				System.out.println("\tStack : " + numberStack);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		} catch (EmptyStackException ex) {
			// TODO: handle exception
			
			System.err.println("\tEmptyStackException : Message = "
					+ ex.getMessage());
		}
		
		if(numberStack.isEmpty()){
			System.out.println("\tnumberStack is EMPTY !!!");
		} else {
			System.out.println("\tnumberStack is NOT Empty !!!");
		}

	}

}
