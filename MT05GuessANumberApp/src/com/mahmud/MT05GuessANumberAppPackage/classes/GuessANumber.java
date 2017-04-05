/**
 * 
 */
package com.mahmud.MT05GuessANumberAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class GuessANumber extends Thread {
	
	private int number;

	/**
	 * @param number
	 */
	public GuessANumber(int number) {
		this();
		this.number = number;
	}

	/**
	 * 
	 */
	public GuessANumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param target
	 */
	public GuessANumber(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public GuessANumber(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 */
	public GuessANumber(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param name
	 */
	public GuessANumber(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param target
	 * @param name
	 */
	public GuessANumber(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 */
	public GuessANumber(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 * @param stackSize
	 */
	public GuessANumber(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int counter = 0;
		int guess = 0;
		do {
			guess = (int) (Math.random () * 100 + 1);
			System .out.println("\t" + this.getName()
					+ " guesses " + guess);
			counter++;
		} while(guess != number);
		System .out.println("\t" + "* * Correct! " + this.getName()
			+ " in " + counter + " guesses.* * ");
		super.run();
	}

}
