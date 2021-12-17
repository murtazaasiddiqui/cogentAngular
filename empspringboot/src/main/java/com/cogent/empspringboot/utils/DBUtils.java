package com.cogent.empspringboot.utils;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // singleton object
@Lazy(value = true)
public class DBUtils {
	
	@Autowired  // DI
	DataSource dataSource;
	
	public DBUtils() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	// singleton pattern.
	public Connection getConnection() {
	
		
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} 