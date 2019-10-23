package com.lti.test;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.bean.AddressAccountDetail;
import com.lti.service.AddressAccountService;

public class TestAddress {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("Bank_Controller-core.xml");
     AddressAccountService service = ctx.getBean("addressAccountService",AddressAccountService.class);
     BigDecimal bg=new BigDecimal(2019100200);
     AddressAccountDetail addressAccountDetail = service.select(bg);
	System.out.println(addressAccountDetail);
}
}
