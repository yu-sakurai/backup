package com.internousdev.login.util;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class DBConnector {
	private static String driverName="com.mysql.jdbcDriver";
	private static String url="jdbc:mysql://localhost/logindb";
	
	
	private static String user="root";
	private static String password="mysql";
	
	public Connection getConnection(){
		Connection con=null;
	
	
	try{
		Class.forName(driverName);
		con=(Connection)DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;
	
	
	
	}
}
