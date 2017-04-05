/**
 * 
 */
package com.mahmud.AdapterApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class TurkeyAdapterToDuck implements IDuck {
	
	// I have ITurkey
	// I need IDuck
	
	private ITurkey turkey;

	/**
	 * @param turkey
	 */
	public TurkeyAdapterToDuck(ITurkey turkey) {
		super();
		this.turkey = turkey;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.AdapterApp1Package.classes.IDuck#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		
		turkey.gobble();

	}

	/* (non-Javadoc)
	 * @see com.mahmud.AdapterApp1Package.classes.IDuck#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		for(int i =0; i<5; i++){
			turkey.fly();
		}

	}

}
