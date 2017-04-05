/**
 * 
 */
package com.mahmud.CL06MapAppPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
		
		String[] stringArray = { "My", "name", "is", "Mahmud",
				"Your", "name", "is", "Alia",
				 "My", "hobby", "is", "programming" };
		
		Map<String, Integer> textMap = new HashMap<>();

        for (String aString : stringArray) {
            Integer freq = textMap.get(aString);
            textMap.put(aString, (freq == null) ? 1 : freq + 1);
        }

        System.out.println("\t" + textMap.size() + " Distinct Words : ");
        for (Map.Entry<String, Integer> entry : textMap.entrySet()) {
			System.out.println("\tKey = " + entry.getKey()
								+ "; Value = " + entry.getValue());
		}
		
        System.out.println();
        
		String[] string2Array = { "Your", "name", "is", "Shraddha" };
        
        Map<String, Integer> overrideMap = new HashMap<>();

        for (String aString : string2Array) {
            Integer freq = overrideMap.get(aString);
            overrideMap.put(aString, (freq == null) ? 1 : freq + 1);
        }
        
        System.out.println("\toverrideMap : ");
        System.out.println("\t" + overrideMap);
        
        Map<String, Integer> resultMap = newAttributeMap(textMap, overrideMap);
        
        System.out.println("\tresultMap : ");
        System.out.println("\t" + resultMap);
        
        System.out.println("\n\tRemoving keys from resultMap : ");
        
        System.out.print("\t");
        
        for(Iterator<String> it = resultMap.keySet().iterator(); true;){
        	String key = it.next();
        	System.out.print(key);
        	if(it.hasNext()){
        		it.remove();
        		System.out.print(" -> ");
        	} else {
        		it.remove();
        		break;
        	}
        }
        
        System.out.println();
        System.out.println("\n\tIs resultMap Empty ? "
        		+ resultMap.isEmpty());

	}
	
	static <K, V> Map<K, V> newAttributeMap(Map<K, V>defaultMap, Map<K, V> overrideMap) {
	    Map<K, V> resultMap = new HashMap<>(defaultMap);
	    resultMap.putAll(overrideMap);
	    return resultMap;
	}

}
