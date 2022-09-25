package com.problem.kedua.demo.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.problem.kedua.demo.dto.RequestDto;
import com.problem.kedua.demo.dto.ResponseCreateTeam;
import com.problem.kedua.demo.dto.ResponseGetTeam;
@Repository
public class TeamDAO {

	static HashMap<Integer, ResponseCreateTeam> teamsMap = new HashMap<Integer, ResponseCreateTeam>();
	
	public TeamDAO(){
		ResponseCreateTeam team1 = new ResponseCreateTeam();
		
		team1.setId(1);
		team1.setTeamName("ABC Football Club");
		teamsMap.put(1, team1);
		
		ResponseCreateTeam team2 = new ResponseCreateTeam();
		
		team2.setId(2);
		team2.setTeamName("EFG Football Club");
		teamsMap.put(2, team2);
	}
	public ResponseCreateTeam createTeam(RequestDto request) {
		ResponseCreateTeam team = new ResponseCreateTeam();
		team.setId(request.getId());
		team.setTeamName(request.getTeamName());
		teamsMap.put(request.getId(), team);
		return teamsMap.get(request.getId());
	}

	public ResponseGetTeam getTeamById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
