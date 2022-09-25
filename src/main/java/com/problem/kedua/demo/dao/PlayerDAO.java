package com.problem.kedua.demo.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.problem.kedua.demo.dto.RequestDto;
import com.problem.kedua.demo.dto.ResponseCreatePlayer;
import com.problem.kedua.demo.dto.ResponseCreateTeam;
@Repository
public class PlayerDAO {

	HashMap<Integer, ResponseCreatePlayer> playersMap = new HashMap<Integer, ResponseCreatePlayer>();
	public PlayerDAO() {
		ResponseCreatePlayer player1 = new ResponseCreatePlayer();
		player1.setPlayerId(1);
		player1.setPlayerName("Abdullah");
		player1.setTeamId(1);
		
		
		ResponseCreatePlayer player2 = new ResponseCreatePlayer();
		player2.setPlayerId(2);
		player2.setPlayerName("Budi");
		player2.setTeamId(2);
		
		playersMap.put(1, player1);
		playersMap.put(2, player2);
	}
	public ResponseCreatePlayer createPlayer(RequestDto request) {
		ResponseCreatePlayer player = new ResponseCreatePlayer();
		System.out.println ("cek request " + request.getPlayerName());
		player.setPlayerId(request.getPlayerId());
		player.setPlayerName(request.getPlayerName());
		player.setTeamId(request.getTeamId());
		playersMap.put(request.getPlayerId(), player);
		System.out.println(playersMap);
		return playersMap.get(request.getPlayerId());
	}

	public ResponseCreatePlayer createPlayer(int id) {
		return playersMap.get(id);
	}

}
