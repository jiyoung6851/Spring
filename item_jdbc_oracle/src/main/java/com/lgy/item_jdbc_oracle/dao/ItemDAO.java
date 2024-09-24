package com.lgy.item_jdbc_oracle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.lgy.item_jdbc_oracle.dto.ItemDTO;
import com.lgy.item_jdbc_oracle.util.Constant;

public class ItemDAO {
//	DataSource dataSource;
	JdbcTemplate template = null;
	
	public ItemDAO() {
		template = Constant.template;
	}
	
	public void write(final String name, final int price, final String description) {
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into item(name, price, description) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);

				pstmt.setString(1, name);
				pstmt.setInt(2, price);
				pstmt.setString(3, description);
				
				return pstmt;
			}
		});
	}
	
	public ArrayList<ItemDTO> list() {
		String sql = "select name, price, description from item";
		return (ArrayList<ItemDTO>) template.query(sql, new BeanPropertyRowMapper(com.lgy.item_jdbc_oracle.dto.ItemDTO.class));
	}
}