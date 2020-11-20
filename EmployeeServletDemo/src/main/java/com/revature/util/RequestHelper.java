package com.revature.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Employee;
import com.revature.models.EmployeeDTO;
import com.revature.models.LoginTemplate;
import com.revature.services.EmployeeService;

public class RequestHelper {
	
	private static Logger log = Logger.getLogger(RequestHelper.class);
	private static ObjectMapper om = new ObjectMapper();
	
	public static void processLogin(HttpServletRequest request, HttpServletResponse response) throws IOException{
		BufferedReader reader = request.getReader();
		StringBuilder s = new StringBuilder();
		
		String line = reader.readLine();
		
		//transfer reader data to our string, line by line
		while(line != null) {
			s.append(line);
			line = reader.readLine();
		}
		
		String body = s.toString();
		System.out.println(body);
		
		LoginTemplate loginAttempt = om.readValue(body, LoginTemplate.class);
		String username = loginAttempt.getUsername();
		String password = loginAttempt.getPassword();
		
		log.info("User attempted to login with username: "+username);
		Employee e = EmployeeService.confirmLogin(username, password);
		
		if(e != null) {
			//Get the current session or create one.
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			PrintWriter writer = response.getWriter();
			response.setContentType("application/json");
			
			//Create an EmployeeDTO from Employee object.
			EmployeeDTO eDTO = EmployeeService.convertToDTO(e);
			
			writer.println(om.writeValueAsString(eDTO));
			
			log.info(username+" has successfully logged in.");
		}else {
			response.setContentType("application/json");
			response.setStatus(204);	//successful connection, no content (no user found).
		}
	}

	public static void processLogout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			String username = (String) session.getAttribute("username");
			log.info(username+" has logged out.");
			session.invalidate();
					
		}
		
	}

	public static void processEmployees(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("application/json");
		
		List<Employee> allEmps = EmployeeService.findAll();
		List<EmployeeDTO> allDTO = new ArrayList<>();
		
		for(Employee e : allEmps) {
			allDTO.add(EmployeeService.convertToDTO(e));
		}
		
		String json = om.writeValueAsString(allDTO);
		
		PrintWriter writer = response.getWriter();
		
		writer.println(json);
		
	}

}
