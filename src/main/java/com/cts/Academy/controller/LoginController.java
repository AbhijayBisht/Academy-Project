package com.cts.Academy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Academy.bean.Login;
import com.cts.Academy.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping("/")
	public String AdminLogin(){
		return "login";
	}
	
	@RequestMapping(value="Admin-login.html")
	public String getLogin(){
		return "login";
	}
	
	@RequestMapping(value="Login.html",method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login,HttpSession httpSession){
		ModelAndView mav = new ModelAndView();
		Login login1 =loginService.Validate(login);
		if(login1 == null){
			mav.setViewName("loginError");
			System.out.println("Hello");
		}
		else
		{
		if(login1.getUserType().equals("A")){
			
			mav.setViewName("Admin-Controls");
			httpSession.setAttribute("user", login1);
			System.out.println("Hi");
		}
		else if(login1.getUserType().equals("F")){
			mav.setViewName("Faculty-Controls");
			httpSession.setAttribute("user", login1);
			System.out.println("Hiiiii");
		}}
		return mav;
	}
@RequestMapping(value="Logout.html")
public ModelAndView logout(HttpSession httpSession){
	ModelAndView modelAndView= new ModelAndView();
	httpSession.removeAttribute("user");
	httpSession.invalidate();
	modelAndView.setViewName("login");
	return modelAndView;
}
}
