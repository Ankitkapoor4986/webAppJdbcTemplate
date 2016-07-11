/**
 * 
 */
package com.bb.bbwebapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;
import com.bb.bbwebapp.service.CommentService;
import com.bb.bbwebapp.service.TBBGroupService;
import com.bb.bbwebapp.service.UserService;

/**
 * @author ankit
 *
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userservice;
	@Autowired
	private TBBGroupService tbbGroupService;

	@Autowired
	private CommentService commentService;

	private static final String GROUP_NAME = "groupName";
	private static final String HEADS = "heads";
	private static final String OTHER_USERS = "other_users";
	private static final String NEW_USERS="new_users";
	private static final String ACTIVE_USERS="active_users";

	@RequestMapping( value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("emailAddress") String emailAddress,@RequestParam("password")
	String password){
	
		
		
		ModelAndView modelAndView=new ModelAndView();
		Optional<User> optionalUser=userservice.getUserFromEmailIdAndPassword(emailAddress, password);
		
		if(!optionalUser.equals(Optional.empty()))
		{
			System.out.println("User Authenticated");
			User user = optionalUser.get();
			TBBGroup tbbGroup=tbbGroupService.getTBBBuddyGroupOfUser(user);
			modelAndView.setViewName("home");
			
			List<String> users=userservice.getUsersFromGroup(tbbGroup.getGroupId(), user.getUserId());
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
			
			modelAndView.addObject(HEADS,tbbGroup.getHeads());
		}
		else{
			System.out.println("User not authenticated");
			modelAndView.setViewName("login");
		}
		
		
		
		return modelAndView;
		
	}
}
