package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.SerchDAO;
import com.internousdev.ECsite.dto.SerchDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SerchAction extends ActionSupport implements SessionAware{
	private String serchWord;
	private SerchDTO serchDTO=new SerchDTO();
	private SerchDAO serchDAO=new SerchDAO();
	public Map<String,Object> session;


	public String execute(){
		String ret=SUCCESS;
		System.out.println();

		serchDTO=serchDAO.getSerchInfo(serchWord);

		session.put("serchResult", serchDTO.getSerchWord());
		System.out.println(session.get("serchResult"));






		return ret;

	}


	public String getSerchWord() {
		return serchWord;
	}


	public void setSerchWord(String serchWord) {
		this.serchWord = serchWord;
	}


	public SerchDTO getSerchDTO() {
		return serchDTO;
	}


	public void setSerchDTO(SerchDTO serchDTO) {
		this.serchDTO = serchDTO;
	}


	public SerchDAO getSerchDAO() {
		return serchDAO;
	}


	public void setSerchDAO(SerchDAO serchDAO) {
		this.serchDAO = serchDAO;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
