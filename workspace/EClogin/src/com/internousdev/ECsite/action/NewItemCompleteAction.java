package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.NewItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class NewItemCompleteAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String ,Object> session;
	private NewItemCompleteDAO nICDAO=new NewItemCompleteDAO();

	public String execute() throws SQLException{
		nICDAO.NewItem(session.get("itemName").toString(),
				session.get("itemPrice").toString(),
				session.get("itemStock").toString());

		return SUCCESS;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public NewItemCompleteDAO getnICDAO() {
		return nICDAO;
	}

	public void setnICDAO(NewItemCompleteDAO nICDAO) {
		this.nICDAO = nICDAO;
	}

}
