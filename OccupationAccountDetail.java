package com.lti.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OCCUPATION_ACCOUNT_DET")
public class OccupationAccountDetail {
	@Id
	@Column(name="ACCOUNT_NO")
	private BigDecimal account_no;
	@Column(name="OCCUPATION_TYPE")
	private String occupation_type;
	@Column(name="SOURCE_OF_INCOME")
	private String source_of_income;
	@Column(name="GROSS_ANNUAL_INCOME")
	private long gross_annual_income;
	
	public OccupationAccountDetail() {
		super();
		
	}

	public OccupationAccountDetail(BigDecimal account_no, String occupation_type, String source_of_income,
			long gross_annual_income) {
		super();
		this.account_no = account_no;
		this.occupation_type = occupation_type;
		this.source_of_income = source_of_income;
		this.gross_annual_income = gross_annual_income;
	}

	
	
	  public BigDecimal getAccount_no() {
		return account_no;
	}

	public void setAccount_no(BigDecimal account_no) {
		this.account_no = account_no;
	}
	
	public String getOccupation_type() {
		return occupation_type;
	}

	public void setOccupation_type(String occupation_type) {
		this.occupation_type = occupation_type;
	}
	
	public String getSource_of_income() {
		return source_of_income;
	}

	public void setSource_of_income(String source_of_income) {
		this.source_of_income = source_of_income;
	}
	
	public long getGross_annual_income() {
		return gross_annual_income;
	}

	public void setGross_annual_income(long gross_annual_income) {
		this.gross_annual_income = gross_annual_income;
	}
	

	
	@Override
	public String toString() {
		return "Occupation_Account_Detail [account_no=" + account_no + ", occupation_type=" + occupation_type
				+ ", source_of_income=" + source_of_income + ", gross_annual_income=" + gross_annual_income + "]";
	}

}
