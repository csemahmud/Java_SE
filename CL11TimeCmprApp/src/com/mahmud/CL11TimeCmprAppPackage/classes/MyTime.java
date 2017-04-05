/**
 * 
 */
package com.mahmud.CL11TimeCmprAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MyTime {
	
	private int hour, minute, second;

	/**
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	/**
	 * @param hour
	 * @param minute
	 */
	public MyTime(int hour, int minute) {
		this(hour, minute, 0);
	}

	/**
	 * @param hour
	 */
	public MyTime(int hour) {
		this(hour, 0);
	}

	/**
	 * 
	 */
	public MyTime() {
		// TODO Auto-generated constructor stub
		this(0);
	}

	/**
	 * @param myTime
	 * 
	 */
	public MyTime(MyTime myTime) {
		// TODO Auto-generated constructor stub
		this(myTime.getHour(), myTime.getMinute(), myTime.getSecond());
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = 
				((hour >= 0 && hour < 24 ) ? hour : 0);
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = 
				((minute >= 0 && minute < 60 ) ? minute : 0);
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = 
				((second >= 0 && second < 60 ) ? second : 0);
	}
	
	public String toAMPM() {
		return String.format(
				"%02d:%02d:%02d %s", 
				((getHour() == 0 || getHour() == 0) ? 12 : getHour() % 12), 
				getMinute(), getSecond());
	}

	@Override
	public String toString() {
		return String.format(
				"%02d:%02d:%02d", 
				getHour(), getMinute(), getSecond());
	}

}
