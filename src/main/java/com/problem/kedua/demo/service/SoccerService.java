package com.problem.kedua.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.problem.kedua.demo.dao.PlayerDAO;
import com.problem.kedua.demo.dao.TeamDAO;
import com.problem.kedua.demo.dto.BaseResponse;
import com.problem.kedua.demo.dto.RequestDto;
import com.problem.kedua.demo.dto.ResponseCreatePlayer;
import com.problem.kedua.demo.dto.ResponseCreateTeam;
import com.problem.kedua.demo.dto.ResponseGetTeam;

@Service
public class SoccerService {


	@Autowired
	private TeamDAO teamDAO;
	
	@Autowired
	private PlayerDAO playerDAO;
	
	public BaseResponse createTeam(RequestDto request) {
		ResponseCreateTeam response = teamDAO.createTeam(request);
		return new BaseResponse<>(response);
	}

	public BaseResponse createPlayer(RequestDto request) {
		System.out.println("cek request in service "+ request.getPlayerName());
		ResponseCreatePlayer response = playerDAO.createPlayer(request);
		return new BaseResponse<>(response);
	}

	public BaseResponse getTeam(int id) {
		ResponseGetTeam response = teamDAO.getTeamById(id);
		return new BaseResponse<>(response);
	}

	public BaseResponse getPlayer(int id) {
		ResponseCreatePlayer response = playerDAO.createPlayer(id);
		return new BaseResponse<>(response);
	}

}
