package com.lti.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.lti.bean.Insert1;
import com.lti.bean.User_Register;
import com.lti.util.ConnectionFactory;

public class UserRegisterImpl implements UserRegister{
	private Connection getConnection() throws SQLException {
		return ConnectionFactory.getInstance().getConnection();
	}
	
	public void insert() {
	String sql="insert into USER_REGISTER values(?,?,?,?)";
	User_Register ur=new User_Register();
	try(Connection conn=getConnection();  PreparedStatement ps=conn.prepareStatement(sql);){
		ur.setAccount_no(1234567890);
		ur.setUser_id("riya123");
		ur.setUser_password("riri");
		ur.setTransaction_password(1234);
		ps.setLong(1, ur.getAccount_no());
		ps.setString(2, ur.getUser_id());
		ps.setString(3, ur.getUser_password());
		ps.setInt(4, ur.getTransaction_password());
		int i=ps.executeUpdate();
		System.out.println("inserted"+i);
	}catch(SQLException e) {
		System.err.println(e);
		e.printStackTrace();
	}
	}

}
