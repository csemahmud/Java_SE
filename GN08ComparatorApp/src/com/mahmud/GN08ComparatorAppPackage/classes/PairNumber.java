/**
 * 
 */
package com.mahmud.GN08ComparatorAppPackage.classes;

import java.util.Comparator;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class PairNumber<T extends Number, U extends Number> 
		implements Comparable<PairNumber<T, U>> {
	
	private final T t;
	private final U u;

	/**
	 * @param t
	 * @param u
	 */
	public PairNumber(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}

	/**
	 * 
	 */
	public PairNumber() {
		// TODO Auto-generated constructor stub
		
		this(null, null);
	}

	@Override
	public int compareTo(PairNumber<T, U> pairNumber) {
		// TODO Auto-generated method stub
		
		
		if(t == null){
			return 1;
		} 
		
		if(pairNumber.t == null){
			return -1;
		}
		
		if(t.doubleValue() > pairNumber.t.doubleValue()) {
			return 1;
		}
		
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String tStr, uStr;
		if(t == null) {
			tStr = null;
		} else if(t.getClass() == Double.class 
				|| t.getClass() == Float.class) {
			tStr = String.format("%.2f", t);
		} else {
			tStr = t.toString();
		}
		
		if(u == null) {
			uStr = null;
		} else if(u.getClass() == Double.class 
				|| u.getClass() == Float.class) {
			uStr = String.format("%.2f", u);
		} else {
			uStr = u.toString();
		}
		builder.append("(").append(tStr).append(",").append(uStr).append(")");
		return builder.toString();
	}
	
	public static final Comparator<PairNumber<Number, Number>> U_ORDER = 
	        new Comparator<PairNumber<Number, Number>>() {

				@Override
				public int compare(
						PairNumber<Number, Number> pairNumber1, 
						PairNumber<Number, Number> pairNumber2) {
					// TODO Auto-generated method stub
					
					if(pairNumber1.u == null) {
						return 1;
					} 
					
					if(pairNumber2.u == null) {
						return -1;
					}
					
					if(pairNumber1.u.doubleValue() > pairNumber2.u.doubleValue()) {
						return 1;
					}
					
					return -1;
				}
		
	};

}
