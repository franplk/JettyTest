/**
 * 
 */
package com.plk.server;

import org.eclipse.jetty.server.Server;

import com.plk.handler.GreetingHandler;

/**
 * @author franplk
 *
 */
public class GreetingServer {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		server.setHandler(new GreetingHandler());
		server.start();
		server.join();
	}
}
