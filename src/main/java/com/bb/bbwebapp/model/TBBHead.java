package com.bb.bbwebapp.model;

import java.util.List;

public class TBBHead {
	
	private long id;
	private String name;
	private List<Comment> comments;
	private TBBGroup group;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public TBBGroup getGroup() {
		return group;
	}
	public void setGroup(TBBGroup group) {
		this.group = group;
	}

}
