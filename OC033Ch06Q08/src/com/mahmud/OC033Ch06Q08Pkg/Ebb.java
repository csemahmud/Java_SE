/**
 * 
 */
package com.mahmud.OC033Ch06Q08Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Ebb {
	
	static int x = 7;

	/**
	 * 
	 */
	public Ebb() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		String s = "";
		for(int y = 0; y < 3; y++){
			x++;
			switch(x){
			case 8: s += "8 ";
			case 9: s += "9 ";
			case 10: { 
				s += "10 ";
				break;
			}
			default: s += "d ";
			case 13: s += "13 ";
			}
		}
		System.out.println("\t" + s);
	}
	
	static {
		x++;
	}

}
