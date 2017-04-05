/**
 * 
 */
package com.mahmud.SampleStackAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class OverflowStackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4331362190464995275L;
	private final static String MESSAGE = "OVERFLOW !!! Stack is full";

	/**
	 * 
	 */
	public OverflowStackException() {
		// TODO Auto-generated constructor stub
		this(MESSAGE);
	}

	/**
	 * @param message
	 */
	public OverflowStackException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public OverflowStackException(Throwable cause) {
		this(MESSAGE, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public OverflowStackException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public OverflowStackException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
