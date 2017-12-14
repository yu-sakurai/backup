package com.internousdev.web01.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/web01";
	private static String user="root";
	private static String password="mysql";
	
	public Connection getConnection(){
		Connection con=null;
		
		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

}
