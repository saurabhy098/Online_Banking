package com.lti.service;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.AddressAccountDetail;
import com.lti.dao.AddressAccountDetails;

@Service("addressAccountService")
public class AddressAccountServiceImpl implements AddressAccountService {

	@Autowired
	private AddressAccountDetails addressAccountDetails;

	@Override
	public AddressAccountDetail select(BigDecimal accno) {
		return addressAccountDetails.select(accno);

	}

}
