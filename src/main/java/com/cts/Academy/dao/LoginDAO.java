package com.cts.Academy.dao;



import com.cts.Academy.bean.Login;

public interface LoginDAO {

	public Login Validate(Login login);
	public String register(Login login);
}
