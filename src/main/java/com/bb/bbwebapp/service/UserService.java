/**
 * 
 */
package com.bb.bbwebapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.constants.Constants;
import com.bb.bbwebapp.jdbcTemplate.dao.UserDao;
import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;

/**
 * @author ankit
 *
 */
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private TBBGroupService tbbGroupService;
	
	private static final String HEADS = "heads";
	private static final String OTHER_USERS = "other_users";
	private static final String NEW_USERS="new_users";
	private static final String ACTIVE_USERS="active_users";

	public Optional<User> getUserFromEmailIdAndPassword(String emailAddress,
			String password) {

		return userDao.getUserFromEmailAndPassword(emailAddress, password);

	}
	
	
	
	public List<String> getUsersFromGroup(long groupId, long userId){
		return userDao.getUsersFromGroup(groupId, userId);
		
	}
	
	public void setGroupHeadsHomeViewAndUsers(ModelAndView modelAndView, User user) {
		TBBGroup tbbGroup=tbbGroupService.getTBBBuddyGroupOfUser(user);
		modelAndView.setViewName("home");
		
		long userId = user.getUserId();
		List<String> users=getUsersFromGroup(tbbGroup.getGroupId(), userId);
		List<String> activeUsers;
		List<String> newUsers;
		
		
		
		activeUsers=new ArrayList<String>();
		activeUsers.add(users.get(users.size()-1));
		users.remove(users.get(users.size()-1));
		
		newUsers=new ArrayList<String>();
		newUsers.add(users.get(users.size()-1));
		users.remove(users.get(users.size()-1));
		
		modelAndView.addObject(OTHER_USERS,users);
		modelAndView.addObject(ACTIVE_USERS,activeUsers);
		modelAndView.addObject(NEW_USERS,newUsers);
		modelAndView.addObject(Constants.USER_ID_PARAM,userId);
		modelAndView.addObject(HEADS,tbbGroup.getHeads());
	}
}
