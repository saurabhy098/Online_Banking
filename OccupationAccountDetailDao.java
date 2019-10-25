package com.lti.dao;

import java.math.BigDecimal;

public interface OccupationAccountDetailDao {
	//public void insert(BigDecimal accno, String occtype, String sourceofincome,long grossannualincome);
	public OccupationAccountDetailDao select(BigDecimal accno);
		
	
}
