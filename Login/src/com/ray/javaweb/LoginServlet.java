package com.ray.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class LoginServlet implements Servlet{
	
	private ServletConfig servletConfig;

	@Override
	public void destroy() {
		System.out.println("destroy...");
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		
		return servletConfig.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
		this.init();
	}
	
	public void init() {
		
	}

	@Override
	public abstract void service(ServletRequest request, ServletResponse response) throws ServletException, IOException;

	
}
