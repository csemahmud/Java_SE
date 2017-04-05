/**
 * 
 */
package com.mahmud.IO13BufferedIOAppPackage;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

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
		
		Path dirctory = Paths.get("docs");
		Path path = dirctory.resolve("output.txt");
		
		Charset charset = Charset.forName("UTF-8");
		String string = "\tআমার নাম মাহমুদুল হাসান খান ।\n\tMy name is Mahmudul Hasan Khan\n";
		
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
		    
			writer.write(string, 0, string.length());
			
		} catch (IOException ex) {
		    System.err.format("\tIOException: %s%n", ex);
		}
		
		try (InputStream input = Files.newInputStream(path);
			    BufferedReader reader =
			      new BufferedReader(new InputStreamReader(input))) {
		    
			String line = null;
		    for (int i = 1; (line = reader.readLine()) != null; i++) {
		        System.out.println("[" + i + "]." + line);
		    
		    }
		} catch (IOException ex) {
		    System.err.println(ex);
		}
		
		System.out.println();
		
	    byte byteData[] = string.getBytes();
	    Path logfile = dirctory.resolve("logfile.txt");

	    try (OutputStream output = new BufferedOutputStream(	    		
	      Files.newOutputStream(logfile, CREATE, APPEND))) {
	    	
	      output.write(byteData, 0, byteData.length);
	      
	    } catch (IOException ex) {
	      System.err.println(ex);
	    }
	    
	    // Defaults to READ
	    try (SeekableByteChannel sbchannel = Files.newByteChannel(logfile)) {
	    	
	        ByteBuffer buffer = ByteBuffer.allocate(10000);

	        // Read the bytes with the proper encoding for this platform.  If
	        // you skip this step, you might see something that looks like
	        // Chinese characters when you expect Latin-style characters.
	        String encoding = System.getProperty("file.encoding");
	        while (sbchannel.read(buffer) > 0) {
	            buffer.rewind();
	            System.out.print(Charset.forName(encoding).decode(buffer));
	            buffer.flip();
	        }
	        
	    } catch (IOException ex) {
	        System.out.println("\tCaught exception: " + ex);
	    }
	    System.out.println();
	    
    	Path newfile = dirctory.resolve("newfile.txt");
	    
	    try {
	    	
	        // Create the empty file with default permissions, etc.
	        Files.createFile(newfile);
	        System.out.println("\t" + newfile.getFileName() 
	        		+ " has been created successully .");
	        
	    } catch (FileAlreadyExistsException ex) {
	    	
	        System.err.format("\tFile named %s" +
	            " already exists%n", newfile);
	        
	    } catch (IOException ex) {
	        // Some other sort of failure, such as permissions.
	        System.err.format("\tcreateFile error: %s%n", ex);
	    }
	    
	    try {
	    	
	        Path tempFile = Files.createTempFile(null, ".myapp");
	        System.out.format("\tThe temporary file" +
	            " has been created: %s%n", tempFile);
	        
	    } catch (IOException x) {
	        System.err.format("\tIOException: %s%n", x);
	    }

	}

}
