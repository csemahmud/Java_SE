/**
 * 
 */
package com.mahmud.MT17BlockBufferAppPackage.classes;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class BlockingBuffer implements Buffer {
	
	private final ArrayBlockingQueue<Integer> buffer;
	private long sum;

	/**
	 * @param size
	 * 
	 */
	public BlockingBuffer(int size) {
		// TODO Auto-generated constructor stub
		
		buffer = new ArrayBlockingQueue<>(size);
	}

	/**
	 * 
	 */
	public BlockingBuffer() {
		// TODO Auto-generated constructor stub
		
		this(3);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MT17BlockBufferAppPackage.classes.Buffer#set(int)
	 */
	@Override
	public void set(int value) throws InterruptedException {
		// TODO Auto-generated method stub
		
		buffer.put(value);
		sum += value;
		System.out.printf("\t%s writes : %3d%7d\t%d%n",
				Thread.currentThread().getName(), value,
				sum, buffer.size());

	}

	/* (non-Javadoc)
	 * @see com.mahmud.MT17BlockBufferAppPackage.classes.Buffer#get()
	 */
	@Override
	public int get() throws InterruptedException {
		// TODO Auto-generated method stub
		
		return buffer.take();
	}

	@Override
	public int getBufferSize() {
		// TODO Auto-generated method stub
		return buffer.size();
	}

}
