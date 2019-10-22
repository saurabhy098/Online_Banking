package com.lti.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CustomerBalance")
@Table(name="CUSTOMER_BALANCE")
public class CustomerBalance {
	@Id
	@Column(name = "ACCOUNT_NO ")
	private long acc_no;
	
	@Column(name = "BALANCE  ")
	private int bal;

	public CustomerBalance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerBalance(int acc_no, int bal) {
		super();
		this.acc_no = acc_no;
		this.bal = bal;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Customer_Balance [acc_no=" + acc_no + ", bal=" + bal + "]";
	}

}
