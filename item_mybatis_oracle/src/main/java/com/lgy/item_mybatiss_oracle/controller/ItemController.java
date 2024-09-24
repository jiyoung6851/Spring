package com.lgy.item_mybatiss_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.item_mybatiss_oracle.dao.ItemDAO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@RequestMapping("/write_view")
	public String write_view(HttpServletRequest request, Model model) {
		log.info("@# write_view");
		
		model.addAttribute("request", request);
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		dao.write(request.getParameter("name")
				, Integer.parseInt(request.getParameter("price"))
				, request.getParameter("description"));
		
		return "item_write";
	}
	
	@RequestMapping("/write_result")
	public String write(HttpServletRequest request, Model model) {
		log.info("@# write_result");
		
		model.addAttribute("request", request);
		
		return "write_result";
	}
	
	@RequestMapping("/content_view")
	public String list(Model model) {
		log.info("@# content_view");
		
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		model.addAttribute("list",dao.list());
		
		return "content_view";
	}
}