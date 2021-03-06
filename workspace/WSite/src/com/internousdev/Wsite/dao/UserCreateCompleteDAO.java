package com.internousdev.Wsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.Wsite.util.DBConnector;
import com.internousdev.Wsite.util.DateUtil;

public class UserCreateCompleteDAO implements SessionAware{
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil dateUtil=new DateUtil();
	public Map<String,Object> session;
	private String sql="INSERT INTO login_user_transaction (login_id, login_pass, user_name, insert_date) VALUES(?, ? ,?,?)";
	
	public void createUser(String loginUserId,String loginUserPassword,String userName)throws SQLException{
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginUserPassword);
			ps.setString(3, userName);
			ps.setString(4, dateUtil.getDate());
			
			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	

}
