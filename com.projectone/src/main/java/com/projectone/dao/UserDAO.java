package com.projectone.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.projectone.driver.ConnectionFactory;
import com.projectone.model.User;

public class UserDAO implements Contract {
	
	public int insert(User user) {
	
	try {
		Connection connection =  ConnectionFactory.connect();
		String sql ="call add_user(?,?,?,?,?,?)";
		CallableStatement stmt; 
		stmt = connection.prepareCall(sql);
		stmt.setString(2, (user.getUsername()));
		stmt.setString(3, (user.getPassword()));
		stmt.setString(4, (user.getFirstName()));
		stmt.setString(5, (user.getLastName()));
		stmt.setString(6, (user.getEmail()));
		stmt.setInt(7, 2);
		return stmt.executeUpdate();

	} catch (SQLException ex) {
		System.out.println("Problem adding user");
		ex.printStackTrace();
	}
return 0;
}
	
	public User findByUsername(String username) {
		try {
			Connection conn = ConnectionFactory.connect();
			PreparedStatement ps = conn.prepareStatement(
					"select * from ers_users where ers_username = ?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return new User(rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5),
						rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public User findById(int id) {
		
		try {
			Connection connection = ConnectionFactory.connect();
			String sql = "SELECT * FROM users WHERE id=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			return new User (
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6));
		
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
//	private String username;
//	private String password;
//	private String firstName;
//	private String lastName;
//	private String email;

	@Override
	public void insert(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Object findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}


//
//	public void delete(int id) {
//		
//
//		try {
//			Connection connection = ConnectionFactory.connect();
//			String sql = "DELETE FROM cars  WHERE id= ?";
//			PreparedStatement stmt = connection.prepareStatement(sql);
//			stmt.setInt(1, id);
//			stmt.execute();
//			stmt.close();
//			connection.close();
//			} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
//
//	}
	
	
}
