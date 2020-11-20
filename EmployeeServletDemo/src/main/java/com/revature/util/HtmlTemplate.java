package com.revature.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/*
 * This is just for convenience. 
 * Helper class to facilitate creating html documents from Java.
 */

public class HtmlTemplate {
	
	public static void goBack(PrintWriter writer) {
		writer.println("<hr><input type='button' value='Back'"
					+"onclick='goBack()'>"
					+"<script>"
					+"function goBack() { window.history.back(); }"
					+"</script>");
		//this incorporates Javascript within the script tag.
	}
	
	public static PrintWriter getHtmlWriter(HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		return response.getWriter();
	}
	
	//the ...header is varargs which accepts an array of params of unspecified capacity.
	// -> PrintWriter + ["header1","header2","header3", ... ,"headern"
	public static void printTableHeaders(PrintWriter writer, String ...headers) {
		writer.println("<table border=2px><tr>");
		for(String h : headers) {
			writer.println("<th>"+h+"</th>");
		}
		writer.println("</tr></table>");
	}

}
