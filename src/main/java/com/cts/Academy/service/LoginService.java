package com.cts.Academy.service;

import com.cts.Academy.bean.Login;

public interface LoginService {
	public Login Validate(Login login);
	public String register(Login login);
}
