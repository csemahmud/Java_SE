/**
 * 
 */
package com.mahmud.OC038Ch06Q16Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MyExceprion extends Exception {
	private static final String MESSAGE
		= "Exception Message from MyExceprion";

	/**
	 * 
	 */
	private static final long serialVersionUID = 8614594862060043036L;

	/**
	 * 
	 */
	public MyExceprion() {
		// TODO Auto-generated constructor stub
		
		this(MESSAGE);
	}

	/**
	 * @param message
	 */
	public MyExceprion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public MyExceprion(Throwable cause) {
		super(MESSAGE, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public MyExceprion(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MyExceprion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
