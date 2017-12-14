package com.internousdev.ecshokyu.action;

import java.util.Map;

import javax.websocket.Session;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecshokyu.dao.LoginDAO;
import com.internousdev.ecshokyu.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String result;
	

}
