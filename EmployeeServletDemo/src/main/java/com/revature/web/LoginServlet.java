package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.revature.models.Employee;
import com.revature.services.EmployeeService;
import com.revature.util.HtmlTemplate;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(LoginServlet.class);
       
    public LoginServlet() {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Handle parameters from index.html.
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		log.info("User attempted to login with username " + username);
		Employee e = EmployeeService.confirmLogin(username, password);
		
		if(e != null) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			//send the user to the homepage.
			RequestDispatcher dispatch = request.getRequestDispatcher("home.html");
			dispatch.forward(request, response);
			
			log.info(username + " has successfully logged on");
		}else {
			PrintWriter writer = HtmlTemplate.getHtmlWriter(response);	//we will create an html page on the fly using a template.
			log.info(username+" has failed to login");
			writer.println("<h3 style='color:red'>Denied</h3>");
			writer.println("<p>Username or password is incorrect</p>");
			
		}
	}

}
