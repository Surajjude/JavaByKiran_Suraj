package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao1 {

	private String url = "jdbc:postgresql://localhost:5432/jdbcdemo";
	private String username = "postgres";
	private String password = "Namdevrao888@";
	
	private PreparedStatement ps = null;
	private Connection conn = null;
	private ResultSet rs = null;
	List<Player> db_info = new ArrayList<Player>();
	
	public List<Player> getAllPlayers(){
		
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, username, password);
			ps = conn.prepareStatement("SELECT * FROM players order by id asc");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String pName = rs.getString(2);
				int jNo = rs.getInt(3);
				String tName = rs.getString(4);
				int run = rs.getInt(5);
				int wicket = rs.getInt(6);
				
				Player p = new Player(id,pName,jNo,tName,run,wicket);
				db_info.add(p);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return db_info;
	}

	public int updateRuns(int id, int runs) {
		int result=0;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, username, password);
			ps = conn.prepareStatement("update players set run = ? where id = ?");
			ps.setInt(1,runs);
			ps.setInt(2, id);
			result = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int updateWickets(int idt, int wicket) {
		int result=0;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, username, password);
			ps = conn.prepareStatement("update players set wicket = ? where id = ?");
			ps.setInt(1,wicket);
			ps.setInt(2, idt);
			result = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	
}

