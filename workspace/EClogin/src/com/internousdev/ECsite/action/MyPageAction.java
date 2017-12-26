package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.MyPageDAO;
import com.internousdev.ECsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private MyPageDAO myPageDAO=new MyPageDAO();
	public ArrayList<MyPageDTO> myPageList=new ArrayList<MyPageDTO>();
	private String deleteFlg;
	private String msg;

	public String execute() throws SQLException{
		String ret=SUCCESS;

		if(session.containsKey("id")){
			ret=ERROR;
		}
		if(deleteFlg==null){
			String item_transaction_id=session.get("id").toString();
			String user_master_id =session.get("login_user_id").toString();

			myPageList=myPageDAO.getMypageUserInfo(item_transaction_id, user_master_id);
			Iterator<MyPageDTO> iterator=myPageList.iterator();
			if(!(iterator.hasNext())){
				myPageList=null;
			}
		}else if(deleteFlg.equals("1")){
			delete();
		}
		ret=SUCCESS;
		return ret;



	}

	private void delete() throws SQLException{

		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();

		int res=myPageDAO.buyItemHisDelete(item_transaction_id, user_master_id);
		if(res>0){
			myPageList=null;
			setMsg("商品情報を削除しました");
		}else if(res==0){
			setMsg("商品情報の削除に失敗");
		}
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public MyPageDAO getMyPageDAO() {
		return myPageDAO;
	}

	public void setMyPageDAO(MyPageDAO myPageDAO) {
		this.myPageDAO = myPageDAO;
	}

	public ArrayList<MyPageDTO> getMyPageList() {
		return myPageList;
	}

	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}





}