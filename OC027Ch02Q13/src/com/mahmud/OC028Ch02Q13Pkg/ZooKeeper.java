/**
 * 
 */
package com.mahmud.OC028Ch02Q13Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class ZooKeeper {

	/**
	 * 
	 */
	public ZooKeeper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		new ZooKeeper().go();
	}

	void go() {
		Mammal mammal = new Zebra();
		System.out.println(
				"\t" + mammal.name + mammal.makeNoise());
		
		// Only method()s are overriden
		// variable are NOT overriden
	}
}
