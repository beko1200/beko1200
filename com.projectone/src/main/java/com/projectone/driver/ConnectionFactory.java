package com.projectone.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
		private final static String url = "jdbc:postgresql://mydatabase.cmqpltchokm0.us-east-1.rds.amazonaws.com:5432/projectone";
	    private final static String user = "bulut";
	    private final static String password = "parola";
	    
	    public static Connection connect() throws SQLException {
	    	DriverManager.registerDriver(new org.postgresql.Driver());
	    	 
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to the Amazon PostgreSQL server successfully.");
	     
	        } catch (SQLException  e) {
	            System.out.println("No connection established");
	        	System.out.println(e.getMessage());
	        }
	            
	     
	        System.out.println("Connection  is "+ conn.toString());
	 
	        return conn;
	    
	    }

		public String getUrl() {
			return url;
		}

		public String getUser() {
			return user;
		}

		public String getPassword() {
			return password;
		}

	}

