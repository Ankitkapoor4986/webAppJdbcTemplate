package com.bb.bbwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.bbwebapp.dao.CommentDao;
import com.bb.bbwebapp.model.Comment;
import com.bb.bbwebapp.model.Head;

@Service
public class CommentService {

	@Autowired
	CommentDao commentDao;
	
	public List<Comment> getCommentsFromHead(Head head){
		return commentDao.getCommentFromHead(head.getId());
		
	}
}
