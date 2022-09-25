package com.problem.kedua.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class ResponseGetTeam {

	@JsonProperty("id")
	private Integer Id;
	@JsonProperty("team_name")
	private String teamName;
	@JsonProperty("list_player")
	private List<ResponseCreatePlayer> listPlayer;
}
