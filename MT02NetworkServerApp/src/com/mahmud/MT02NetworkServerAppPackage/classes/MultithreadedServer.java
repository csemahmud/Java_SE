/**
 * 
 */
package com.mahmud.MT02NetworkServerAppPackage.classes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MultithreadedServer {
	
	private final int port;

	/**
	 * @param port
	 */
	public MultithreadedServer(int port) {
		this.port = port;
	}

	/**
	 * 
	 */
	public MultithreadedServer() {
		// TODO Auto-generated constructor stub
		this(8080);
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}
	
	public void listen() {
		int poolSize = 100 * Runtime.getRuntime().availableProcessors();
		ExecutorService taskList = Executors.newFixedThreadPool(poolSize);
		try(ServerSocket listener = new ServerSocket(port)) {
			Socket socket;
			int i = 0;
			while(true) { // Run until killed
				socket = listener.accept();
				taskList.execute(new ConnectionHandler(socket));
				i++;
				if(i > 60){
					break;
				}
			}
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe);
			ioe.printStackTrace();
		}
	}

}
