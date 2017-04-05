/**
 * 
 */
package com.mahmud.OC034Ch06Q09Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Beyond extends Infinity {

	static Integer i;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		int sw = (int)(Math.random() * 3);
		switch(sw){
		case 0:{
			try {

				System.out.println("\tCase 0:");
				for(int x = 10; x > 5; x++) {
					if(x > 10000000) {
						x = 10;
					}
					System.out.println("\tx = " + x);
				}
				System.out.println("\tAfter Infinite Loop");
				
			} catch (Exception ex) {
				// TODO: handle exception
				
				System.err.print("\t" + 
				ex + " : " + ex.getMessage());
			}
			break;
		}
		case 1:{
			try {
				
				int y = 7 * i;
				System.out.println("\ty = " + y);
				
			} catch (NullPointerException ex) {
				// TODO: handle exception
				
				System.err.print("\t" + 
				ex + " : " + ex.getMessage());
			}
			break;
		}
		case 2:{
			Infinity inf = new  Beyond();
			Beyond b = (Beyond)inf;
			if(b instanceof Infinity){
				System.out.println(
						"\tb is instance of Infinity");
			}
			break;
		}
				
		}
	}

}
