package com.lti.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_ACCOUNT_DET")
public class AddressAccountDetail {
	@Id
	@Column(name="ACCOUNT_NO")
	private BigDecimal account_no;
	@Column(name="ADDRESS_LINE1")
	private String address_line1;
	@Column(name="ADDRESS_LINE2")
	private String address_line2;
	@Column(name="LANDMARK")
	private String landmark;
	@Column(name="USER_STATE")
	private String user_state;
	@Column(name="CITY")
	private String city;
	@Column(name="PINCODE")
	private int pincode;
	
	
	
	public AddressAccountDetail() {
		super();
		
	}

	public AddressAccountDetail(BigDecimal account_no, String address_line1, String address_line2, String landmark,
			String user_state, String city, int pincode) {
		super();
		this.account_no = account_no;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.landmark = landmark;
		this.user_state = user_state;
		this.city = city;
		this.pincode = pincode;
	}

	public BigDecimal getAccount_no() {
		return account_no;
	}

	public void setAccount_no(BigDecimal account_no) {
		this.account_no = account_no;
	}


	public String getAddress_line1() {
		return address_line1;
	}
	
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address_Account_Detail [account_no=" + account_no + ", address_line1="
				+ address_line1 + ", address_line2=" + address_line2 + ", landmark=" + landmark + ", user_state="
				+ user_state + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
