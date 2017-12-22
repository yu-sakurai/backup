package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ECsite.dto.BuyDTO;
import com.internousdev.ECsite.util.DBConnector;

public class BuyDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private BuyDTO buyDTO=new BuyDTO();

	private String sql="SELECT * FROM item_info_transaction where id=?";

	public BuyDTO getBuyItemInfoM(int id){

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();


		while(rs.next()){
			buyDTO.setId(rs.getInt("id"));
			buyDTO.setItemName(rs.getString("item_name"));
			buyDTO.setItemPrice(rs.getString("item_price"));
			buyDTO.setItemStock(rs.getString("item_stock"));
		}



		}catch(Exception e){
			e.printStackTrace();
		}return buyDTO;
	}

}
