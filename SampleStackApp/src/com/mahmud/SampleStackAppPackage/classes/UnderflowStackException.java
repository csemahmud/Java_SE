/**
 * 
 */
package com.mahmud.SampleStackAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class UnderflowStackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8008930035498784184L;
	private final static String MESSAGE = "UNDERFLOW !!! Stack is empty";

	/**
	 * 
	 */
	public UnderflowStackException() {
		// TODO Auto-generated constructor stub
		this(MESSAGE);
	}

	/**
	 * @param message
	 */
	public UnderflowStackException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public UnderflowStackException(Throwable cause) {
		this(MESSAGE, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UnderflowStackException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public UnderflowStackException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
