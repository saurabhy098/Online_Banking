package com.lti.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USER_TRANSACTION")
public class Transaction {
private Date date;
@Id
@Column(name="SENDER_ACCOUNT_NO ")
private BigDecimal senderaccount_no;

@Column(name="RECEIVER_ACCOUNT_NO ")
private BigDecimal receiveraccount_no;

@Column(name="TRANSACTION_TYPE ")
private String transactiontype;
@Column(name="CURRENT_BALANCE ")
private long currentbalaance;
@Column(name="AMOUNT_TRANSFERRED ")
private long amounttransfered;
@Column(name="FLAG ")
private int flag;


public Transaction() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "User_Transaction [date=" + date + ", senderaccount_no=" + senderaccount_no + ", receiveraccount_no="
			+ receiveraccount_no + ", transactontype=" + transactiontype + ", currentbalaance=" + currentbalaance
			+ ", amounttransfer=" + amounttransfered + ", flag=" + flag + "]";
}


public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public BigDecimal getSenderaccount_no() {
	return senderaccount_no;
}


public void setSenderaccount_no(BigDecimal senderaccount_no) {
	this.senderaccount_no = senderaccount_no;
}


public BigDecimal getReceiveraccount_no() {
	return receiveraccount_no;
}


public void setReceiveraccount_no(BigDecimal receiveraccount_no) {
	this.receiveraccount_no = receiveraccount_no;
}


public String getTransactontype() {
	return transactiontype;
}


public void setTransactontype(String transactontype) {
	this.transactiontype = transactontype;
}


public long getCurrentbalaance() {
	return currentbalaance;
}


public void setCurrentbalaance(long currentbalaance) {
	this.currentbalaance = currentbalaance;
}


public long getAmounttransfer() {
	return amounttransfered;
}


public void setAmounttransfer(long amounttransfer) {
	this.amounttransfered = amounttransfer;
}


public int getFlag() {
	return flag;
}


public void setFlag(int flag) {
	this.flag = flag;
}


public Transaction(Date date, BigDecimal senderaccount_no, BigDecimal receiveraccount_no, String transactontype,
		long currentbalaance, long amounttransfer, int flag) {
	super();
	this.date = date;
	this.senderaccount_no = senderaccount_no;
	this.receiveraccount_no = receiveraccount_no;
	this.transactiontype = transactontype;
	this.currentbalaance = currentbalaance;
	this.amounttransfered = amounttransfer;
	this.flag = flag;
}



}

