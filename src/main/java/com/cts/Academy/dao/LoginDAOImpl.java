package com.cts.Academy.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Login;

import org.hibernate.HibernateException;
import org.hibernate.Session;

@Repository("loginDAO")
@Transactional
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	LoginDAO loginDAO;
	
	@Transactional(readOnly=true)
	public Login Validate(Login login) {
	try {
		String username= login.getUserId();
		String password= login.getPassword();
		Session session= sessionFactory.getCurrentSession();
		String query = "from Login where userId=? and password=?";
		org.hibernate.query.Query<Login> query2 = null;
		query2 = session.createQuery(query);
		query2.setParameter(0, username);
		query2.setParameter(1, password);
		Login login2= query2.getSingleResult();
		//System.out.println(login2.getUserId());
			return login2;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		return null;
	}
 	}

	
	public String register(Login login) {
		try {
			sessionFactory.getCurrentSession().save(login);
			return "success";
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}
}
