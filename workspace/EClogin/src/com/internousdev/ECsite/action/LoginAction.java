package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.BuyItemDAO;
import com.internousdev.ECsite.dao.LoginDAO;
import com.internousdev.ECsite.dto.BuyItemDTO;
import com.internousdev.ECsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private String itemName;

	private LoginDTO loginDTO=new LoginDTO();
	private LoginDAO loginDAO=new LoginDAO();
	private BuyItemDAO buyItemDAO=new BuyItemDAO();
	public ArrayList<BuyItemDTO> buyItemList=new ArrayList<BuyItemDTO>();
	public static int totalErrorCount;
	public static int i;
	/*public Map<String,Objest> session.put("TotalErrorCount",totalErrorCount);
*/
	public String execute(){

		String result=ERROR;
		/*if(totalErrorCount==0){
			 session.put("TotalErrorCount",totalErrorCount);
			 }else{
				 totalErrorCount= Integer.parseInt(session.get("TotalErrorCount").toString());
				 session.put("TotalErrorCount",totalErrorCount);
			 }*/


		loginDTO= loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser",loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()&&totalErrorCount<=5){
			session.put("loginId",loginUserId);
			session.put("loginUserPassword", loginPassword);
			buyItemList=buyItemDAO.getBuyItemInfo();

			Iterator<BuyItemDTO> iterator=buyItemList.iterator();

			if (!(iterator.hasNext())) {


				buyItemList = null;
			}
			/*session.put("login_user_id",loginDTO.getLoginUserId());
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
			session.put("buyItem_stock", buyItemDTO.getItemStock());*/

			result=SUCCESS;

		}else if(loginUserId=="a"&&loginPassword=="a"){
			i=0;
		}


		else{
			/*i=1;*/
			totalErrorCount+=1; /*Integer.parseInt(session.get("TotalErrorCount").toString())+i;
			*//*System.out.println(totalErrorCount);
			session.put
			int totalErrorCount= Integer.parseInt(session.get("TotalErrorCount").toString());
			session.put("TotalErrorCount",totalErrorCount);
			*//*int Ecount=intErrorCount++*/
/*			session.put("Ecount",Ecount);
 *
*/		System.out.println(totalErrorCount);
			result=ERROR;
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

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}




}