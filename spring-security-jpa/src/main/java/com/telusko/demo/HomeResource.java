package com.telusko.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeResource {

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/aboutus")
	public String home1()
	{
		return "Aboutus.jsp";
	}
	
	@RequestMapping("/subscribe")
	public String home2()
	{
		return "subscribe.jsp";
	}
	
	@RequestMapping("/contactus")
	public String home3()
	{
		return "contactus.jsp";
	}
	
	@RequestMapping("/cardlayout")
	public String home11()
	{
		return "cardlayout.jsp";
	}
	
	@RequestMapping("/admin")
	public String admin()
	{
		return "admin.jsp";
	}
	
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
	}

}
