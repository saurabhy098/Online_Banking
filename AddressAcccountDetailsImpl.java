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

import com.lti.bean.AddressAccountDetail;
//import com.lti.beans.User;
import com.lti.util.ConnectionFactory;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class AddressAcccountDetailsImpl implements AddressAccountDetails {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public AddressAccountDetail select(BigDecimal accno) {
		Query qry=manager.createQuery("FROM AddressAccountDetail where account_no =:account_no");
		System.out.println("enter");
		qry.setParameter("account_no", accno);
		AddressAccountDetail userResult = null;
		userResult = (AddressAccountDetail) qry.getSingleResult();
	//System.out.println("D2");
		System.out.println(userResult);
		//System.out.println("D3");
		return userResult;
	
	}

//	@Override
//	public void insert(long accno, String addrline1, String addrline2, String land_mark, String state, String city,
//			int pincode) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void insert(long accno, String addrline1, String addrline2, String land_mark, String state, String city,
//			int pincode) {
//		String sql="insert into ADDRESS_ACCOUNT_DET values(?,?,?,?,?,?,?)";
//		try(Connection conn=getConnection(); PreparedStatement ps=conn.prepareStatement(sql);){
//			Address_Account_Detail aad=new Address_Account_Detail();
//			aad.setAccount_no(accno);
//			aad.setAddress_line1(addrline1);
//			aad.setAddress_line2(addrline2);
//			aad.setLandmark(land_mark);
//			aad.setUser_state(state);
//			aad.setCity(city);
//			aad.setPincode(pincode);
//			ps.setLong(1, aad.getAccount_no());
//			ps.setString(2, aad.getAddress_line1());
//			ps.setString(3, aad.getAddress_line2());
//			ps.setString(4, aad.getLandmark());
//			ps.setString(5, aad.getUser_state());
//			ps.setString(6, aad.getCity());
//			ps.setInt(7, aad.getPincode());
//			ps.executeUpdate();
//		}catch(SQLException e) {
//			System.err.println(e);
//			e.printStackTrace();
//		}
//	}

//	@Override
//	public void select(long accno) {
//		String sql="select * from ADDRESS_ACCOUNT_DET";
//		try(Connection conn=getConnection(); PreparedStatement ps=conn.prepareStatement(sql);){
//			Address_Account_Detail aad=new Address_Account_Detail();
//			aad.setAccount_no(accno);
//			//ps.setInt(1, (int)sender_accno);
//			ResultSet rs=ps.executeQuery(sql);
//			while(rs.next()) {
//				if(aad.getAccount_no()==rs.getLong(1)) {
//					System.out.println(rs.getLong(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getInt(7));
//				}
//			}
//			rs.close();
//			
//			} catch (SQLException e) {
//				System.err.println(e);
//				e.printStackTrace();
//			}
//	}
	
	
	
	
	
	
	
	
	
	
	

}
