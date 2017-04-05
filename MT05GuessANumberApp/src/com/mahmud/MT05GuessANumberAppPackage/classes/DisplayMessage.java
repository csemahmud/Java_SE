/**
 * 
 */
package com.mahmud.MT05GuessANumberAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class DisplayMessage implements Runnable {
	
	private String message;

	/**
	 * @param message
	 */
	public DisplayMessage(String message) {
		this();
		this.message = message;
	}

	/**
	 * 
	 */
	public DisplayMessage() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			System.out.println("\t" + message);
		}

	}

}
