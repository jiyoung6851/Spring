package com.lgy.member_std_oracle.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.member_std_oracle.dto.MemDTO;
import com.lgy.member_std_oracle.service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	@Autowired
	private MemService service;
	
	
	 @RequestMapping("/login")
	    public String login() {
	        log.info("@# login");
	        return "login";
	    }

	    @RequestMapping("/loginYn")
	    public String loginCheck(@RequestParam HashMap<String, String>param) {
	        log.info("@# loginYn");
	        
	        ArrayList<MemDTO> dtos = service.loginYn(param);
	        
	        if(dtos.isEmpty()) {
	        	return "redirect:login";
	        } else {
	            if(param.get("mem_pw").equals(dtos.get(0).getMem_pw())) {
	            	return "redirect:login_ok";
	            } else {
	            	return "redirect:login";
	            }
	        }
	    }
	    
	    @RequestMapping("/login_ok")
	    public String loginOk() {
	        log.info("@# login_ok");
	        
	        return "login_ok";
	    }

	    @RequestMapping("/register")
	    public String register() {
	        log.info("@# register");
	        
	        return "register";
	    }
	    
	    @RequestMapping("/registerok")
	    public String registerOk(@RequestParam HashMap<String, String>param) {
	        log.info("@# registerok");
	        
	        service.write(param);
	        
	        return "redirect:login";
	    }
	}