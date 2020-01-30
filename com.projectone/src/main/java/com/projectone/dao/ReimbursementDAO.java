package com.projectone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.projectone.driver.ConnectionFactory;
import com.projectone.model.Reimbursement;
import com.projectone.model.User;



public class ReimbursementDAO {

	public void insert(Reimbursement reimbursement) {

		try {
			Connection connection = ConnectionFactory.connect();
			String sql = "INSERT INTO reimbursements (amount, submitted, resolved, description, author, resolver, status, type) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt;
			stmt = connection.prepareStatement(sql);
			stmt.setDouble(1, (reimbursement.getAmount()));
			stmt.setTimestamp(2, (reimbursement.getSubmitted()));
			stmt.setTimestamp(3, (reimbursement.getResolved()));
			stmt.setString(4, (reimbursement.getDescription()));
			stmt.setInt(5, (reimbursement.getResolver()));
			stmt.setInt(6, (reimbursement.getStatus()));
			stmt.setInt(7, (reimbursement.getStatus()));
			stmt.setInt(8, (reimbursement.getType()));
			stmt.execute();
			stmt.close();
			connection.close();

		} catch (SQLException ex) {
			System.out.println("Problem adding reimbursement");
			ex.printStackTrace();
		}

	}

	public Reimbursement findById(int id) {

		try {
			Connection connection = ConnectionFactory.connect();
			String sql = "SELECT * FROM reimbursements WHERE id=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			return new Reimbursement(rs.getDouble(2), 
					rs.getTimestamp(3), 
					rs.getTimestamp(4),
					rs.getString(5),
					rs.getInt(6), 
					rs.getInt(7), 
					rs.getInt(8), 
					rs.getInt(8));

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static List<Reimbursement> findAll() {
		try {
			Connection conn= ConnectionFactory.connect(); 
			String sql = "select * from reimbursement order by username asc";
			List<Reimbursement> list = new ArrayList<>();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(new Reimbursement(
					rs.getDouble(2),
					rs.getTimestamp(3),
					rs.getTimestamp(4),
					rs.getString(5),
					rs.getInt(6),
					rs.getInt(7),
					rs.getInt(8),
					rs.getInt(9)));
			}
			return list;
			
//			offer = (Map<String, Offer>)

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
