package com.lti.controller;

import java.util.Map;




import javax.annotation.Resource;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.lti.bean.Login;
import com.lti.bean.UserRegister;
import com.lti.service.LoginService;
import com.lti.service.UserRegisterService;




@Controller
public class Controllers {

	@Resource
	private UserRegisterService userRegisterService;
	
	@Resource
	private LoginService loginService;
//	
//	@RequestMapping("/home")
//	public String getHomePage() {
//		return "Home";
//	}

	
	
	@RequestMapping("/Register")
	public String Register() {
		System.out.println("abxc");
		return "Register";
	}
	
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public ModelAndView setRegistrationDetails(UserRegister ur){
		ModelAndView mAndV = null;
		
		userRegisterService.insert(ur);
		mAndV.setViewName("Login");
		System.out.println("going to index");
		return mAndV;
			
		}
	
	@RequestMapping("/Login")
	public String Login() {
		System.out.println("abxc");
		return "Login";
	}
	
	@RequestMapping(value="/Login", method = RequestMethod.GET)
	public ModelAndView getLoginDetails(Login login) {
		ModelAndView mAndV = null;
		loginService.isValid(user_id, user_password);
		mAndV.setViewName("Dashboard");
		return mAndV;
		
		
	}
	
}
