package com.projectone.controller;

import javax.servlet.http.HttpServletRequest;

import com.projectone.service.UserService;



public class CreateAccountController {
	
	public static String createUser(HttpServletRequest req) {
		String username = req.getParameter("username");
//		int id = Integer.parseInt(req.getParameter("user_id"));
		String password = req.getParameter("password"); 
		String firstName=req.getParameter("firstName"); 
		String lastName=req.getParameter("lastName");
		String email=req.getParameter("email");
		UserService.createUser(username,password,firstName,lastName,email);
		System.out.println("Welcome On Deck");
		return "index.html";
	}

}
