package com.lgy.member_oracle.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.member_oracle.dao.MemDAO;

public class MemLoginService implements MemService{
	
	@Override
	public int execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String mid = request.getParameter("mem_uid");
		String mpw = request.getParameter("mem_pw");
		
		MemDAO dao = new MemDAO();
		int re = dao.loginYn(mid, mpw);
		
		return re;
	}
}
