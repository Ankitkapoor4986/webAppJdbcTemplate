package com.bb.bbwebapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bb.bbwebapp.model.Comment;

public class CommentMapper implements RowMapper<Comment> {

	@Override
	public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comment comment=new Comment();
		comment.setComment(rs.getString("comment"));
		return comment;
	}

}
