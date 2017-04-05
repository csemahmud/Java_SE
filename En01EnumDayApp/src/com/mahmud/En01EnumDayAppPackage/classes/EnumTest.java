/**
 * 
 */
package com.mahmud.En01EnumDayAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class EnumTest {
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY
	}
	
	private final Day day;

	/**
	 * @param day
	 */
	public EnumTest(Day day) {
		this.day = day;
	}

	/**
	 * 
	 */
	public EnumTest() {
		// TODO Auto-generated constructor stub
		this(null);
	}
	
	public void tellItLikeItIs() {
		try{
	        switch (day) {
	            case MONDAY:
	                System.out.println("\tMondays are bad.");
	                break;
	                    
	            case FRIDAY:
	                System.out.println("\tFridays are better.");
	                break;
	                         
	            case SATURDAY: case SUNDAY:
	                System.out.println("\tWeekends are best.");
	                break;
	                        
	            default:
	                System.out.println("\tMidweek days are so-so.");
	                break;
	        }
		} catch (NullPointerException ex) {
			// TODO: handle exception
			
			System.err.println("\t" + ex + " : " + ex.getMessage());
		}
    }

}
