package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ECsite.dto.SerchDTO;
import com.internousdev.ECsite.util.DBConnector;

public class SerchDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private SerchDTO serchDTO=new SerchDTO();


	public SerchDTO getSerchInfo(String serchWord){
		String sql ="SELECT*FROM item_info_transaction where item_name LIKE \'%' ? \'%' ";

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, serchWord);

		ResultSet rs=ps.executeQuery();

		while(rs.next()){
			serchDTO.setSerchWord(rs.getString("item_name"));
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return serchDTO;
	}


	public SerchDTO getSerchDTO() {
		return serchDTO;
	}


	public void setSerchDTO(SerchDTO serchDTO) {
		this.serchDTO = serchDTO;
	}


}