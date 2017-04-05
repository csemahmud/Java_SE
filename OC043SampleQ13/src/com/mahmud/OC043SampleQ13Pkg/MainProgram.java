/**
 * 
 */
package com.mahmud.OC043SampleQ13Pkg;

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

		System.out.println("\n\n");
		int[] values = {10, 20, 30, 40, 50};
		MainProgram x = new MainProgram();
		x.processArray(values);
		x.process2Array(values);
	}
	
	public void processArray(int[] values){
		
		int sum = 0;
		int i = 0;
		
		try{
		
			while(values[i]<100){
		
				sum = sum +values[i];		
				i++;
		
			}
		} catch(IndexOutOfBoundsException ex){ 
			
			System.err.printf(
					"\t%s : %s%n", ex, ex.getMessage());
            
            StackTraceElement elements[] = ex.getStackTrace();
            for (StackTraceElement stackTraceElement : elements) {
            	System.err.println("\t" 
            			+ stackTraceElement.getFileName()
                        + ":" + stackTraceElement.getLineNumber() 
                        + ">> "
                        + stackTraceElement.getMethodName() + "()");
			}
            
            // We Must have to implement
            // Some code in catch block
			
		} catch(Exception ex){ 
			
			System.err.println("\tUnknown Exception");
			
		}
		System.out.println("\tprocessArray : sum = "
				+sum);
		
	}
	
	public void process2Array(int[] values){
		
		int sum = 0;
		int i = 0;
		
		for(i = 0; 
				i < values.length && values[i]<100; 
				i++){
			
			sum = sum +values[i];
	
		}
		
		// We can use flow control to
		// terminate this loop
		
		System.out.println("\tprocess2Array : sum = "
				+ sum);
		
	}

}
