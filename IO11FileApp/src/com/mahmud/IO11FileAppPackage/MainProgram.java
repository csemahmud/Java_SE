/**
 * 
 */
package com.mahmud.IO11FileAppPackage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

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
	public static void main(String[] args) throws NoSuchFileException {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		
		Path exampleDir = Paths.get("docs/mahmud/example");
		Path path = exampleDir.resolve("output.txt");
		
		System.out.format("\ttoString: %s%n", path.toString());
		System.out.format("\tgetFileName: %s%n", path.getFileName());
		System.out.format("\tgetName(0): %s%n", path.getName(0));
		System.out.format("\tgetNameCount: %d%n", path.getNameCount());
		System.out.format("\tsubpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("\tgetParent: %s%n", path.getParent());
		System.out.format("\tgetRoot: %s%n", path.getRoot());
		
		System.out.println();
		
		Charset charset = Charset.forName("UTF-8");
		String string = "আমার নাম মাহমুদুল হাসান খান । My name is Mahmudul Hasan Khan";
		
		Path errorPath = Paths.get("docs/mahmud/example2/output.txt");
		
		Path root = null;
		
		try (BufferedWriter writer = Files.newBufferedWriter(errorPath, charset)) {
			
		    writer.write(string, 0, string.length());
		    
		} catch (NoSuchFileException ex) {
			
		    System.out.format("\t%s does not exist%n", ex.getFile());
		    
		    try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
		    	
			    writer.write(string, 0, string.length());
			    System.out.println("\t" + path.getFileName() + " has been written successfully");
				
			    System.out.format("\ttoUri() = %s%n", path.toUri());
				System.out.format("\ttoAbsolutePath() = %s%n", path.toAbsolutePath());				
				System.out.format("\ttoRealPath() = %s%n", path.toRealPath());
				
				root =  path.toRealPath().getRoot();
				
				System.out.format("\trelativize(Paths.get(\"pics\")) = %s%n", path.relativize(Paths.get("pics")));
			    
			} catch (IOException x) {
				
			    System.out.format("\tIOException: %s%n", x.getMessage());
			    
			}
		} catch (IOException ex) {
			
		    System.out.format("\tIOException: %s%n", ex);
		    
		}
		
		System.out.println();
		
		if(Files.isRegularFile(path) && Files.isReadable(path) && Files.isExecutable(path)) {
			System.out.println("\t" + path.getFileName() + " is Regular, Readable and Executable");
		}
		
		Path path2 = exampleDir.resolve("test.txt");
		Path path3 = exampleDir.resolve("output.txt");
		
		try {
			if(Files.isSameFile(path, path2)){
				System.out.println("\tpath and path2 is SAME .");
			} else {
				System.out.println("\tpath and path2 is NOT same.");
			}
			
			if(Files.isSameFile(path, path3)){
				System.out.println("\tpath and path3 is SAME .");
			} else {
				System.out.println("\tpath and path3 is NOT same.");
			}
			
			if(Files.isSameFile(path, errorPath)){
				System.out.println("\tpath and errorPath is SAME .");
			} else {
				System.out.println("\tpath and errorPath is NOT same.");
			}
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			System.out.format("\tIOException from Files.isSameFile:%n\t%s%n", ex);
		}
		
		System.out.println();
		
		String successfulOperations = "successfulOperations = ";
		
		Path deleteFile = exampleDir.resolve("delete.txt");
		
		try {
		    Files.delete(deleteFile);
		    successfulOperations += " delete,";
		} catch (NoSuchFileException ex) {
		    System.out.format("\t%s: no such" + " file or directory%n", deleteFile);
		} catch (DirectoryNotEmptyException ex) {
		    System.out.format("\t%s not empty%n", deleteFile);
		} catch (IOException ex) {
		    // File permission problems are caught here.
		    System.out.println("\t" + ex);
		}
		
		Path newDirectory = root.resolve("java_output");
		try {
			if(!Files.exists(newDirectory)) {
				Files.createDirectory(newDirectory);
			}
		} catch (IOException exDir) {
			// TODO Auto-generated catch block
			System.out.println("\tFailed to Create : " + newDirectory);
		}
		
		Path source = path;
		Path target = newDirectory.resolve("output.txt");
		
		try {
			Files.copy(source, target, 
					REPLACE_EXISTING, COPY_ATTRIBUTES);
		    successfulOperations += " copy,";
		} catch (NoSuchFileException ex) {
		    System.out.format("\t%s: no such" + " file or directory%n", source);
			
		} catch (DirectoryNotEmptyException ex) {
		    System.out.format("\t%s not empty%n", source);
		} catch (IOException ex) {
		    // File permission problems are caught here.
		    System.out.println("\t" + ex);
		} 
		
		source = null;
		target = null; 
		source = exampleDir.resolve("move.txt");
		target = newDirectory.resolve("move.txt");
		
		try {
			Files.move(source, target, 
					REPLACE_EXISTING, ATOMIC_MOVE);
		    successfulOperations += " move";
		} catch (NoSuchFileException ex) {
		    System.out.format("\t%s: no such" + " file or directory%n", source);
		} catch (DirectoryNotEmptyException ex) {
		    System.out.format("\t%s not empty%n", source);
		} catch (IOException ex) {
		    // File permission problems are caught here.
		    System.out.println("\t" + ex);
		}
		
		System.out.println("\t" + successfulOperations);

	}

}
