package com.lti.dao;

import java.math.BigDecimal;

import com.lti.bean.AddressAccountDetail;

public interface AddressAccountDetails {
//public void insert(long accno, String addrline1, String addrline2, String land_mark, String state, String city, int pincode);
public AddressAccountDetail select(BigDecimal accno);
}
