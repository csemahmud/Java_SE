/**
 * 
 */
package com.mahmud.MT02NetworkServerAppPackage.classes;

import java.io.IOException;
import java.net.Socket;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class ConnectionHandler implements Runnable {

	private Socket socket;

	/**
	 * 
	 */
	public ConnectionHandler() {
		// TODO Auto-generated constructor stub
	}

	public ConnectionHandler(Socket socket) {
		// TODO Auto-generated constructor stub
		this();
		this.socket = socket;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			handleConnection(socket);
			} catch(IOException ioe) {
				System.err.println("IOException: " + ioe);
				ioe.printStackTrace();
			}

	}
	
	public void handleConnection(Socket socket)
			throws IOException{
			// Do something with socket
		
		System.out.println("\tsocket = " + socket);
		try {
			Thread.sleep(Math.round(1000.0*Math.random()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}

}
