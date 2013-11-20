/**
 * 
 */
package com.studygroup.cms.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.studygroup.cms.interfaces.ILoginDAO;
import com.studygroup.cms.interfaces.ILoginService;

@Service("loginService")
public class LoginService implements ILoginService {
	
	@Resource(name="loginDAO")
	private ILoginDAO loginDAO;
	
	public void validateLogin(String userName, String password) {
		System.out.println("UserName: " + userName);
		
		System.out.println("Password: " + password);
		loginDAO.validateLogin(userName, password);
	}

}
