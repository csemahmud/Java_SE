/**
 * 
 */
package com.mahmud.MT02NetworkServerAppPackage;

import com.mahmud.MT02NetworkServerAppPackage.classes.MultithreadedServer;

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
		
		new MultithreadedServer().listen();
		new MultithreadedServer(8085).listen();

	}

}
