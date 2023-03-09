package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("mlmlml")
@RequestMapping("/zzzzz")
public class TTest {

	@RequestMapping(value = "/mmskw.do",method = RequestMethod.GET)
	ModelAndView mm(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("llll","ㅋㅋ");
		mav.setViewName("dsdaw");
		return mav;
	}
}
