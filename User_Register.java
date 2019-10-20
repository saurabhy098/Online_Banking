package com.lti.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_REGISTER")
public class User_Register implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "ACCOUNT_NO")
	private long account_no;
	
	@Column(name="USER_ID",nullable=false)
	private String user_id;
	
	@Column(name="USER_PASSWORD",nullable=false)
	private String user_password;
	
	@Column(name="TRANSACTION_PASSWORD",nullable=false)
	private int transaction_password;
	
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public int getTransaction_password() {
		return transaction_password;
	}
	public void setTransaction_password(int transaction_password) {
		this.transaction_password = transaction_password;
	}
}
