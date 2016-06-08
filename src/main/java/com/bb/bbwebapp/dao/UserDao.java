/**
 * 
 */
package com.bb.bbwebapp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bb.bbwebapp.mapper.UserMapper;
import com.bb.bbwebapp.model.User;

/**
 * @author ankit
 *
 */
@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Optional<User> getUserFromEmailAndPassword(String emailAddress,
			String password) {
		User user = null;
		StringBuilder query = new StringBuilder();
		query.append(" select userId,emailAddress ,password_ from User_ where ")
				.append(" emailAddress=? and password_=?");
		try {
			user = jdbcTemplate.queryForObject(query.toString(), new Object[] {
					emailAddress, password }, new UserMapper());
			return Optional.of(user);
			
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
			return Optional.empty();
		
		} 
			
		

	}

}
