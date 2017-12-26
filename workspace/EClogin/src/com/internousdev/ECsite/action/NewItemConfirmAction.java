package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class NewItemConfirmAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemStock;
	private String itemPrice;
	public Map<String,Object> session;

	public String execute(){
		String ret= SUCCESS;

		if(!(itemName.equals(""))&&!(itemStock.equals(""))&&!(itemPrice.equals(""))){
			session.put("itemName", itemName);
			session.put("itemStock", itemStock);
			session.put("itemPrice", itemPrice);
		}

		return ret;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
