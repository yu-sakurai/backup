package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;

public class BuyItemCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private String sql="INSERT INTO user_buy_item_transaction (item_transaction_id, total_price, total_count, user_master_id, pay) VALUES(?, ?, ?, ?, ?)";

	public void buyItemInfo(String item_transaction_id, String user_master_id, String total_price, String count, String pay) throws SQLException {
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}
