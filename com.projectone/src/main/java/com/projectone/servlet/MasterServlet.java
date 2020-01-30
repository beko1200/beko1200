package com.projectone.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectone.helper.LoginHelper;

//ADD PATTERSN THAT CORRELATE TO ENDPOINT, MINIMALLY
@WebServlet (urlPatterns = {"*.login","*.go"})
public class MasterServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(LoginHelper.process(req)).forward(req, resp);
	}

}
