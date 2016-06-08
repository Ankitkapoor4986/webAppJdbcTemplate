/**
 * 
 */
package com.bb.bbwebapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.bbwebapp.dao.UserDao;
import com.bb.bbwebapp.model.User;

/**
 * @author ankit
 *
 */
@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public Optional<User> getUserFromEmailIdAndPassword(String emailAddress,
			String password) {

		return userDao.getUserFromEmailAndPassword(emailAddress, password);

	}

}
