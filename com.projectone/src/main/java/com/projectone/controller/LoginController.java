package com.projectone.controller;

import javax.servlet.http.HttpServletRequest;

public class LoginController {

	public static String login (HttpServletRequest req ) {
		System.out.println(req.getMethod());
		if(req.getMethod().toLowerCase().equals("post")) {
			String username = req.getParameter("user");
			String password = req.getParameter("pass");
			
			if(username.equals(username) & password.equals(password)) {
				return "HTML/employee.html";
			} else {
				return "HTML/third.html";
			}
		}
		return "HTML/index.html";
	}
	
}
