package com.cg.demo.dao;

import java.util.List;

import com.cg.demo.model.Player;

public interface PlayerDao {
	
	String addPlayer (Player player);
	List<Player> getAll();

}
