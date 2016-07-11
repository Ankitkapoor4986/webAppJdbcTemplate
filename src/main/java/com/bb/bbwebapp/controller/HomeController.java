package com.bb.bbwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.constants.Constants;
import com.bb.bbwebapp.service.CommentService;

@Controller
public class HomeController {

	private static final String COMMENT_KEY="comments";
	@Autowired
	CommentService commentService;
	
	@RequestMapping(value="/getComments" ,method=RequestMethod.GET)
	public ModelAndView getCommentsForHead(@RequestParam("head_id")long headId){
		ModelAndView modelAndView=new ModelAndView("comment");
		modelAndView.addObject(COMMENT_KEY, commentService.getCommentsFromHead(headId));
		return modelAndView;
		
	}
	@RequestMapping(value="/add_forum" ,method=RequestMethod.GET)
	public ModelAndView getAddForumPageWithUserId(@RequestParam("user_id") long userId) {
		ModelAndView modelAndView=new ModelAndView("add_forum");
		modelAndView.addObject(Constants.USER_ID_PARAM, userId);
		return modelAndView;
	}
	
	
	
	
	
}
