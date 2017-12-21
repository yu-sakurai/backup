package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ECsite.dto.BuyItemDTO;
import com.internousdev.ECsite.util.DBConnector;



public class BuyItemDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
/*	private BuyItemDTO buyItemDTO=new BuyItemDTO();

*/
	public ArrayList<BuyItemDTO> getBuyItemInfo(){
		ArrayList<BuyItemDTO> buyItemDTO=new ArrayList<BuyItemDTO>();

	try{
		String sql="SELECT id, item_name, item_price,item_stock FROM item_info_transaction";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();

		while(rs.next()){
			BuyItemDTO dto=new BuyItemDTO();
			dto.setId(rs.getInt("id"));
			dto.setItemName(rs.getString("item_name"));
			dto.setItemPrice(rs.getString("item_price"));
			dto.setItemStock(rs.getInt("item_stock"));
			buyItemDTO.add(dto);
;
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	return buyItemDTO;
	}
}
