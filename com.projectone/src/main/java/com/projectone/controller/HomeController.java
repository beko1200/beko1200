package com.projectone.controller;

import javax.servlet.http.HttpServletRequest;

public class HomeController {

	public static String goHome(HttpServletRequest req) {
		return "/com.projectone";
	}

}
