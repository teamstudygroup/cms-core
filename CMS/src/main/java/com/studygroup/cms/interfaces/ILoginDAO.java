/**
 * 
 */
package com.studygroup.cms.interfaces;

import java.util.List;

import com.studygroup.cms.domain.UserDetails;


public interface ILoginDAO {
	public void validateLogin(String userName, String password);
	public void addUser(UserDetails user);
	public List<UserDetails> listUser();
	public void removeUser(Integer id);
}
