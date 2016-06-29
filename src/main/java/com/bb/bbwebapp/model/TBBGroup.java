/**
 * 
 */
package com.bb.bbwebapp.model;

import java.util.List;

/**
 * @author ankit
 *
 */
public class TBBGroup {

	private long groupId;
	private String groupName;
	private double floatingLat;
	private double floatingLng;
	private List<User> users;
	private List<Head> heads;
	
	
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public double getFloatingLat() {
		return floatingLat;
	}
	public void setFloatingLat(double floatingLat) {
		this.floatingLat = floatingLat;
	}
	public double getFloatingLng() {
		return floatingLng;
	}
	public void setFloatingLng(double floatingLng) {
		this.floatingLng = floatingLng;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Head> getHeads() {
		return heads;
	}
	public void setHeads(List<Head> heads) {
		this.heads = heads;
	}
	
}
