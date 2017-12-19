package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String createUserId;
	private String createUserPassword;
	private String createUserName;
	public Map<String ,Object> session;
	private UserCreateCompleteDAO uccDAO=new UserCreateCompleteDAO();


	public String execute() throws SQLException {
		uccDAO.createUser(session.get("createUserId").toString(),
				session.get("createUserPassword").toString(),
				session.get("createUserName").toString());

		return SUCCESS;

	}


	public String getCreateUserId() {
		return createUserId;
	}


	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}


	public String getCreateUserPassword() {
		return createUserPassword;
	}


	public void setCreateUserPassword(String createUserPassword) {
		this.createUserPassword = createUserPassword;
	}


	public String getCreateUserName() {
		return createUserName;
	}


	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}




	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
