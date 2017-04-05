/**
 * 
 */
package com.mahmud.MT19LockCondAppPackage.classes;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class LockCondBuffer implements Buffer {
	
	private final Lock accessLock = new ReentrantLock();
	private final Condition canWrite = accessLock.newCondition();
	private final Condition canRead = accessLock.newCondition();
	private int buffer = -1;
	private boolean occupied;

	/**
	 * 
	 */
	public LockCondBuffer() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MT19LockCondAppPackage.classes.Buffer#set(int)
	 */
	@Override
	public void set(int value) throws InterruptedException {
		// TODO Auto-generated method stub
		
		accessLock.lock();
		
		try {
			
			while(occupied) {
				System.out.printf("\t%s tries to write%n",
						Thread.currentThread().getName());
				displayState(String.format("Buffer is FULL. %s waits",
						Thread.currentThread().getName()));
				canWrite.await();
			}
			
			buffer = value;
			
			occupied = true;
			
			displayState(Thread.currentThread().getName() 
					+ " writes ");
			canRead.signal();
			
		} finally {
			
			accessLock.unlock();
			
		}
	}

	private void displayState(String operation) {
		// TODO Auto-generated method stub
		
		System.out.printf("\t%-40s%d\t\t%b%n", operation,
				buffer, occupied);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MT19LockCondAppPackage.classes.Buffer#get()
	 */
	@Override
	public int get() throws InterruptedException {
		// TODO Auto-generated method stub
		
		int readValue = 0;
		accessLock.lock();
		
		try {
			
			while(!occupied) {
				System.out.printf("\t%s tries to Read%n",
						Thread.currentThread().getName());
				displayState(String.format("Buffer is EMPTY. %s waits",
						Thread.currentThread().getName()));
				canRead.await();
			}
			
			readValue = buffer;
			
			occupied = false;
			
			displayState(Thread.currentThread().getName() 
					+ " reads  ");
			canWrite.signal();
			
		} finally {
			
			accessLock.unlock();
			
		}
		
		return readValue;
	}

}
