package com.internousdev.Wsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.Wsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginUserPassword;
	private String userName;
	public Map<String,Object> session;
	private UserCreateCompleteDAO uCCDAO=new UserCreateCompleteDAO();
	
	public String execute() throws SQLException{
		
		
		uCCDAO.createUser(session.get("loginUserId").toString(),
				session.get("loginUserPassword").toString(),
				session.get("userName").toString());
		String ret=SUCCESS;
		return ret;
		
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginUserPassword() {
		return loginUserPassword;
	}

	public void setLoginUserPassword(String loginUserPassword) {
		this.loginUserPassword = loginUserPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	

}
