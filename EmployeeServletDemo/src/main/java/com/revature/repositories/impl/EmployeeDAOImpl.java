package com.revature.repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Employee;
import com.revature.repositories.EmployeeDAO;
import com.revature.util.CloseStreams;
import com.revature.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static Logger log = Logger.getLogger(EmployeeDAOImpl.class);

	public boolean insert(Employee e) {
		
		PreparedStatement statement = null;
		
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "Insert into webapp.employee(first_name, last_name, username, pass)"+
						  "Values(?,?,?,?)";
			statement = conn.prepareStatement(sql);
			
			statement.setString(1, e.getFirstName());
			statement.setString(2, e.getLastName());
			statement.setString(3, e.getUsername());
			statement.setString(4, e.getPassword());
			
			if(!statement.execute()) {
				return false;
			}
		} catch (SQLException e1) {
			log.warn("Unable to enter user.");
			return false;
		}finally {
			//We want to close resources (in this case statement).
			CloseStreams.close(statement);
		}
		return true;
	}

	public boolean update(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Employee> findAll() {
		
		List<Employee> eList = new ArrayList<>();
		PreparedStatement statement = null;
		
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "Select * from webapp.employee";
			
			statement = conn.prepareStatement(sql);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				
				Employee e = new Employee();
				
				e.setId(result.getInt("id"));
				e.setFirstName(result.getString("first_name"));
				e.setLastName(result.getString("last_name"));
				e.setUsername(result.getString("username"));
				e.setPassword(result.getString("pass"));
				e.setHireDate(result.getTimestamp("hire_date").toLocalDateTime());
				
				eList.add(e);
			}
		} catch (SQLException e1) {
			log.warn("Unable to retrieve users.");
		}
		return eList;
	}

}
