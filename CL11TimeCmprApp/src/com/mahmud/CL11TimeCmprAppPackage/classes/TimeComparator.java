/**
 * 
 */
package com.mahmud.CL11TimeCmprAppPackage.classes;

import java.util.Comparator;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class TimeComparator implements Comparator<MyTime> {

	/**
	 * 
	 */
	public TimeComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(MyTime time1, MyTime time2) {
		// TODO Auto-generated method stub
		
		int hourCompare = time1.getHour() - time2.getHour();
		if(hourCompare != 0){
			return hourCompare;
		}
		
		int minute = time1.getMinute() - time2.getMinute();
		if(minute != 0){
			return minute;
		}
		
		return time1.getSecond() - time2.getSecond();
	}

}
