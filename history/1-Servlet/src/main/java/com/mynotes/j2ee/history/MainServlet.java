package com.mynotes.j2ee.history;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1031422249396784970L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		String servletPath = req.getServletPath();
		System.out.println("servletPath===>" + servletPath);
		String contextPath = req.getContextPath();
		System.out.println("contextPath===>" + contextPath);
		String pathInfo = req.getPathInfo();
		System.out.println("pathInfo===>" + pathInfo);
		if (pathInfo.contains("admin")) {
			out.println("<h1>Welcome to Admin section<h2>");
		} else if (pathInfo.contains("user")) {
			out.println("<h1>Welcome to User section<h2>");
		} else {
			out.println("<h1>ERROR!!!!!!<h2>");
		}

		out.println("</body></html>");
		out.flush();
		out.close();
	}

}
