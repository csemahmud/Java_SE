/**
 * 
 */
package com.mahmud.OC035Ch06Q10Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Circles {

	/**
	 * 
	 */
	public Circles() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		System.out.print("\t");
		int[] is = { 1, 3, 5, 7, 9 };
		for (int x : is) {
			for(int j = 0; j < 3; j++){
				if(x > 4 && x < 8)
					continue;
				System.out.print(" " + x);
				if(j == 1)
					break;
				continue;
			}
			continue;
		}
	}

}
