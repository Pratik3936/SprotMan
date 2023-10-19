package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.dao.PlayerDao;
import com.cg.demo.model.Player;

@Service
public class PlayerService implements PlayerDao{
	
	@Autowired
	PlayerDao playerdao;

	@Override
	public String addPlayer(Player player) {
		
		return playerdao.
	}

	@Override
	public List<Player> getAll() {
		// TODO Auto-generated method stub
		return playerdao.getAll();
	}

}
