package com.bb.bbwebapp.interfaces.dao;

import com.bb.bbwebapp.model.Head;
import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;

public interface TBBGroupDao {

	public  TBBGroup getTBBBuddyGroupOfUser(User user);
	
	public void setHead(Head head);
	
	

}