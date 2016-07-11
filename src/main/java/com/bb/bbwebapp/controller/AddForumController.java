package com.bb.bbwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.model.Head;
import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;
import com.bb.bbwebapp.service.TBBGroupService;
import com.bb.bbwebapp.service.UserService;

@Controller
public class AddForumController {
	@Autowired
	UserService userService;
	
	@Autowired
	TBBGroupService tbbGroupservice;

	@RequestMapping(value="/add_forum" ,method=RequestMethod.POST)
	public ModelAndView addForum(@RequestParam("user_id") long userId,
			@RequestParam("forum_discription") String forumDiscription
			,@RequestParam("forum_name") String forumName) {
		ModelAndView modelAndView=new ModelAndView();
		User user=new User();
		user.setUserId(userId);
		//Done for the purpose of POC only ideally there should be some other method
				TBBGroup tbbGroup=tbbGroupservice.getTBBBuddyGroupOfUser(user);
				
				Head head=new Head();
				head.setGroup(tbbGroup);
				head.setName(forumName);
				//Ideally should be moved to head service
				tbbGroupservice.setHead(head);
		userService.setGroupHeadsHomeViewAndUsers(modelAndView, user);
		
		return modelAndView;
	}
}
