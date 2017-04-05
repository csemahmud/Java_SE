/**
 * 
 */
package com.mahmud.IO19FindByTXTAppPackage.classes;

import static java.nio.file.FileVisitResult.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class FindByTXT extends SimpleFileVisitor<Path> {
	
	private final String textToSearch;
	private List<Path> foundFiles;

	/**
	 * @param textToSearch
	 */
	public FindByTXT(String textToSearch) {
		super();
		this.textToSearch = textToSearch;
		foundFiles = new ArrayList<>();
	}

	/**
	 * 
	 */
	public FindByTXT() {
		this("");
	}

	public String getTextToSearch() {
		return textToSearch;
	}

	public List<Path> getFoundFiles() {
		return foundFiles;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		
		try (InputStream input = Files.newInputStream(file);
			    BufferedReader reader =
			      new BufferedReader(new InputStreamReader(input))) {
		    
			boolean isFound = false;
			String line = null;
		    for (int i = 1; (line = reader.readLine()) != null; i++) {
		        if(search(line, textToSearch, i)){
		        	isFound = true;
		        }
		    }
	        if(isFound){
	        	System.out.println("\tFile : " + file);
	        }
		    
		} catch (IOException ex) {
		    System.err.println(ex);
		}
		
	    // Defaults to READ
	    try (SeekableByteChannel sbchannel = Files.newByteChannel(file)) {
	    	
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
	        
	        if(bufferStr.contains(textToSearch)){
	        	foundFiles.add(file);
	        }
	        
	    } catch (IOException ex) {
	        System.out.println("\tCaught exception: " + ex);
	    }

		super.visitFile(file, attrs);
		
		return CONTINUE;
	}

	private boolean search(String searchMe, String findMe, int lineNo) {
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

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		
		if (exc instanceof FileSystemLoopException) {
	        System.err.println("cycle detected: " + file);
	    } else {
	        System.err.format("Unable to copy:" + " %s: %s%n", file, exc);
	    }
		super.visitFileFailed(file, exc);
		
		return CONTINUE;
	}

}
