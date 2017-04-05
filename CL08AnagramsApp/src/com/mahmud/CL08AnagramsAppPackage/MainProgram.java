/**
 * 
 */
package com.mahmud.CL08AnagramsAppPackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
		
		int minGroupSize = 4;

        // Read words from file and put into a simulated multimap
        Map<String, List<String>> map = new HashMap<>();

        Scanner scanner = null;

        try {
			scanner = new Scanner(new File("docs/text.txt"));
            while (scanner.hasNext()) {
                String word = scanner.next();
                String alpha = orderAlphabets(word);
                List<String> list = map.get(alpha);
                if (list == null) {
                	map.put(alpha, list=new ArrayList<>());
                }
                list.add(word);
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        } finally {
        	if(scanner != null){
        		scanner.close();
        	}
		}

        // Print all permutation groups above size threshold
        for (List<String> list : map.values()) {
            if (list.size() >= minGroupSize) {
                System.out.println(list.size() + " : " + list);
            }
        }

	}
	
	private static String orderAlphabets(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
