package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;

public class BuyCompDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private String sql="INSERT INTO user_buy_item_transaction (item_transaction_id, total_price, total_count) VALUES(?, ?, ?)";
	private String sql2="UPDATE item_info_transaction set item_stock=? where id=?";
	public void buyInfo(String item_transaction_id, String total_price, String total_count) throws SQLException{
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.execute();



		}catch(Exception e){
			e.printStackTrace();
		}/*
		try{
			PreparedStatement ps2=con.prepareStatement(sql2);
			ps2.setInt(1, 100);
			ps2.setInt(2, 2);
			ps2.execute();

		}catch(Exception e){
			e.printStackTrace();
		}*/finally {
			con.close();
		}
	}

}