package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;

public class NewItemCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();

	public String sql="INSERT INTO item_info_transaction (item_name, item_price, item_stock) VALUES(?, ? ,?)";

	public void NewItem(String itemName,String itemPrice,String itemStock) throws SQLException{



		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setString(2, itemPrice);
			ps.setString(3, itemStock);

			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}


	}


}