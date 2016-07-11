/**
 * 
 */
package com.bb.bbwebapp.jdbcTemplate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bb.bbwebapp.mapper.CommentMapper;
import com.bb.bbwebapp.model.Comment;

/**
 * @author ankit
 *
 */
@Repository
public class CommentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Comment> getCommentFromHead(long headId){
		StringBuilder query=new StringBuilder("select comment,emailAddress from TBB_Comment c join User_  u on u.userId=c.user_id  and head_id=?");
		
		return jdbcTemplate.query(query.toString(), new Object[]{headId},new CommentMapper());
	}

}
