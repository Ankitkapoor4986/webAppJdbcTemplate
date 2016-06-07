/**
 * 
 */
package com.bb.bbwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.bbwebapp.dao.TBBGroupDao;
import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;

/**
 * @author ankit
 *
 */
@Service
public class TBBGroupService {
	@Autowired
	private TBBGroupDao tbbBuddyGroupDao;
	public TBBGroup getTBBBuddyGroupOfUser(User user){
		return tbbBuddyGroupDao.getTBBBuddyGroupOfUser(user);
	}
}
