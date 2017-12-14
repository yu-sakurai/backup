package com.internousdev.WebPro4.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport{
	String result=SUCCESS;
	public String execute(){
		return result;
	}
}
