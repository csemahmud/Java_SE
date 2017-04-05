/**
 * 
 */
package com.mahmud.IO17StrSearchAppPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
		
		Path path = Paths.get("docs/text.txt");
		final String findStr1 = "মাহমুদ";
		final String findStr2 = "কাজল";
		final String findStr3 = "আলিয়া";
		final String findStr4 = "কোয়েল";
		
		try (InputStream input = Files.newInputStream(path);
			    BufferedReader reader =
			      new BufferedReader(new InputStreamReader(input))) {
		    
			String line = null;
		    for (int i = 1; (line = reader.readLine()) != null; i++) {
		        if(search(line, findStr1, i)){
		        	break;
		        }		    
		    }
		    if(line == null){
		    	System.out.println("\tNo match found for \"" 
		    			+ findStr1 + "\"");
		    }
		    
			line = null;
		    for (int i = 1; (line = reader.readLine()) != null; i++) {
		        if(search(line, findStr2, i)){
		        	break;
		        }		    
		    }
		    if(line == null){
		    	System.out.println("\tNo match found for \"" 
		    			+ findStr2 + "\"");
		    }
		} catch (IOException ex) {
		    System.err.println(ex);
		}
	    
		System.out.println();
		
	    // Defaults to READ
	    try (SeekableByteChannel sbchannel = Files.newByteChannel(path)) {
	    	
	        ByteBuffer buffer = ByteBuffer.allocate(10000);

	        // Read the bytes with the proper encoding for this platform.  If
	        // you skip this step, you might see something that looks like
	        // Chinese characters when you expect Latin-style characters.
	        String encoding = System.getProperty("file.encoding");
	        
	        String bufferStr = "";
	        while (sbchannel.read(buffer) > 0) {
	            buffer.rewind();
	            bufferStr += Charset.forName(encoding).decode(buffer);
	            buffer.flip();
	        }
	        
	        if(bufferStr.contains(findStr3)){
	        	System.out.println("\tString \"" + findStr3 
	        			+ "\" has been FOUND in File = " + path.getFileName());
	        } else {
	        	System.out.println("\tString \"" + findStr3 
	        			+ "\" has NOT been found in File = " + path.getFileName());
	        }
	        
	        if(bufferStr.contains(findStr4)){
	        	System.out.println("\tString \"" + findStr4 
	        			+ "\" has been FOUND in File = " + path.getFileName());
	        } else {
	        	System.out.println("\tString \"" + findStr4 
	        			+ "\" has NOT been found in File = " + path.getFileName());
	        }
	        
	    } catch (IOException ex) {
	        System.out.println("\tCaught exception: " + ex);
	    }

	}

	private static boolean search(String searchMe, String findMe, int lineNo) {
		// TODO Auto-generated method stub

        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        for (int i = 0; 
             i <= (searchMeLength - findMeLength);
             i++) {
        	if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
        	   System.out.println("\tLine : " + lineNo 
        			   + " : " + searchMe);
        	   System.out.println("\t\"" + searchMe.substring(i, i + findMeLength)
            		  + "\" found on " + i + " position");
        	   return true;
           }
        }
		return false;
	}

}
