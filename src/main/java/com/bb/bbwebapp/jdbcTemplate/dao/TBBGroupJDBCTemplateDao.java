/**
 * 
 */
package com.bb.bbwebapp.jdbcTemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bb.bbwebapp.interfaces.dao.TBBGroupDao;
import com.bb.bbwebapp.mapper.TBBGroupMapper;
import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;

/**
 * @author ankit
 *
 */
@Repository
public class TBBGroupJDBCTemplateDao implements TBBGroupDao  {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	/* (non-Javadoc)
	 * @see com.bb.bbwebapp.dao.ITBBGroupDao#getTBBBuddyGroupOfUser(com.bb.bbwebapp.model.User)
	 */
	@Override
	public TBBGroup getTBBBuddyGroupOfUser(User user) {

		StringBuilder query=new StringBuilder();
		query.append(" select g.groupName as groupName ,h.name as head_name , g.groupId group_id ,h.id head_id ")
		.append(" from User_ u join TBB_Buddy_Group bg on u.userId=bg.userId join TBB_Group g ")
		.append(" on g.groupId=bg.groupId and u.userId=?  left join TBB_Head h on g.groupId=h.groupId ");
		 
		return jdbcTemplate.queryForObject(query.toString(),new Object[] {user.getUserId()},
				new TBBGroupMapper());
		
	}

	
}
