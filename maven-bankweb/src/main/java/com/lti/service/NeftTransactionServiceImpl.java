package com.lti.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NeftTransactionDao;

@Service("neftTransactionService")
public class NeftTransactionServiceImpl implements NeftTransactionService {

	@Autowired
	NeftTransactionDao neftTransactionDao;

	@Override
	public void transaction(BigDecimal senderaccno, BigDecimal receiveraccno, int amt) {
		neftTransactionDao.transaction(senderaccno, receiveraccno, amt);

	}

}