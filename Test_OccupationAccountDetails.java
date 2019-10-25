package com.lti.test;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.bean.OccupationAccountDetail;
import com.lti.service.AddressAccountService;
import com.lti.service.OccupationAccountDetailsService;

public class Test_OccupationAccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bank_Controller-core.xml");
     OccupationAccountDetailsService occupation= ctx.getBean("occupationAccountDetailsService",OccupationAccountDetailsService.class);
     BigDecimal bg=new BigDecimal(2019100200);
     OccupationAccountDetail occupationAccountDetail= (OccupationAccountDetail) occupation.select(bg);
     System.out.println(occupationAccountDetail);
	}

}
