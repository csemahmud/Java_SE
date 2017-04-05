/**
 * 
 */
package com.mahmud.IO18WalkFileAppPackage.classes;

import java.io.IOException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import static java.nio.file.FileVisitResult.*;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class PrintFiles extends SimpleFileVisitor<Path> {
	
	private final String pattern;
	private final PathMatcher matcher;
    private int numMatches = 0;
	private  final String lookingForFile;

	/**
	 * @param pattern
	 * @param lookingForFile
	 */
	public PrintFiles(String pattern, String lookingForFile) {
		super();
		this.pattern = pattern;
		this.lookingForFile = lookingForFile;
		this.matcher = FileSystems.getDefault()
                .getPathMatcher("glob:" + pattern);
	}

	/**
	 * @param pattern
	 */
	public PrintFiles(String pattern) {
		this(pattern, "");
	}

	/**
	 * 
	 */
	public PrintFiles() {
		this("");
		// TODO Auto-generated constructor stub
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		
		if (dir.getFileName().toString().equals("NoAccess")) {
			System.out.format("\tABORTED ! Visitinig Directory: %s%n", dir);
			return SKIP_SUBTREE;
	    }
		
		System.out.format("\tStarting to Visit Directory: %s%n", dir);
		super.preVisitDirectory(dir, attrs);
		
		return CONTINUE;
	}
	
	// Print information about
    // each type of file.
	@Override
	public FileVisitResult visitFile(Path file, 
			BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		
		if(find(file)) {
			// No other action is necessary
		} else if (attrs.isRegularFile()) {
            System.out.format("\tRegular file: %s ", file);
        } else if (attrs.isSymbolicLink()) {
            System.out.format("\tSymbolic link: %s ", file);
        } else {
            System.out.format("\tOther: %s ", file);
        }
		
        System.out.println("(" + attrs.size() + "bytes)");
        super.visitFile(file, attrs);
		
		if (file.getFileName().toString().equals(lookingForFile)) {
	        System.out.println("\n\tLOCATED file: " + file);
	        return TERMINATE;
	    }
        
        return CONTINUE;
	}

	private boolean find(Path file) {
		// TODO Auto-generated method stub
		Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            numMatches++;
            System.out.print("\t\"" + pattern 
            		+ "\" : [" + numMatches + "] : " + file);
            return true;
        }
		return false;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, 
			IOException exc) throws IOException {
		// TODO Auto-generated method stub
		
		if (exc instanceof FileSystemLoopException) {
	        System.err.println("cycle detected: " + file);
	    } else {
	        System.err.format("Unable to copy:" + " %s: %s%n", file, exc);
	    }
		super.visitFileFailed(file, exc);
		
		return CONTINUE;
	}
	
	// Print each directory visited.
	@Override
	public FileVisitResult postVisitDirectory(Path dir, 
			IOException exc) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.format("\tFinished Visiting Directory: %s%n", dir);
		super.postVisitDirectory(dir, exc);
		
		return CONTINUE;
	}
	

}
