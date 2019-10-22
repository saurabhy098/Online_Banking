package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bean.Login;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public boolean isValid(Login login) {
		System.out.println("login ho rha he");
		Query qry=manager.createQuery("FROM Login WHERE user_id = :user_id and user_password = :user_password");
//		qry.setParameter("user_id", user_id);
//		qry.setParameter("user_password",user_password);
		System.out.println("1");
		Login l=(Login) qry.getResultList();
		System.out.println(l.getUser_id());
		if(l!=null){
			System.out.println("Valid login");
			return true;
		}
		else return false;
		
	}

}

		