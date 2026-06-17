package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {

	private List<Player> db_info = null;
	
	public List<Player> getAllPlayer(){
		return db_info;
	}
	
}
