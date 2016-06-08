/**
 * 
 */
package com.bb.bbwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.service.UserService;

/**
 * @author ankit
 *
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userservice;

	@RequestMapping( value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("emailAddress") String emailAddress,@RequestParam("password")
	String password){
	
		
		ModelAndView modelAndView=new ModelAndView();
		if(userservice.isEmailAndPasswordAreCorrect(emailAddress, password)){
			System.out.println("User authenticated");
		}
		else{
			System.out.println("User not authenticated");
		}
		
		modelAndView.setViewName("home");
		
		
		return null;
		
	}
}
