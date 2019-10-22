package com.lti.dao;

import java.math.BigDecimal;

public interface NeftTransactionDao {
public void transaction(BigDecimal senderaccno, BigDecimal receiveraccno, int amt) ;
public boolean validate(BigDecimal account_no);
public boolean min_Bal(BigDecimal account_no,int amount);
}
