package com.internousdev.WebPro5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.WebPro5.dto.LoginDTO;
import com.internousdev.WebPro5.util.DBConnector;

public class LoginDAO {
	private String username;
	private String password;
	
	public List<LoginDTO> loginDTOList=new ArrayList<LoginDTO>();
	
	public List<LoginDTO> select(String username,String password){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		
		String sql="select * from users where user_name=? and password=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			
			while(rs.next()){
				LoginDTO dto=new LoginDTO();
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}
			if(loginDTOList.size()<=0){
				LoginDTO dto=new LoginDTO();
				dto.setUsername("NOT FOUND");
				dto.setPassword("NOT FOUND");
				loginDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return loginDTOList;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
