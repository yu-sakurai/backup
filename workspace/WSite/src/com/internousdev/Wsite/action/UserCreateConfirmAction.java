package com.internousdev.Wsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginUserPassword;
	private String userName;
	public Map<String,Object> session;
	public String execute(){
		String ret=ERROR;
		if(!(loginUserId.equals(""))&&!(loginUserPassword.equals(""))&&!(userName.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginUserPassword", loginUserPassword);
			session.put("userName", userName);
			
			ret=SUCCESS;
		}else{
			ret=ERROR;
		}
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

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	

}
