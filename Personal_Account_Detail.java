package com.lti.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lti.dao.UserRegister;
@Entity
@Table(name="PERSONAL_ACCOUNT_DET")
public class Personal_Account_Detail  implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "ACCOUNT_NO")
	private long account_no;
	
	@Column(name="TITLE",nullable=false)
	private String title;
	
	@Column(name="FIRST_NAME",nullable=false)
	private String first_name;
	
	@Column(name="LAST_NAME",nullable=false)
	private String last_name;
	
	@Column(name="FATHER_NAME",nullable=false)
	private String father_name;
	
	@Column(name="MOBILE_NO",nullable=false)
	private int mobile_no;
	
	@Column(name="EMAIL_ID",nullable=false)
	private String email_id;
	
	@Column(name="AADHAR_NO",nullable=false)
	private String  aadhar_no;
	
	@Column(name="DOB",nullable=false)
	private Date dob;

	public long getAccount_no() {
		return account_no;
	}
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="ACCOUNT_NO")
//	private User_Register userRegister;
//	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NO")
	private Add_Payee Add_Payee;
	 
	
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob( Date date1) {
		this.dob = date1;
	}
	
	public User_Register getUser_Register() {
		return UserRegister;
	}
	
	public void setUser_Register(User_Register userRegister) {
		this.userRegister = userRegister;
	}

	@Override
	public String toString() {
		return "Personal_Account_Detail [account_no=" + account_no + ", title=" + title + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", father_name=" + father_name + ", mobile_no=" + mobile_no
				+ ", email_id=" + email_id + ", aadhar_no=" + aadhar_no + ", dob=" + dob + "]";
	}

}
