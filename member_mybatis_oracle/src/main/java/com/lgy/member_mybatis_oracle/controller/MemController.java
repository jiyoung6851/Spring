package com.lgy.member_mybatis_oracle.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.member_mybatis_oracle.dao.MemDAO;
import com.lgy.member_mybatis_oracle.dto.MemDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	@Autowired
	private SqlSession sqlSession;
	
	
	 @RequestMapping("/login")
	    public String login() {
	        log.info("@# login");
	        return "login";
	    }

	    @RequestMapping("/loginYn")
	    public String loginCheck(HttpServletRequest request, Model model) {
	        log.info("@# loginYn");
	        
	        String mid = request.getParameter("mem_uid");
	        String mpw = request.getParameter("mem_pw");
	        int re;
	        
	        MemDAO dao = sqlSession.getMapper(MemDAO.class);
	        List<MemDTO> dtos = dao.loginYn(mid,mpw);
	        
	        if(dtos.isEmpty()) {
	            re = -1;
	        } else {
	            if(mpw.equals(dtos.get(0).getMem_pw())) {
	                re = 1;
	            } else {
	                re = 0;
	            }
	        }

	        if (re == 1) {
	            return "redirect:login_ok";
	        }
	        return "redirect:login";
	    }
	    
	    @RequestMapping("/login_ok")
	    public String loginOk(HttpServletRequest request, Model model) {
	        log.info("@# login_ok");
	        
	        MemDAO dao = sqlSession.getMapper(MemDAO.class);
	        List<MemDTO> dtos = dao.loginYn(request.getParameter("mem_uid")
	        							, request.getParameter("mem_pw"));
	        
	        if(!dtos.isEmpty() && dtos.get(0).getMem_pw().equals(request.getParameter("mem_pw"))) {
	            return "login_ok";
	        } else {
	            return "redirect:login";
	        }
	    }

	    @RequestMapping("/register")
	    public String register() {
	        log.info("@# register");
	        return "register";
	    }
	    
	    @RequestMapping("/registerok")
	    public String registerOk(HttpServletRequest request, Model model) {
	        log.info("@# registerok");

	        String mid = request.getParameter("mem_uid");
	        String mpw = request.getParameter("mem_pw");
	        String name = request.getParameter("mem_name");
	        
	        MemDAO dao = sqlSession.getMapper(MemDAO.class);
	        MemDTO newMember = new MemDTO();
	        newMember.setMem_uid(mid);
	        newMember.setMem_pw(mpw);
	        newMember.setMem_name(name);
	        
	        dao.register(newMember);

	        return "redirect:login";
	    }
	}