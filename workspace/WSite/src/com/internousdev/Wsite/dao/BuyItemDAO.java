package com.internousdev.Wsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.Wsite.dto.BuyItemDTO;
import com.internousdev.Wsite.util.DBConnector;

public class BuyItemDAO {
	private DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	BuyItemDTO buyItemDTO=new BuyItemDTO();
	
	public BuyItemDTO getBuyItemInfo(){
		
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
		}
		
	}

}
