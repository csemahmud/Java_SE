/**
 * 
 */
package com.mahmud.TopCareerProgrammingTest01Package;

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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A1 = {4, 35, 80, 123, 12345, 44, 8, 5, 1123, 9, 12};
		int K = 8;
		int maxDigit = 0;
		for(int i = 0; i < A1.length; i++){
			int digit = 0;
			int number = A1[i];
			while(number > 0) {
				number = number/10;
				digit++;
			}
			if(maxDigit < digit){
				maxDigit = digit;
			}
		}
		
		if(K > A1.length){
			K = A1.length;
		}
		
		for(int i = 0; i < A1.length; i+=K){
			for(int j = 0; j < K; j++){
				System.out.print("+");
				for(int l = 0; l < maxDigit; l++){
					System.out.print("-");
				}
			}
			System.out.println("+");
			for(int j = i; (j < i+K)&&(j < A1.length); j++){
				System.out.print("|" + String.format(
						"%1$" + maxDigit +"s", A1[j]));
			}
			System.out.println("|");
		}
		
		int modValue = A1.length % K;
		if(modValue == 0){
			modValue = K;
		}
		for(int j = 0; j < modValue; j++){
			System.out.print("+");
			for(int l = 0; l < maxDigit; l++){
				System.out.print("-");
			}
		}
		System.out.print("+");
		
		int[] A = {2, 2, 6, 5, 5, 8, 9, 10, 1, 12, 13, 14};
		boolean order[] = new boolean[100000000];
		for(int i = 0; i < A.length; i++){
			order[i] = false;
		}
		for(int i = 0; i < A.length-1; i++){
			if(A[i] > A[i+1]){
				order[i+1] = true;
				int j = i;
				while((j >= 0)&&(A[j] > A[j+1])){
					order[j] = true;
					int temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
					j--;
				}
			}
		}
		
		int contigiousStudents = 0;
		for(int i = 0; i < A.length; i++){
			if(order[i]){
				contigiousStudents++;
			}
		}
		
		System.out.println("\n\n\n\tcontigiousStudents = " + contigiousStudents);

	}

}
