package com.bb.bbwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.bbwebapp.jdbcTemplate.dao.CommentDao;
import com.bb.bbwebapp.model.Comment;

@Service
public class CommentService {

	@Autowired
	CommentDao commentDao;
	
	public List<Comment> getCommentsFromHead(long headId){
		return commentDao.getCommentFromHead(headId);
		
	}
}
