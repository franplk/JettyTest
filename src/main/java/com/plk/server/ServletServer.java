package com.plk.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import com.plk.servlet.HelloServlet;

public class ServletServer {

	public static void main(String[] args) throws Exception {
		
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(HelloServlet.class, "/hello");
		handler.addServletWithMapping(HelloServlet.class, "/test");

		Server server = new Server(8080);
		server.setHandler(handler);
		server.start();
		server.join();
	}
}
