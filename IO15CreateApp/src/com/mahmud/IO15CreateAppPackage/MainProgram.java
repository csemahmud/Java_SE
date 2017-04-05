/**
 * 
 */
package com.mahmud.IO15CreateAppPackage;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

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
		
		System.out.print("\n\n\tRoot Directories Are : {");
		
		Iterable<Path> directories = FileSystems.getDefault().getRootDirectories();
		for (Path name: directories) {
		    System.out.print("\t" + name + ",");
		}
		System.out.println("\t}");
		
		Iterator<Path> iterator = directories.iterator();
		
		Path rootDirectory = null;
		for (int i = 1; iterator.hasNext(); i++) {			
			if(i == 2){
				rootDirectory = iterator.next();
				break;
			} else {
				iterator.next();
			}
		}
		
		if(rootDirectory != null){
			
			Path directory = rootDirectory.resolve("/output_java/docs/mahmud/example");
			if(!Files.exists(directory)){
				
				try {
					
					Files.createDirectory(directory);
					
				} catch (IOException ex) {
					
					// TODO Auto-generated catch block
					System.out.println("\tError : Parent Directories Do not Exists !!!");
					
					try {
						
						Files.createDirectories(directory);
						System.out.println("\tDirectory : " 
								+ directory + " has been created succussfully .");
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			} else {
				
				System.out.println("\tDirectory : " 
						+ directory + " already exits .");
				
			}
			
			Path file = directory.resolve("text.txt");
			
			try {
			    // Create the empty file with default permissions, etc.
			    Files.createFile(file);
			    System.out.println("\tFile : " 
						+ file + " has been created succussfully .");
			} catch (FileAlreadyExistsException x) {
			    System.out.format("\tError : file named %s" +
			        " already exists%n", file);
			} catch (IOException x) {
			    // Some other sort of failure, such as permissions.
			    System.err.format("\tcreateFile error: %s%n", x);
			}
			
			Path dir2 = directory.resolve("dir2");
			Path dir3 = directory.resolve("dir3");
			Path dir4 = directory.resolve("dir4");
			Path dir5 = directory.resolve("dir5");
			Path text2 = directory.resolve("text2.txt");
			Path text3 = directory.resolve("text3.txt");
			Path text4 = directory.resolve("text4.txt");
			Path text5 = directory.resolve("text5.txt");
			Path java1 = directory.resolve("java1.java");
			Path java2 = directory.resolve("java2.java");
			Path class1 = directory.resolve("class1.class");
			Path jar1 = directory.resolve("jar1.jar");
			
			try {

				if(!Files.exists(dir2)){
					Files.createDirectory(dir2);
				}
				
				if(!Files.exists(dir3)){
					Files.createDirectory(dir3);
				}
				
				if(!Files.exists(dir4)){
					Files.createDirectory(dir4);
				}
				
				if(!Files.exists(dir5)){
					Files.createDirectory(dir5);
				}
				
				if(!Files.exists(text2)){
					Files.createFile(text2);
				}
				
				if(!Files.exists(text3)){
					Files.createFile(text3);
				}
				
				if(!Files.exists(text4)){
					Files.createFile(text4);
				}
				
				if(!Files.exists(text5)){
					Files.createFile(text5);
				}
				
				if(!Files.exists(java1)){
					Files.createFile(java1);
				}
				
				if(!Files.exists(java2)){
					Files.createFile(java2);
				}
				
				if(!Files.exists(class1)){
					Files.createFile(class1);
				}
				
				if(!Files.exists(jar1)){
					Files.createFile(jar1);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("\n\tAll elements of the Directory, "
					+ directory + " are : ");
			
			try (DirectoryStream<Path> stream 
					= Files.newDirectoryStream(directory)) {
			    
				System.out.print("\t{");
				for (Path path: stream) {
			        System.out.print("\t" + path.getFileName() + ",");
			    }				
				System.out.println("\t}");
				
			} catch (IOException | DirectoryIteratorException x) {
			    // IOException can never be thrown by the iteration.
			    // In this snippet, it can only be thrown by newDirectoryStream.
			    System.err.println(x);
			}
			
			System.out.println("\n\t*.txt files of the Directory, "
					+ directory + " are : ");
			
			try (DirectoryStream<Path> stream 
					= Files.newDirectoryStream(directory, "*.{txt}")) {
			    
				System.out.print("\t{");				
				for (Path path: stream) {
			        System.out.print("\t" + path.getFileName() + ",");
			    }				
				System.out.println("\t}");
				
			} catch (IOException | DirectoryIteratorException x) {
			    // IOException can never be thrown by the iteration.
			    // In this snippet, it can only be thrown by newDirectoryStream.
			    System.err.println(x);
			}
			
			System.out.println("\n\tjava,class,jar files of the Directory, "
					+ directory + " are : ");
			
			try (DirectoryStream<Path> stream 
					= Files.newDirectoryStream(directory, "*.{java,class,jar}")) {
			    
				System.out.print("\t{");
				for (Path path: stream) {
			        System.out.print("\t" + path.getFileName() + ",");
			    }				
				System.out.println("\t}");
				
			} catch (IOException | DirectoryIteratorException x) {
			    // IOException can never be thrown by the iteration.
			    // In this snippet, it can only be thrown by newDirectoryStream.
			    System.err.println(x);
			}
			
			DirectoryStream.Filter<Path> filter =
			    new DirectoryStream.Filter<Path>() {

					@Override
					public boolean accept(Path entry) throws IOException {
						// TODO Auto-generated method stub
						
						return (Files.isDirectory(entry));
						
					}
			};
			
			System.out.println("\n\tAll the directories inside the Directory, "
					+ directory + " are : ");
			
			try (DirectoryStream<Path> stream 
					= Files.newDirectoryStream(directory, filter)) {
			    
				System.out.print("\t{");
				for (Path path: stream) {
			        System.out.print("\t" + path.getFileName() + ",");
			    }				
				System.out.println("\t}");
				
			} catch (IOException | DirectoryIteratorException x) {
			    // IOException can never be thrown by the iteration.
			    // In this snippet, it can only be thrown by newDirectoryStream.
			    System.err.println(x);
			}
		}

	}

}
