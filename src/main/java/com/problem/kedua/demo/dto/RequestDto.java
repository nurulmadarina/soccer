package com.problem.kedua.demo.dto;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Integer Id;
	
	@JsonProperty("team_name")
	private String teamName;
	
	@JsonProperty("player_id")
	private Integer playerId;
	
	@JsonProperty("team_id")
	private Integer teamId;
	
	@JsonProperty("player_name")
	private String playerName;
}
