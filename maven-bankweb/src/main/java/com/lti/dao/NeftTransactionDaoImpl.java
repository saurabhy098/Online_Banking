package com.lti.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.CustomerBalance;
import com.lti.bean.PersonalAccountDetail;
import com.lti.bean.Transaction;

@Repository("NeftTransactionDao")
@Transactional(propagation = Propagation.REQUIRED)
public class NeftTransactionDaoImpl implements NeftTransactionDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public boolean validate(BigDecimal account_no) {
		boolean flag = false;
		System.out.println("LoginService.validateUser method...");

		Query qry = manager.createQuery("FROM PersonalAccountDetail WHERE  account_no =:acc");
		qry.setParameter("acc", account_no);

		System.out.println("1");
		PersonalAccountDetail personalAccountDetail = (PersonalAccountDetail) qry.getSingleResult();
		System.out.println(personalAccountDetail);
		if (personalAccountDetail != null) {
			System.out.println("Valid login");
			flag = true;
			return flag;
		}
		return flag;
	}

	@Override
	public boolean min_Bal(BigDecimal account_no, int amount) {
		boolean flag = false;
		System.out.println("LoginService.validateUser method...");

		Query qry = manager.createQuery("FROM CustomerBalance WHERE  account_no =:acc");
		qry.setParameter("acc", account_no);
		CustomerBalance customerBalance = (CustomerBalance) qry.getSingleResult();
		int bal = (int) qry.getParameterValue(1);

		System.out.println(customerBalance);
		if ((bal - amount) >= 1000) {
			System.out.println("Valid transfer");
			flag = true;
			return flag;
		}
		return flag;
	}

//	public void deduct(CustomerBalance customerBalance,int amt) {
//		customerBalance.setBal(customerBalance.getBal()-amt);
//		System.out.println(customerBalance.getBal());
//		manager.persist(customerBalance);
//	}
//	public void addMoney(CustomerBalance customerBalance,int amt) {
//		
//	}
//	

	@Override
	public void transaction(BigDecimal senderaccno, BigDecimal receiveraccno, int amt) {

		Transaction transaction = new Transaction();
		//BigDecimal account_no = senderaccno;
		long amount = amt;

		String sDate1 = "31/12/1998";
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("finally");

		transaction.setDate(date1);
		transaction.setSenderaccount_no(senderaccno);
		transaction.setReceiveraccount_no(receiveraccno);
		transaction.setTransactontype("neft");
		transaction.setCurrentbalaance(45000);
		transaction.setAmounttransfer(amount);
		transaction.setFlag(1);
		manager.persist(transaction);
		manager.close();
	}

}
