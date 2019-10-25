package com.lti.service;

import java.math.BigDecimal;


import com.lti.dao.OccupationAccountDetailDao;

public interface OccupationAccountDetailsService {
	public OccupationAccountDetailDao select(BigDecimal accno);

}
