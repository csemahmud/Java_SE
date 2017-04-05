/**
 * 
 */
package com.mahmud.OC006EnumOvrdPkg.enums;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public enum CoffeeSize {

	BIG(8),
	HUGE(10),
	OVERWHELMING(16) {

		/* (non-Javadoc)
		 * @see com.mahmud.OC006EnumOvrdPkg.enums.CoffeeSize#getLidCode()
		 */
		@Override
		public String getLidCode() {
			// TODO Auto-generated method stub
			return "A";
		}		
		
	};
	
	
	
	/**
	 * @param ounces
	 */
	private CoffeeSize(int ounces) {
		this.ounces = ounces;
	}

	final private int ounces;

	/**
	 * @return the ounces
	 */
	public synchronized final int getOunces() {
		return ounces;
	}
	
	public String getLidCode() {
		
		return "B";
		
	}
}
