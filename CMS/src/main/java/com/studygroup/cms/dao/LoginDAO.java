/**
 * 
 */
package com.studygroup.cms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.studygroup.cms.domain.UserDetails;
import com.studygroup.cms.interfaces.ILoginDAO;

@Repository("loginDAO")
public class LoginDAO implements ILoginDAO {
	
	@Autowired
    @Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
    
	
         
	public void validateLogin(String userName, String password) {
		System.out.println("UserName: from DAO : " + userName);
		
		System.out.println("Password: from DAO : " + password);
		
		List<UserDetails> users = listUser();
		if(users != null){
			System.out.println("Number of users from DB : " + users.size());
		} else {
			System.out.println("No user from DB");
		}
	}
	
	
	@Transactional
	public void addUser(UserDetails user) {
        sessionFactory.getCurrentSession().save(user);
    }
	
	@Transactional
	public List<UserDetails> listUser() {
		 //sessionFactory.getCurrentSession().createQuery("from UserDetails").list()
		System.out.println("Inside List User....");
		//Session s = sessionFactory.openSession();
		if(sessionFactory != null){
			System.out.println("Able to get session factory instance ....");
			
		} else {
			System.out.println("Can't get session from factory instance ....");
		}
        return null;
        
    }
	
	@Transactional
	public void removeUser(Integer id) {
        UserDetails user = (UserDetails) sessionFactory.getCurrentSession().load(
                UserDetails.class, id);
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
 
    }
}
