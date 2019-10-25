package com.lti.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.lti.bean.OccupationAccountDetail;

import com.lti.util.ConnectionFactory;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class OccupationAccountDetailDaoImpl implements OccupationAccountDetailDao {

	
	@PersistenceContext
	private EntityManager manager;
	
	

	@Override
	public OccupationAccountDetailDao select(BigDecimal accno) {
		Query qry=manager.createQuery("FROM ADDRESS_ACCOUNT_DET where account_no :account_no");
		System.out.println("enter");
		qry.setParameter("account_no", accno);
		
		OccupationAccountDetail userResult = null;
		userResult = (OccupationAccountDetail) qry.getSingleResult();
		System.out.println("D2");
		System.out.println(userResult);
		
		return (OccupationAccountDetailDao) userResult;
	}
	
	
	}

	//@Override
//	public void insert(long accno, String occtype, String sourceofincome,
//			long grossannualincome) {
//			String sql = "INSERT INTO OCCUPATION_ACCOUNT_DET VALUES(?,?,?,?)";
//			Occupation_Account_Detail oad = new Occupation_Account_Detail();
//		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
//			//System.out.println(sql);
//			
//			oad.setAccount_no(accno);
//			oad.setOccupation_type(occtype);
//			oad.setSource_of_income(sourceofincome);
//			oad.setGross_annual_income(grossannualincome);
//			//System.out.println(oad);
//			stmt.setLong(1, oad.getAccount_no());
//			stmt.setString(2, oad.getOccupation_type());
//			stmt.setString(3, oad.getSource_of_income());
//			stmt.setLong(4, oad.getGross_annual_income());
//			//System.out.println("ho na");
//			stmt.execute();
//			//System.out.println("inserted");
//		} catch (SQLException e) {
//			System.err.println(e);
//			e.printStackTrace();
//
//		}
//
//	}
//
//	@Override
//	public void select(long account_no) {
//		String sql= "select * from OCCUPATION_ACCOUNT_DET";
//		
//		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
//			Occupation_Account_Detail op=new Occupation_Account_Detail();
//			op.setAccount_no(account_no);
//			ResultSet rs=stmt.executeQuery(sql);
//			while(rs.next()) {
//				if(op.getAccount_no()==rs.getLong(1)) {
//					System.out.println(rs.getLong(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getLong(4));
//				}
//			}
//			
//			rs.close();
//
//		} catch (SQLException e) {
//			System.err.println(e);
//			e.printStackTrace();
//
//		}
//	}
	
	


