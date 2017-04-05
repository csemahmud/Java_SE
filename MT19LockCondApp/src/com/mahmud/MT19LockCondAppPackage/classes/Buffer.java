/**
 * 
 */
package com.mahmud.MT19LockCondAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public interface Buffer {
	
	public void set ( int value ) throws InterruptedException;
	
	public int get () throws InterruptedException;

}
