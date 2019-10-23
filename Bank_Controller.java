package com.lti.controller;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.service.Register_service;



@Controller
public class Bank_Controller {

	@Resource
	private Register_service service;
	
	@RequestMapping(value="/home.bank", method = RequestMethod.GET)
	public String getHomePage() {
		return "Home";
	}

	@RequestMapping(value="/Register.bank", method = RequestMethod.GET)
	public String registerEmp(HttpServletRequest req) {
		int acc_no = Integer.parseInt(req.getParameter("Account_No"));
		String user_id = req.getParameter("User_id");
		String password = req.getParameter("Password");
		// String Confirm_Password=req.getParameter("Confirm_Password");
		int Transaction_Password = Integer.parseInt(req.getParameter("Transaction_Password"));
		// int
		// Confirm_TPassword=Integer.parseInt(req.getParameter("Confirm_TPassword"));

		//UserRegisterImpl registerImpl = new UserRegisterImpl();
		service.insert((long) acc_no, user_id, password, Transaction_Password);

		return "SuccInsert";
	}
	
	@RequestMapping(value="/Reg.bank")
	public String register() {
		System.out.println("abc");
		service.insert(2019100203,"riyange","riya@11",4014);
		return "SuccInsert";
	}
}
