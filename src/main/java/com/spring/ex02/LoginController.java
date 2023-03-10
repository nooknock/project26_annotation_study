package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("loginController")//컨트롤러가 여러개 있으면 에러남
//@RequestMapping("/test")
public class LoginController {

	@RequestMapping(value = "/test/loginForm.do", method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}
	
	
	
	
	@RequestMapping(value = "/test/login.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception{
//		request.setCharacterEncoding("utf-8"); web.xml에서 인코딩을 미해 해둬서 없어도 안깨짐
		ModelAndView mav=new ModelAndView();
		mav.setViewName("result");
		String userID=request.getParameter("userID");
		String userName=request.getParameter("userName");
		mav.addObject("userID",userID);
		mav.addObject("userName",userName);
		return mav;
	}
	
	/*
	 * @RequestParam 적용시 required 속성을 생략하면 기본값은 true임 required 속성을 true로 설정하면 메서드 호출
	 * 시 required 속성을 false로 성정하면 메소드 호출 시
	 */
	
	
	@RequestMapping(value = "/test/login2.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login2(@RequestParam("userID") String userID,@RequestParam(value="userName", required = true) String userName,@RequestParam(value="email",required = false) String email,HttpServletRequest request, HttpServletResponse response) throws Exception{
//		request.setCharacterEncoding("utf-8");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("result");

//		System.out.println(userID);
//		System.out.println(userName);
//		System.out.println(email);
		mav.addObject("userID",userID);
		mav.addObject("userName",userName);
		mav.addObject("email",email);
		return mav;
	}
	
	@RequestMapping(value = "/test/login3.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login3(@RequestParam Map<String, String> info,HttpServletRequest request, HttpServletResponse response) throws Exception{
//		request.setCharacterEncoding("utf-8");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("result");
		String userID=info.get("userID");
		String userName=info.get("userName");
//		System.out.println(info);
//		System.out.println(userID);
//		System.out.println(userName);
		
		mav.addObject("info", info);
		
		return mav;
	}
	
	
	/*
	 * Annotation that binds a method parameter or method return value to a named
	 * model attribute, exposed to a web view.
	 * 메서드 매개 변수 또는 메서드 반환 값을 명명된 모델 특성에 바인딩하는 주석으로, 웹 보기에 표시됩니다.
	 */
	@RequestMapping(value = "/test/login4.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login4(@ModelAttribute("info") LoginVO loginVO,HttpServletRequest request, HttpServletResponse response) throws Exception{
//		request.setCharacterEncoding("utf-8");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("result");
		
		
		System.out.println(loginVO);
//		System.out.println(loginVO.getUserName());
		
		
		
		return mav;
	}
	
	
	/*
	 * Interface that defines a holder for model attributes. 
	 * Primarily designed for adding attributes to the model.
	 * Allows for accessing the overall model as a java.util.Map.
	 * 
	 * 모델 특성의 홀더를 정의하는 인터페이스입니다.
	 * Model 클래스의 addAttribute() 메서드는 ModelAndView의 addObject() 메서드와 같은 기능을 합니다. 
	 * Model 클래스는 따로 뷰 정보를 전달할 필요가 없을 때 사용하면 편리합니다.
	 */	
	@RequestMapping(value = "/test/login5.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String login5(Model model,HttpServletRequest request, HttpServletResponse response) throws Exception{
//		request.setCharacterEncoding("utf-8");
		ModelAndView mav=new ModelAndView();
		
		String userID=request.getParameter("userID");
		model.addAttribute("userID",userID);
		model.addAttribute("userName","홍길동");
				
		return "result";
	}
	
}
