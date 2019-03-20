package com.cts.Academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Login;
import com.cts.Academy.dao.LoginDAO;


@Service("loginService")
@Transactional(propagation=Propagation.SUPPORTS)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	public Login Validate(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.Validate(login);
	}

	public String register(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.register(login);
	}
}