package com.lti.test;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.service.NeftTransactionService;

import oracle.sql.NUMBER;

public class TestTransaction {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("core.xml");
		NeftTransactionService services = ctx.getBean("neftTransactionService", NeftTransactionService.class);
		BigDecimal s = new BigDecimal("2019100200");
		BigDecimal r = new BigDecimal("2019100201");
		services.transaction(s, r, 1000);
	}
}
