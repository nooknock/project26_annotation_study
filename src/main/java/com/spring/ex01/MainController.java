package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("mainController")
@RequestMapping("/fsefse")
public class MainController {
	
	@RequestMapping(value = "/cascasdaswd.do",method = RequestMethod.GET )
	ModelAndView main1(HttpServletRequest request,HttpServletResponse response) throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("fasd","hiasdasd");
		mav.setViewName("dsdaw");
		return mav;
		
	}

}
