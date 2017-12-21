package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ECsite.dto.BuyItemDTO;
import com.internousdev.ECsite.util.DBConnector;



public class BuyItemDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private BuyItemDTO buyItemDTO=new BuyItemDTO();


	public BuyItemDTO getBuyItemInfo(){
	try{
		String sql="SELECT id, item_name, item_price,item_stock FROM item_info_transaction";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();

		if(rs.next()){
			buyItemDTO.setId(rs.getInt("id"));
			buyItemDTO.setItemName(rs.getString("item_name"));
			buyItemDTO.setItemPrice(rs.getString("item_price"));
			buyItemDTO.setItemStock(rs.getInt("item_stock"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return buyItemDTO;
	}
	public BuyItemDTO geBuyItemDTO(){
		return buyItemDTO;
	}
}
