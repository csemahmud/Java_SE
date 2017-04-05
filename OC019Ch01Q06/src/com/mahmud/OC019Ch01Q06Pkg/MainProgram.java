/**
 * 
 */
package com.mahmud.OC019Ch01Q06Pkg;

import java.util.ArrayList;
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
		
		List<Device> deviceList = new ArrayList<>();
		deviceList.add(new Device() {
			
			@Override
			public void doIt() {
				// TODO Auto-generated method stub
				System.out.println("\tAnonymous : void doIt()");
			}
		});
		deviceList.add(new Electronic());
		deviceList.add(new Phone1() {
		});
		deviceList.add(new Phone2() {
		});
		deviceList.add(new Phone3());
		
		for (Device device : deviceList) {
			device.doIt();
			if(device instanceof Phone3){
				((Phone3) device).doStuff();
			}
		}
	}

}
