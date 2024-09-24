package com.lgy.spring_13_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping("/studentView")
//	뷰에서 넘어오는 값들을 클래스 객체로 한번에 받음
//	public String studentView(StudentInfomation studentInfomation) {
//	클래스 이름을 studInfo로 임의로 바꾸면 뷰에서 값을 못받음
//	public String studentView(StudentInfomation stuInfo) {
	
//	@ModelAttribute : 객체 이름 변경
	public String studentView(@ModelAttribute("stuInfo")StudentInfomation studentInfomation) {
		return "studentView";
	}
}
