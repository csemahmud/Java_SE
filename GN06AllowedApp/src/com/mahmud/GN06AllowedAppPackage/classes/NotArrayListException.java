/**
 * 
 */
package com.mahmud.GN06AllowedAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class NotArrayListException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6291001391188899385L;
	public static final String MESSAGE = "This is not an ArrayList";

	/**
	 * 
	 */
	public NotArrayListException() {
		// TODO Auto-generated constructor stub
		this(MESSAGE);
	}

	/**
	 * @param message
	 */
	public NotArrayListException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public NotArrayListException(Throwable cause) {
		this(MESSAGE, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NotArrayListException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public NotArrayListException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
