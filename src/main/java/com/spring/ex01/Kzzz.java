package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("asdawf")
@RequestMapping("/mmmmm")
public class Kzzz {
	
	

	@RequestMapping(value = {"/iioio.do", "/pppo.do"},method = RequestMethod.GET)
	ModelAndView dawda(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("cczszs","tjeuihfs");
		mav.setViewName("dsdaw");
		return mav;
	}
}
