/**
 * 
 */
package com.mahmud.IO12MetaDataAppPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;

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
		
		Path directory = Paths.get("docs/mahmud/example");
		Path path = directory.resolve("text.txt");
		try {
			BasicFileAttributes attributes 
					= Files.readAttributes(path, BasicFileAttributes.class);

			System.out.println("\tcreationTime: " + attributes.creationTime());
			System.out.println("\tlastAccessTime: " + attributes.lastAccessTime());
			System.out.println("\tlastModifiedTime: " + attributes.lastModifiedTime());

			System.out.println("\tisDirectory: " + attributes.isDirectory());
			System.out.println("\tisOther: " + attributes.isOther());
			System.out.println("\tisRegularFile: " + attributes.isRegularFile());
			System.out.println("\tisSymbolicLink: " + attributes.isSymbolicLink());
			System.out.println("\tsize: " + attributes.size());
			
			long currentTime = System.currentTimeMillis();
			FileTime fileTime = FileTime.fromMillis(currentTime);
			Files.setLastModifiedTime(path, fileTime);
			
			attributes 
				= Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("\tAfter Changing, lastModifiedTime: " + attributes.lastModifiedTime());
			
			System.out.println();
			
			DosFileAttributes dosAttr =
			        Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println("\tisReadOnly is : " + dosAttr.isReadOnly());
		    System.out.println("\tisHidden is : " + dosAttr.isHidden());
		    System.out.println("\tisArchive is : " + dosAttr.isArchive());
		    System.out.println("\tisSystem is : " + dosAttr.isSystem());
		    
		    Files.setAttribute(path, "dos:hidden", !dosAttr.isHidden());
		    
		    dosAttr =
			        Files.readAttributes(path, DosFileAttributes.class);
		    System.out.println("\tAfter Changing, isHidden is : " + dosAttr.isHidden());
		    
		    PosixFileAttributes posixAttr =
		    	    Files.readAttributes(path, PosixFileAttributes.class);
		    	System.out.format("\t%s %s %s%n",
		    			posixAttr.owner().getName(),
		    			posixAttr.group().getName(),
		    	    PosixFilePermissions.toString(posixAttr.permissions()));
		
		} catch (UnsupportedOperationException ex) {
		    
			System.err.println("\tDOS file" +
		            " attributes not supported : " + ex);
	    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		
		}

	}

}
