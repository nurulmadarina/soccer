package com.problem.kedua.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.problem.kedua.demo.dao.PlayerDAO;
import com.problem.kedua.demo.dto.BaseResponse;
import com.problem.kedua.demo.dto.RequestDto;
import com.problem.kedua.demo.dto.ResponseCreatePlayer;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.Silent.class) 
public class SoccerServiceTestCreatePlayer {

	@InjectMocks
	private SoccerService soccerService = new SoccerService();
	
	@Mock
	private PlayerDAO playerDAO;

	@Test
	public void testCreatePlayer(){
		RequestDto req = new RequestDto();
		req.setPlayerId(1);
		req.setTeamId(1);
		req.setPlayerName("Abdullah");
		
		ResponseCreatePlayer player1 = new ResponseCreatePlayer();
		player1.setPlayerId(1);
		player1.setPlayerName("Abdullah");
		player1.setTeamId(1);
		Mockito
		.when(playerDAO.createPlayer(req))
		.thenReturn(player1);
		
		BaseResponse response = soccerService.createPlayer(req);
		
		assertEquals(player1.toString(), response.getContent().toString());
	}
	
}
