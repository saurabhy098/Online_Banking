package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.UserRegister;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class UserRegisterDaoImpl implements UserRegisterDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public void insert(UserRegister ur) {
		//String sql = "insert into USER_REGISTER values(?,?,?,?)";
//			ur.setAccount_no(account_no);
//			ur.setUser_id(user_id);
//			ur.setUser_password(user_password);
//			ur.setTransaction_password(transaction_password);
			
			entityManager.persist(ur);
			/*Query qry=manager.createQuery(sql);
			qry.setParameter(1, ur.getAccount_no());
			qry.setParameter(2, ur.getUser_id());
			qry.setParameter(3, ur.getUser_password());
			qry.setParameter(4, ur.getTransaction_password());
			
			int i=qry.executeUpdate();
			//ps.setLong(1, ur.getAccount_no());
			//ps.setString(2, ur.getUser_id());
			//ps.setString(3, ur.getUser_password());
			//ps.setInt(4, ur.getTransaction_password());
			//int i = ps.executeUpdate();
			System.out.println("inserted" + i);*/
			
		
	}

	

}
