/**
 * 
 */
package com.studygroup.cms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studygroup.cms.interfaces.ILoginDAO;

@Repository("loginDAO")
public class LoginDAO implements ILoginDAO {
	
//	private SessionFactory sessionFactory;
//    
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
    
	public void validateLogin(String userName, String password) {
		System.out.println("UserName: from DAO : " + userName);
		
		System.out.println("Password: from DAO : " + password);
	}
}
