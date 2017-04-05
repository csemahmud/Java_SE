/**
 * 
 */
package com.mahmud.MT17BlockBufferAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public interface Buffer {
	
	public void set ( int value ) throws InterruptedException;
	
	public int get () throws InterruptedException;
	
	int getBufferSize();

}
