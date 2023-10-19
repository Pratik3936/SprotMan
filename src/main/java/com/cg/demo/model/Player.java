package com.cg.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	private int playerId;
	private String playerName;
	private String playertype;
	public Player(int playerId, String playerName, String playertype) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playertype = playertype;
	}
	public Player() {
		super();
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayertype() {
		return playertype;
	}
	public void setPlayertype(String playertype) {
		this.playertype = playertype;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playertype=" + playertype + "]";
	}
	
	
	
	
	
	
}
