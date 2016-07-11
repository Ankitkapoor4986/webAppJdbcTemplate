/**
 * 
 */
package com.bb.bbwebapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.model.User;
import com.bb.bbwebapp.service.CommentService;
import com.bb.bbwebapp.service.UserService;

/**
 * @author ankit
 *
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	

	@Autowired
	private CommentService commentService;

	
	
	

	@RequestMapping( value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("emailAddress") String emailAddress,@RequestParam("password")
	String password){
	
		
		
		ModelAndView modelAndView=new ModelAndView();
		Optional<User> optionalUser=userService.getUserFromEmailIdAndPassword(emailAddress, password);
		
		if(!optionalUser.equals(Optional.empty()))
		{
			System.out.println("User Authenticated");
			User user = optionalUser.get();
			userService.setGroupHeadsHomeViewAndUsers(modelAndView, user);
		}
		else{
			System.out.println("User not authenticated");
			modelAndView.setViewName("login");
		}
		
		
		
		return modelAndView;
		
	}

	
}
