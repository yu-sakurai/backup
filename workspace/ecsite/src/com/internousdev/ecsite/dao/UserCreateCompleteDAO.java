package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;

public class UserCreateCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();

	private String sql="INSERT INTO login_user_transaction (login_id, login_pass, user_name) VALUES(?, ? ,?)";
	public void createUser(String createUserId,String createUserPassword,String createUserName) throws SQLException{

		try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, createUserId);
		ps.setString(2, createUserPassword);
		ps.setString(3, createUserName);

		ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			con.close();
		}

	}
}
