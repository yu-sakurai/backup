package com.internousdev.ECsite.action;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String createUserId;
	private String createUserPassword;
	private String createUserName;
	public Map<String,Object> session;

	public String execute(){
		String result=ERROR;
		Pattern userNamep=Pattern.compile("[A-Z_]");
		Matcher UserNameM=userNamep.matcher(createUserName);
		Pattern p=Pattern.compile("\\w");
		Matcher PasswordM=p.matcher(createUserPassword);

		if(UserNameM.find()&&PasswordM.find()){
		if(!(createUserId.equals(""))&&!(createUserPassword.equals(""))&&!(createUserName.equals(""))){
			session.put("createUserId",createUserId);
			session.put("createUserPassword",createUserPassword);
			session.put("createUserName",createUserName);

			result=SUCCESS;
		}}
		return result;
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