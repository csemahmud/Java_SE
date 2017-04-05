/**
 * 
 */
package com.mahmud.OC002DeclarationPkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param bang_a_gong[]
	 */
	public static void main(String bang_a_gong[]) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		
		// Examples of legal and illegal identifiers follow, first some legal identifiers:
			
		double _a = 1;
		final double $c = 2.4;
		final int ______2_w = 3;
		final int _$ = 4;
		final int this_is_a_very_detailed_name_for_an_identifier = 5;
		final String $ = null, $_ = null, __ = null;
		
		// The following are illegal (it's your job to recognize why):
		
//		int :b;
//		int -d;
//		int e#;
//		int .f;
//		int 7g;
		
		int sum = getSum(
				_a, $c, ______2_w, _$, 
				this_is_a_very_detailed_name_for_an_identifier);
		
		System.out.printf("\t%.0f + %.0f + %d + %d + %d = %d%n",
				_a, $c, ______2_w, _$, 
				this_is_a_very_detailed_name_for_an_identifier,
				sum);
		
		_a = get__a((int) _a);
		System.out.println("\tAfter Calling get__a(_a),");
		System.out.println("\t_a = " + _a);
		
		System.out.println();
		if($ == $_ && $_ == __){
			System.out.println("\tALL Strings are null");
		}

	}

	private static int getSum(double _a, double $c, 
			int... integers) {
		// TODO Auto-generated method stub
		
		int sum = (int) (_a + $c);
		for (int i : integers) {
			sum += i;
		}
		
		return sum;
	}

	// Compilation Error
	// The variable argument type double of the method getSum must be the last parameter
//	private static int getSum(
//			double... doubles, 
//			int ______2_w, int _$,
//			int this_is_a_very_detailed_name_for_an_identifier) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	// Compilation Error
	// Too many var-args
//	private static int getSum(
//			double... doubles, 
//			int... integers) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	private static int get__a(final int _a) {
		// TODO Auto-generated method stub
		
		// _a = 100;
		// Compile Error
		// The final local variable _a cannot be assigned. 
		
		return _a + 100;
	}

}
