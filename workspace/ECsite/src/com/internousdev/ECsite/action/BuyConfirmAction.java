package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyConfirmAction extends ActionSupport implements SessionAware{
	private int count;
	public Map<String,Object> session;

	public String execute(){
		String ret=SUCCESS;
		session.put("count",count);
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("item_price").toString());

		session.put("total_price", intCount * intPrice);
		System.out.println(intCount);
		System.out.println(intPrice);
		return ret;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
