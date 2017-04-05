/**
 * 
 */
package com.mahmud.EX01IndexOutAppPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import com.mahmud.EX01IndexOutAppPackage.classes.ListOfNumbers;

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
		
		ListOfNumbers listOfNumbers = new ListOfNumbers();
		final String pathFileStr = "docs/num_list.txt";
		try {
			
			listOfNumbers.writeList(pathFileStr);
			
		}catch (IndexOutOfBoundsException ex) {
        	
            System.out.println("\tError : IndexOutOfBoundsException: " + ex.getMessage());
            
            StackTraceElement elements[] = ex.getStackTrace();
            for (StackTraceElement stackTraceElement : elements) {
            	System.out.println("\t" 
            			+ stackTraceElement.getFileName()
                        + ":" + stackTraceElement.getLineNumber() 
                        + ">> "
                        + stackTraceElement.getMethodName() + "()");
			}
        
        } catch (FileNotFoundException ex) {
        	
        	System.out.println(
        			"\tError : Caught FileNotFoundException: " 
        			+ ex.getMessage());
            
        } catch (IOException ex) {
        	
        	System.out.println("\tError : Caught IOException: " 
        			+ ex.getMessage());
            
        }  catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
//		try {
//			
//			listOfNumbers.writeList(pathFileStr);
//			
//		}catch (IndexOutOfBoundsException ex) {
//        	
//            System.out.println("\tError : IndexOutOfBoundsException: " + ex.getMessage());
//            
//            StackTraceElement elements[] = ex.getStackTrace();
//            for (StackTraceElement stackTraceElement : elements) {
//            	System.out.println("\t" 
//            			+ stackTraceElement.getFileName()
//                        + ":" + stackTraceElement.getLineNumber() 
//                        + ">> "
//                        + stackTraceElement.getMethodName() + "()");
//			}
//        
//        } catch (IOException ex) {
//        	
//        	System.out.println("\tError : Caught IOException: " 
//        			+ ex.getMessage());
//            
//        } catch (FileNotFoundException ex) {
//        	
//        	System.out.println(
//        			"\tError : Caught FileNotFoundException: " 
//        			+ ex.getMessage());
//            
//        }  catch (SQLException ex) {
//			// TODO Auto-generated catch block
//			ex.printStackTrace();
//		}

		// Compiler Error
		// Unreachable catch block for 
		// FileNotFoundException. It is already 
		// handled by the catch block for IOException
		
		try {
			
			System.out.println(readLinesFromFile(pathFileStr));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String readLinesFromFile(String pathFileStr) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try (BufferedReader bufferedReader =
                new BufferedReader(new FileReader(pathFileStr))) {
			
			String string = "";
			String str = null;
			
			while ((str = bufferedReader.readLine()) != null) {
                string += "\n\t" + str;
            }
			
			return string;
			
		}
		
		// Finally not required
		// Only for try with resources
	}

}
