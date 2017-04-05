/**
 * 
 */
package com.mahmud.SampleStackAppPackage;

import com.mahmud.SampleStackAppPackage.classes.MyStack;
import com.mahmud.SampleStackAppPackage.classes.OverflowStackException;
import com.mahmud.SampleStackAppPackage.classes.UnderflowStackException;

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
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		MyStack<String> stack = new MyStack();
		
		System.out.println("\n\n");
		
		try{
			
			for(int i = 1; ; i++){
				stack.push("'" + i + "'");
				System.out.println("\tPushing : '" + i + "'");
			}
			
		} catch (OverflowStackException ex){
			
			System.err.println("\t" + ex.getMessage());
			
		} finally {	
			
			System.out.println("\t" + stack);
			
		}
		
		System.out.println();
		
		try{
			
			while(true){
				System.out.println("\tPopping : " + stack.pop());
			}
			
		} catch (UnderflowStackException ex){
			
			System.err.println("\t" + ex.getMessage());
			
		} finally {
			
			System.out.println("\t" + stack);
			
		}

	}

}
