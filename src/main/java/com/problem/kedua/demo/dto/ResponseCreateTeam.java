package com.problem.kedua.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class ResponseCreateTeam {
	
	@JsonProperty("id")
	private Integer Id;
	@JsonProperty("team_name")
	private String teamName;

}
