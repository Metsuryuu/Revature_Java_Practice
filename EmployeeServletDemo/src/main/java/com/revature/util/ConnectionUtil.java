package com.revature.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConnectionUtil {
	
	private static Logger log = Logger.getLogger(ConnectionUtil.class);
	
	public static Connection getConnection() {
		
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			log.warn("Cannot load driver");
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		
		Connection conn = null;
		
		try {
			prop.load(loader.getResourceAsStream("connection.properties"));
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			try {
				
				conn = DriverManager.getConnection(url, username, password);
				
			}catch(SQLException e) {
				log.warn("Unable to obtain connection to database.", e);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}

}
