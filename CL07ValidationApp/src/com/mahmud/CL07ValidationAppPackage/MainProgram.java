/**
 * 
 */
package com.mahmud.CL07ValidationAppPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
		
		Set<String> requiredAttrSet = new HashSet<>(Arrays.asList("name", "email"));
		Set<String> permittedAttrSet = new HashSet<>(Arrays.asList("name", "email", "phone", "address"));
		Map<String, String> attr1Map = new HashMap<>();
		attr1Map.put("name", "Mahmud");
		attr1Map.put("office", "CSE");
		attr1Map.put("phone", "+8801701757766");
		
		if(validate(attr1Map, requiredAttrSet, permittedAttrSet)){
			System.out.println("\tValid : " + attr1Map);
		}
		
		System.out.println();
		
		Map<String, String> attr2Map = new HashMap<>();
		attr2Map.put("name", "Mahmud");
		attr2Map.put("email", "cse.mahmudul@gmail.com");
		attr2Map.put("phone", "+8801701757766");
		
		if(validate(attr2Map, requiredAttrSet, permittedAttrSet)){
			System.out.println("\tValid : " + attr2Map);
		}

	}
	
	static <K, V> boolean validate(Map<K, V> attrMap, Set<K> requiredAttrSet, Set<K> permittedAttrSet) {
	    boolean valid = true;
	    Set<K> attrSet = attrMap.keySet();

	    if (! attrSet.containsAll(requiredAttrSet)) {
	        Set<K> missing = new HashSet<>(requiredAttrSet);
	        missing.removeAll(attrSet);
	        System.out.println("\tMissing attributes : " + missing);
	        valid = false;
	    }
	    
	    if (! permittedAttrSet.containsAll(attrSet)) {
	        Set<K> illegalSet = new HashSet<>(attrSet);
	        illegalSet.removeAll(permittedAttrSet);
	        System.out.println("\tIllegal attributes : " + illegalSet);
	        valid = false;
	    }
	    
	    return valid;
	}

}
