/**
 * 
 */
package com.mahmud.IO20WatchDirAppPackage;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import static java.nio.file.StandardWatchEventKinds.*;

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
		
		Iterator<Path> iterator 
			= FileSystems.getDefault().getRootDirectories().iterator();
		
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
			
			Path watchDirectory = rootDirectory.resolve("/output_java/watch_directory");
			if(!Files.exists(watchDirectory)){
				try {
					Files.createDirectories(watchDirectory);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("\tWatch Directory is : " + watchDirectory);
			
			try {
				WatchService watcher = FileSystems.getDefault().newWatchService();
				
				try {
				    WatchKey key = watchDirectory.register(watcher,
				                           ENTRY_CREATE,
				                           ENTRY_DELETE,
				                           ENTRY_MODIFY);
				    
				    for (;;) {

				        // wait for key to be signaled
				    	
				        try {
				            key = watcher.take();
				        } catch (InterruptedException x) {
				            return;
				        }

				        for (WatchEvent<?> event: key.pollEvents()) {
				            WatchEvent.Kind<?> kind = event.kind();

				            // This key is registered only
				            // for ENTRY_CREATE events,
				            // but an OVERFLOW event can
				            // occur regardless if events
				            // are lost or discarded.
				            if (kind == OVERFLOW) {
				                continue;
				            }

				            // The filename is the
				            // context of the event.
				            WatchEvent<Path> ev = cast(event);
				            
				            Path filename = ev.context();

				            // Verify that the new
				            //  file is a text file.
				            try {
				                // Resolve the filename against the directory.
				                // If the filename is "test" and the directory is "foo",
				                // the resolved name is "test/foo".
				                Path child = watchDirectory.resolve(filename);
				                if ((Files.probeContentType(child)!=null)
				                		&&!Files.probeContentType(child).equals("text/plain")) {
				                    System.err.format("\tNew file '%s'" +
				                        " is not a plain text file.%n", filename);
				                    continue;
				                }
				            } catch (IOException x) {
				                System.err.println(x);
				                continue;
				            }
				            
				            Path path = watchDirectory.resolve(filename);
				            
				            if(kind == ENTRY_CREATE) {
				            	
				            	if(Files.isDirectory(path)) {

					            	System.out.format("\tCreating Directory %s%n", filename);
						            
					            	// Email the file to the
						            //  specified email alias.
						            System.out.format("\tEmailing Directory %s%n", filename);
						            //Details left to reader....
						            
				            	} else {
				            		
					            	System.out.format("\tCreating file %s%n", filename);
						            
					            	// Email the file to the
						            //  specified email alias.
						            System.out.format("\tEmailing file %s%n", filename);
						            //Details left to reader....
				            	}
					            
				            } else if(kind == ENTRY_MODIFY) {
				            	
				            	if(Files.isDirectory(path)) {

					            	System.out.format("\tUpdating Directory %s%n", filename);
						            
					            	// Email the file to the
						            //  specified email alias.
						            System.out.format("\tEmailing Directory %s%n", filename);
						            //Details left to reader....
						            
				            	} else {
					            	System.out.format("\tUpdating file %s%n", filename);
						            
					            	// Email the file to the
						            //  specified email alias.
						            System.out.format("\tEmailing file %s%n", filename);
						            //Details left to reader....
				            	}
					            
				            } else if(kind == ENTRY_DELETE) {
				            	
				            	if(Files.isDirectory(path)) {

					            	System.out.format("\tDeleting Directory %s%n", filename);
						            
				            	} else {
				            		
					            	System.out.format("\tDeleting file %s%n", filename);
					            	
				            	}
					            
				            }
				        }

				        // Reset the key -- this step is critical if you want to
				        // receive further watch events.  If the key is no longer valid,
				        // the directory is inaccessible so exit the loop.
				        boolean valid = key.reset();
				        if (!valid) {
				            break;
				        }
				    }
				} catch (IOException x) {
				    System.err.println(x);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@SuppressWarnings("unchecked")
	private static WatchEvent<Path> cast(WatchEvent<?> event) {
		// TODO Auto-generated method stub
		return (WatchEvent<Path>)event;
	}

}
