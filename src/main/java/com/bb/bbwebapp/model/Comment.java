package com.bb.bbwebapp.model;

public class Comment {

	private long id;
	private String comment;
	private User user;
	private TBBHead head;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public TBBHead getHead() {
		return head;
	}
	public void setHead(TBBHead head) {
		this.head = head;
	}
}
