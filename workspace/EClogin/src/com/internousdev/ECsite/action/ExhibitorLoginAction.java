package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.ExhibitorLoginDAO;
import com.internousdev.ECsite.dto.ExhibitorLoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ExhibitorLoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private ExhibitorLoginDAO exDAO=new ExhibitorLoginDAO();
	private ExhibitorLoginDTO exDTO=new ExhibitorLoginDTO();

	public String execute(){
		String result=ERROR;

		exDTO=exDAO.getExhibitorInfo(loginUserId, loginPassword);
		session.put("loginUser",exDTO);

		if(((ExhibitorLoginDTO) session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;

			session.put("loginId", loginUserId);
			session.put("loginPassword", loginPassword);
		}

		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ExhibitorLoginDAO getExDAO() {
		return exDAO;
	}

	public void setExDAO(ExhibitorLoginDAO exDAO) {
		this.exDAO = exDAO;
	}

	public ExhibitorLoginDTO getExDTO() {
		return exDTO;
	}

	public void setExDTO(ExhibitorLoginDTO exDTO) {
		this.exDTO = exDTO;
	}


}
