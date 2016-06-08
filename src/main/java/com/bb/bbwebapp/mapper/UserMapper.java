/**
 * 
 */
package com.bb.bbwebapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bb.bbwebapp.model.User;

/**
 * @author ankit
 *
 */
public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		User user=new User();
		user.setEmailAddress(resultSet.getString("emailAddress"));
		user.setPassword(resultSet.getString("password_"));
		return user;
	}

}
