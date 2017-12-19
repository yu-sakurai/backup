package com.internousdev.ECsite.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ECsite.dto.LoginDTO;
import com.internousdev.ECsite.util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LoginDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private LoginDTO loginDTO=new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		String sql="SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				loginDTO.setLoginUserId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));


				if(!(rs.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return loginDTO;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}
}


