package com.lti.service;

import java.math.BigDecimal;

import com.lti.bean.AddressAccountDetail;

public interface AddressAccountService {
	//public void insert(long account_no,String title,String address_line1,String address_line2,String landmark,String user_state,String city,int pincode);
	public AddressAccountDetail select(BigDecimal accno);

}
