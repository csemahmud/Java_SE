/**
 * 
 */
package com.mahmud.MT18CircularBfrAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class CircularBuffer implements Buffer {
	
	private final int[] circularBuffer;
	private int occupiedCells, writeIndex, readIndex;

	/**
	 * @param bufferLength
	 * 
	 */
	public CircularBuffer(int bufferLength) {
		// TODO Auto-generated constructor stub
		
		circularBuffer = new int[bufferLength];
		for(int i = 0; i < bufferLength; i++){
			circularBuffer[i] = -1;
		}
	}

	/**
	 * 
	 */
	public CircularBuffer() {
		// TODO Auto-generated constructor stub
		
		this(3);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MT18CircularBfrAppPackage.classes.Buffer#set(int)
	 */
	@Override
	public synchronized void set(int value) throws InterruptedException {
		// TODO Auto-generated method stub
		
		while(occupiedCells == circularBuffer.length) {
			System.out.printf("\tBuffer is FULL. %s waits%n",
					Thread.currentThread().getName());
			wait();
		}
		
		circularBuffer[writeIndex] = value;
		
		writeIndex = (writeIndex + 1) % circularBuffer.length;
		
		occupiedCells++;
		displayState("writes " + value);
		notifyAll();

	}

	private synchronized void displayState(String operation) {
		// TODO Auto-generated method stub

		System.out.printf("\t%s %s%s%d)%n\t%s",
				Thread.currentThread().getName(), operation,
				" (buffer cells occupied: ", occupiedCells, 
				"buffer cells: ");
		
		for (int value : circularBuffer) {
			System.out.printf(" %3d  ", value);
		}
		
		System.out.print("\n\t              ");
		
		for(int i = 0; i < circularBuffer.length; i++) {
			System.out.print("----- ");
		}
		
		System.out.print("\n\t              ");
		
		for(int i = 0; i < circularBuffer.length; i++) {
			if(i == writeIndex && i == readIndex){
				
				System.out.print(" W R  ");
				
			} else if(i == writeIndex){
				
				System.out.print(" W    ");
				
			} else if(i == readIndex){
				
				System.out.print("   R  ");
				
			} else {
				
				System.out.print("      ");
				
			} 
		}
		
		System.out.println();
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MT18CircularBfrAppPackage.classes.Buffer#get()
	 */
	@Override
	public synchronized int get() throws InterruptedException {
		// TODO Auto-generated method stub
		
		while(occupiedCells == 0) {
			System.out.printf("\tBuffer is EMPTY. %s waits%n",
					Thread.currentThread().getName());
			wait();
		}
		
		int returnValue = circularBuffer[readIndex];
		
		readIndex = (readIndex + 1) % circularBuffer.length;
		
		occupiedCells--;
		displayState("reads " + returnValue);
		notifyAll();
		
		return returnValue;
	}

}
