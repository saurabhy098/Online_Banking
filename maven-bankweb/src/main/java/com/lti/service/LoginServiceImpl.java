package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.LoginDao;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;
	
	@Override
	public boolean isValid(String user_id, String user_password) {
		return loginDao.isValid(user_id, user_password);
		
	}

}
