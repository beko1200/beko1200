package com.projectone.service;

import com.projectone.dao.UserDAO;
import com.projectone.model.User;

public class UserService {

	public static void createUser(String name, String password, String firstName, String lastName, String email) {
		int result = new UserDAO().insert(new User(name, password, firstName, lastName, email));

	}

	public static void login(String username, String password) {
		if (username.equals(username) && password.equals(password)) {
		}

	}

	public static void verifyUserLogin() {

//		public static boolean validate(String username, String password) {
//	        try {
//	            Connection conn = ConnectionUtil.connect();
//	            String sql = "{ ? = call validate(?,?) }";
//	            CallableStatement cs = conn.prepareCall(sql);
//	            cs.registerOutParameter(1, Types.BOOLEAN);
//	            cs.setString(2, username);
//	            cs.setString(3, password);
//	            cs.execute();
//	            boolean result = cs.getBoolean(1);
//	            cs.close();
//	            conn.close();
//	            return result;
//	        } catch(SQLException e) {
//	            e.printStackTrace();
//	        }
//	        return false;
//
//	    }
		
		
	}

}
