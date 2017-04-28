/**
 * 
 */
package com.plk.server;

import org.eclipse.jetty.server.Server;

import com.plk.handler.HelloWorldHandler;

/**
 * @author franplk
 *
 */
public class HelloWorldServer {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		server.setHandler(new HelloWorldHandler());
		server.start();
	}
}
