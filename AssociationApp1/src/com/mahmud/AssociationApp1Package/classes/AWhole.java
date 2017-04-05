/**
 * 
 */
package com.mahmud.AssociationApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class AWhole {
	
	private final BPart bPart1;
	private final BPart bPart2;

	/**
	 * @param bPart1
	 */
	public AWhole(BPart bPart1) {
		
		this.bPart1 = bPart1;   //   Aggregation
		
		bPart2 = new BPart();   //   Composition
		bPart2.setNumber1(500);
		bPart2.setText1("I Love ");
	}

	/**
	 * 
	 */
	public AWhole() {
		// TODO Auto-generated constructor stub
		
		this(null);
	}
	
	public void changeBPart2(int number, String text){
		bPart2.setNumber1(bPart2.getNumber1() + number);
		bPart2.setText1(bPart2.getText1() + text);
	}
	
	public String getStringBPart1(){
		if(bPart1 != null) {
			return bPart1.toString();
		}
		return null;
	}
	
	public String getStringBPart2(){
		return bPart2.toString();
	}
	
	public static String determineOddEven(BPart bPart) {
		
		//   Dependency
		
		if((bPart.getNumber1()) % 2 == 0){
			return "This BPart has EVEN number : " + bPart.getNumber1();
			}
		return "This BPart has ODD number : " + bPart.getNumber1();
	}

}
