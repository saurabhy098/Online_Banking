package com.lti.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.lti.bean.Add_Payee;
import com.lti.util.ConnectionFactory;

public class AddPayeeImpl implements AddPayee {
private Connection getConnection() throws SQLException {
	return ConnectionFactory.getInstance().getConnection();
}

public void insert(String nickname, String rec_name, long rec_accno, long sender_accno) {
	String sql="insert into PAYEE values(?,?,?,?)";
	try(Connection conn=getConnection(); PreparedStatement ps=conn.prepareStatement(sql);){
	Add_Payee ap=new Add_Payee();
	ap.setNick_name(nickname);
	ap.setReceiver_name(rec_name);
	ap.setReceiver_acc_no(rec_accno);
	ap.setSender_acc_no(sender_accno);
	ps.setString(1,ap.getNick_name());
	ps.setString(2, ap.getReceiver_name());
	ps.setLong(3, ap.getReceiver_acc_no());
	ps.setLong(4, ap.getSender_acc_no());
	ps.executeUpdate();
	System.out.println("Inserted");
	}
			
catch(SQLException e) {
	System.err.println();
	e.printStackTrace();
}
}

@Override
public void select(long sender_accno) {
	String sql="select * from PAYEE";
	try(Connection conn=getConnection(); PreparedStatement ps=conn.prepareStatement(sql);){
	Add_Payee ap=new Add_Payee();
	ap.setSender_acc_no(sender_accno);
	//ps.setInt(1, (int)sender_accno);
	ResultSet rs=ps.executeQuery(sql);
	while(rs.next()) {
		if(ap.getSender_acc_no()==rs.getLong(4)) {
			System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getLong(3)+","+rs.getLong(4));
		}
	}
	rs.close();
	
	} catch (SQLException e) {
		System.err.println(e);
		e.printStackTrace();
	}
}
}
