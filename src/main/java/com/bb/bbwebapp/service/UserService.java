/**
 * 
 */
package com.bb.bbwebapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.bbwebapp.dao.UserDao;

/**
 * @author ankit
 *
 */
@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public boolean isEmailAndPasswordAreCorrect(String emailAddress,
			String password) {

		return !userDao.getUserFromEmailAndPassword(emailAddress, password).equals(
				Optional.empty());

	}

}
