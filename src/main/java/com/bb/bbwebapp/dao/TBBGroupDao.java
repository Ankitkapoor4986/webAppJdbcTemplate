/**
 * 
 */
package com.bb.bbwebapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bb.bbwebapp.mapper.TBBGroupMapper;
import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;

/**
 * @author ankit
 *
 */
@Repository
public class TBBGroupDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public TBBGroup getTBBBuddyGroupOfUser(User user) {

		StringBuilder query=new StringBuilder("select g.groupName as ")
		.append(" groupName ,h.name as head_name from User_ u join TBB_Buddy_Group bg ")
		.append(" on u.userId=bg.userId join TBB_Group g ")
		.append("  on g.groupId=bg.groupId and u.userId=? ")
		.append(" join TBB_Head h on g.groupId=h.groupId ");
		 
		return jdbcTemplate.queryForObject(query.toString(),new Object[] {user.getUserId()},
				new TBBGroupMapper());
		
	}

	
}
