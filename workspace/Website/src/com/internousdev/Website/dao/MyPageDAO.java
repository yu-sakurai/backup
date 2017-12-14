package com.internousdev.Website.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.Website.dto.MyPageDTO;
import com.internousdev.Website.util.DBConnector;

public class MyPageDAO {
	private DBConnector db=new DBConnector();
	Connection con=db.getConnection();
	
	public ArrayList<MyPageDTO> getMyPageUserInfo(String item_trancsaction_id,String user_master_id)throws SQLException{
		ArrayList<MyPageDTO> myPageDTO=new ArrayList<>();
		
		String sql= "SELECT ubit.id, iit.item_name, ubit.total_price, ubit.total_count, ubit.pay, ubit.insert_date FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id where ubit.item_transaction_id  = ? AND ubit.user_master_id  = ? ORDER BY insert_date DESC";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,item_trancsaction_id);
			ps.setString(2,user_master_id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				MyPageDTO dto=new MyPageDTO();
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("Item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPayment(rs.getString("pay"));
				dto.setInsert_date(rs.getString("insert_date"));
				myPageDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			con.close();
		}
		return myPageDTO;
	}
	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id) throws SQLException {

		String sql = "DELETE FROM user_buy_item_transaction where item_transaction_id  = ? AND user_master_id  = ?";

		PreparedStatement preparedStatement;
		int result =0;
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);

			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return result;
	}

}
