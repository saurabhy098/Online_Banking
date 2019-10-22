package com.lti.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.lti.bean.UserRegister;
import com.lti.dao.UserRegisterDao;





@Service("userRegisterService")
public class UserRegisterServiceImpl implements UserRegisterService{

	@Autowired
	UserRegisterDao userRegisterDao;
	
	@Override
	public void insert(UserRegister ur) {
		userRegisterDao.insert(ur);
	}

}
