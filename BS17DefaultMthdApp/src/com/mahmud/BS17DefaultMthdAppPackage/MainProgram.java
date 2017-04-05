/**
 * 
 */
package com.mahmud.BS17DefaultMthdAppPackage;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private interface TimeClient {
		void setTime(int hour, int minute, int second);
	    void setDate(int day, int month, int year);
	    void setDateAndTime(int day, int month, int year,
	                               int hour, int minute, int second);
	    LocalDateTime getLocalDateTime();
	    
	    static ZoneId getZoneId (String zoneString) {
	    	return ZoneId.of(zoneString);
	    }
	        
	    default ZonedDateTime getZonedDateTime(String zoneString) {
	        return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
	    }
	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private interface HandleInvalidTimeZoneClient extends TimeClient {

		/* (non-Javadoc)
		 * @see com.mahmud.BS17DefaultMthdAppPackage.MainProgram.TimeClient#getZonedDateTime(java.lang.String)
		 */
		@Override
		default ZonedDateTime getZonedDateTime(String zoneString) 
				throws DateTimeException
				
				// throws Exception
				// Compiler Error
				// Exception Exception is not 
				// compatible with throws clause in 
				// MainProgram.TimeClient.getZonedDateTime(String)
		{
			// TODO Auto-generated method stub
			try {
				
				return TimeClient.super.getZonedDateTime(zoneString); 
				
	        } catch (DateTimeException e) {
	            
	            throw new DateTimeException("\tInvalid zone ID: " 
	            + zoneString + "; using the default time zone instead.");
	            
	            
	        } finally {
	        	
	        	System.out.println("\t" +
	        			ZonedDateTime.of(
	        					getLocalDateTime(),
	        					ZoneId.systemDefault()));
	        	
	        }
		}

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class SimpleTimeClient implements HandleInvalidTimeZoneClient {
		
		private LocalDateTime dateAndTime;

		/**
		 * 
		 */
		public SimpleTimeClient() {
			// TODO Auto-generated constructor stub
			
			dateAndTime = LocalDateTime.now();
		}

		/* (non-Javadoc)
		 * @see com.mahmud.BS17DefaultMthdAppPackage.MainProgram.TimeClient#setTime(int, int, int)
		 */
		@Override
		public void setTime(int hour, int minute, int second) {
			// TODO Auto-generated method stub
			
			LocalDate currentDate = LocalDate.from(dateAndTime);
	        LocalTime timeToSet = LocalTime.of(hour, minute, second);
	        dateAndTime = LocalDateTime.of(currentDate, timeToSet);

		}

		/* (non-Javadoc)
		 * @see com.mahmud.BS17DefaultMthdAppPackage.MainProgram.TimeClient#setDate(int, int, int)
		 */
		@Override
		public void setDate(int day, int month, int year) {
			// TODO Auto-generated method stub
			
			LocalDate dateToSet = LocalDate.of(day, month, year);
	        LocalTime currentTime = LocalTime.from(dateAndTime);
	        dateAndTime = LocalDateTime.of(dateToSet, currentTime);

		}

		/* (non-Javadoc)
		 * @see com.mahmud.BS17DefaultMthdAppPackage.MainProgram.TimeClient#setDateAndTime(int, int, int, int, int, int)
		 */
		@Override
		public void setDateAndTime(int day, int month, int year, 
				int hour, int minute, int second) {
			// TODO Auto-generated method stub
			
			LocalDate dateToSet = LocalDate.of(day, month, year);
	        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
	        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);

		}

		/* (non-Javadoc)
		 * @see com.mahmud.BS17DefaultMthdAppPackage.MainProgram.TimeClient#getLocalDateTime()
		 */
		@Override
		public LocalDateTime getLocalDateTime() {
			// TODO Auto-generated method stub
			
			return dateAndTime;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("SimpleTimeClient [dateAndTime=").append(dateAndTime).append("]");
			return builder.toString();
		}

	}

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
		
		MainProgram x = new MainProgram();
		TimeClient myTimeClient = x.new SimpleTimeClient();
        System.out.println("\tCurrent time: " + myTimeClient);
        try {
        System.out.println("\tTime in California: " +
            myTimeClient.getZonedDateTime("Blah blah"));
        } catch(DateTimeException ex) {
        	System.err.println(ex.getMessage());
        }

	}

}
