package com.problem.kedua.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.problem.kedua.demo.dao.TeamDAO;
import com.problem.kedua.demo.dto.BaseResponse;
import com.problem.kedua.demo.dto.RequestDto;
import com.problem.kedua.demo.dto.ResponseCreatePlayer;
import com.problem.kedua.demo.dto.ResponseCreateTeam;

public class SoccerServiceTestCreateTeam {

	@InjectMocks
	private SoccerService soccerService = new SoccerService();
	
	@Mock
	private TeamDAO teamDAO;

	@Test
	public void testCreatePlayer(){
		RequestDto req = new RequestDto();
		req.setId(1);
		req.setTeamName("ABC Football Club");
		
		ResponseCreateTeam team = new ResponseCreateTeam();
		team.setId(1);
		team.setTeamName("ABC Football Club");
		
		Mockito
		.when(teamDAO.createTeam(req))
		.thenReturn(team);
		
		BaseResponse response = soccerService.createTeam(req);
		
		assertEquals(team.toString(), response.getContent().toString());
	}
}
