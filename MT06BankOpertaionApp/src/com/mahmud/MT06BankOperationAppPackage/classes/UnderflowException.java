/**
 * 
 */
package com.mahmud.MT06BankOperationAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class UnderflowException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1473359775764105509L;
	private final static String MESSAGE = "Underflow !!! Insufficient Balance .";

	/**
	 * 
	 */
	public UnderflowException() {
		// TODO Auto-generated constructor stub
		
		this(MESSAGE);
	}

	/**
	 * @param account
	 */
	public UnderflowException(Account account) {
		// TODO Auto-generated constructor stub
		
		this(account.getAccNo() + ": " + 
				MESSAGE + "\n\t" + account);
	}

	/**
	 * @param message
	 */
	public UnderflowException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public UnderflowException(Throwable cause) {
		this(MESSAGE, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UnderflowException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public UnderflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
