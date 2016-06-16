/**
 * 
 */
package com.bb.bbwebapp.controller;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.User;
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
	
	private static final String GROUP_NAME="groupName"; 
	private static final String HEADS="heads";

	@RequestMapping( value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("emailAddress") String emailAddress,@RequestParam("password")
	String password){
	
		
		ModelAndView modelAndView=new ModelAndView();
		Optional<User> optionalUser=userservice.getUserFromEmailIdAndPassword(emailAddress, password);
		if(!optionalUser.equals(Optional.empty()))
		{
			System.out.println("User authenticated");
			TBBGroup tbbGroup=tbbGroupService.getTBBBuddyGroupOfUser(optionalUser.get());
			modelAndView.setViewName("home");
			modelAndView.addObject(GROUP_NAME, tbbGroup.getGroupName());
			modelAndView.addObject(HEADS,tbbGroup.getHeads().stream().map(s->s.getName()).collect(Collectors.toList()));
		}
		else{
			System.out.println("User not authenticated");
			modelAndView.setViewName("login");
		}
		
		return modelAndView;
		
	}
}
