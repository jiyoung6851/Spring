package com.lgy.member_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.member_oracle.service.MemLoginService;
import com.lgy.member_oracle.service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	private MemService Service;
	
    @RequestMapping("/login")
    public String login() {
    	log.info("@# login");
    	
        return "login";
    }

    @RequestMapping("/login_yn")
    public String loginCheck(HttpServletRequest request, Model model) {
    	log.info("@# login_yn");
    	
        model.addAttribute("request", request);
        
        Service = new MemLoginService();
        int result = Service.execute(model);

        if (result == 1) {
            return "redirect:login_ok";
        }
        return "redirect:login";
    }
    
    @RequestMapping("/login_ok")
    public String login_ok() {
    	log.info("@# login_ok");
    	
        return "login_ok";
    }

}
