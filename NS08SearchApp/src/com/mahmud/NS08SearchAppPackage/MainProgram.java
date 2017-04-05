/**
 * 
 */
package com.mahmud.NS08SearchAppPackage;

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
		String searchMe = "Green eggs and ham";
        String findMe = "eggs";
        search(searchMe, findMe);
        String findMe2 = "milk";
        search(searchMe, findMe2);

	}

	private static void search(String searchMe, String findMe) {
		// TODO Auto-generated method stub
		
		System.out.println("\t" + searchMe);

        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;
        for (int i = 0; 
             i <= (searchMeLength - findMeLength);
             i++) {
           if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
              foundIt = true;
              System.out.println("\t\"" + searchMe.substring(i, i + findMeLength)
            		  + "\" found on " + i + " position");
              break;
           }
        }
        if (!foundIt) {
            System.out.println("\tNo match found for \"" + findMe + "\"");
        }
	}

}
