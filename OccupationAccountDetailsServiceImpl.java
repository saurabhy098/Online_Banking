package com.lti.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.OccupationAccountDetailDao;

@Service("occupationAccountDetailsService")
public class OccupationAccountDetailsServiceImpl implements OccupationAccountDetailsService {

	@Autowired
	private OccupationAccountDetailDao occupationAccountDetailDao;
	
	@Override
	public OccupationAccountDetailDao select(BigDecimal accno) {
		return occupationAccountDetailDao.select(accno);
	}

}
