/**
 * 
 */
package com.bb.bbwebapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
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

	public User getUserFromEmailAndPassword(String emailAddress, String password) {

		StringBuilder query = new StringBuilder();
		query.append(" select emailAddress ,password from User_ where ")
				.append(" emailAddress=? and password=?");

		return jdbcTemplate.queryForObject(query.toString(), new Object[] {
				emailAddress, password }, new UserMapper());

	}

}
