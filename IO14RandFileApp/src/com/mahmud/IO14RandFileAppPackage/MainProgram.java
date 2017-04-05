/**
 * 
 */
package com.mahmud.IO14RandFileAppPackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
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
		
		String string = "\n\tআমার নাম মাহমুদুল হাসান খান ।\n\tMy name is Mahmudul Hasan Khan\n";
		byte data[] = string.getBytes();
		ByteBuffer output = ByteBuffer.wrap(data);
		string = "\n\tএটা file - এর শেষে যোগ করা হবে ।";
		ByteBuffer lastOutput = ByteBuffer.wrap(string.getBytes());

		ByteBuffer copy = ByteBuffer.allocate(30);
		
		System.out.println("\n\n");

		try (FileChannel fchannel = (FileChannel.open(Paths.get("docs/file.txt"), READ, WRITE))) {
			
		    // Read the first 30
		    // bytes of the file.
		    int nread;
		    do {
		        nread = fchannel.read(copy);
		    } while (nread != -1 && copy.hasRemaining());

		    // Write given string :
		    // \tআমার নাম মাহমুদুল হাসান খান ।\n\tMy name is Mahmudul Hasan Khan\n
		    // at the beginning of the file.
		    fchannel.position(0);
		    while (output.hasRemaining()) {
		        fchannel.write(output);
		    }
		    output.rewind();

		    // Move to the end of the file.  Copy the first 12 bytes to
		    // the end of the file.  Then write "I was here!" again.
		    long length = fchannel.size();
		    fchannel.position(length-1);
		    copy.flip();
		    while (copy.hasRemaining()) {
		        fchannel.write(copy);
		    }
		    while (output.hasRemaining()) {
		        fchannel.write(output);
		    }
		    while (lastOutput.hasRemaining()) {
		        fchannel.write(lastOutput);
		    }
		    
		    System.out.println("\tFile has been written successfully .");
		    
		} catch (IOException x) {
		    System.out.println("\tI/O Exception: " + x);
		}

	}

}
