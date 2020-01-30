package com.projectone.helper;

import javax.servlet.http.HttpServletRequest;

import com.projectone.controller.HomeController;
import com.projectone.controller.LoginController;


public class LoginHelper {

	public static String process(HttpServletRequest req) {
		switch(req.getRequestURI()) {
			case"/com.projectone/home.go" :
		return HomeController.goHome(req);
		
			case"/com.projectone/user.login" :
				return LoginController.login(req);
		}
		return null;
	}
	
}
