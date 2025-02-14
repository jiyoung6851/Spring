package com.lgy.board_jdbc_mysql.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.lgy.board_jdbc_mysql.dto.BoardDTO;
import com.lgy.board_jdbc_mysql.util.Constant;

public class BoardDAO {
//	DataSource dataSource;
	JdbcTemplate template = null;
	
	public BoardDAO() {
		template = Constant.template;
	}
	
	public ArrayList<BoardDTO> list() {
		// 방법3 : sql대신 쿼리문 넣어버리기
		return (ArrayList<BoardDTO>) template.query("select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board", new BeanPropertyRowMapper(BoardDTO.class));
	}

		
		/* 방법2
		String sql = "select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board";
		return (ArrayList<BoardDTO>) template.query(sql, new BeanPropertyRowMapper(BoardDTO.class));
	}
}
		
		/* 방법 1
		ArrayList<BoardDTO> dtos = null;
		String sql = "select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board";
		//위 sql을 jdbc template으로 실행하고 결과를 dtos로 받음
		dtos = (ArrayList<BoardDTO>) template.query(sql, new BeanPropertyRowMapper(BoardDTO.class));
		
		return dtos;
	}
}
		*/
		
	public void write(final String boardName, final String boardTitle, final String boardContent) {
		//update : jdbc template 으로 insert (PrepareStatementCreator 객체 사용)
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into tbl_board(boardName, boardTitle, boardContent, boardHit) values(?,?,?,0)";
				//con : 메소드 매개변수와 이름 일치
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				//파라미터는 final로 구성
				pstmt.setString(1, boardName);
				pstmt.setString(2, boardTitle);
				pstmt.setString(3, boardContent);
				return pstmt;
			}
		});
	}
	
	public BoardDTO contentView(String strID) {
		upHit(strID);
		
		String sql = "select boardNo, boardName, boardTitle, boardContent, boardDate, boardHit from tbl_board where boardNo="+strID;
		return (BoardDTO)template.queryForObject(sql, new BeanPropertyRowMapper<BoardDTO>(BoardDTO.class));
	}
	
	public void upHit(final String boardNo) {
		String sql = "update tbl_board set boardHit = boardHit+1 where boardNo=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(boardNo));
			}
		});
	}
	
	public void modify(final String boardNo, final String boardName, final String boardTitle, final String boardContent) {
		String sql = "update tbl_board set boardName=?, boardTitle=?, boardContent=? where boardNo=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, boardName);
				ps.setString(2, boardTitle);
				ps.setString(3, boardContent);
				ps.setInt(4, Integer.parseInt(boardNo));
			}
		});
	}

	public void delete(final String strID) {
		String sql = "delete from tbl_board where boardNo=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(strID));
			}
		});
	}
}
