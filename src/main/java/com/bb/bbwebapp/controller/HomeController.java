package com.bb.bbwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bb.bbwebapp.service.CommentService;

@Controller
public class HomeController {

	private static final String COMMENT_KEY="comments";
	@Autowired
	CommentService commentService;
	
	@RequestMapping(value="/getComments" ,method=RequestMethod.GET)
	ModelAndView getCommentsForHead(@RequestParam("head_id")long headId){
		ModelAndView modelAndView=new ModelAndView("comment");
		modelAndView.addObject(COMMENT_KEY, commentService.getCommentsFromHead(headId));
		return modelAndView;
		
	}
}
