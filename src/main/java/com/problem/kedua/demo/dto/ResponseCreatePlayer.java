package com.problem.kedua.demo.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;
@Data
public class ResponseCreatePlayer implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("player_id")
//	@SerializedName("player_id")
	private Integer playerId;
	@JsonProperty("team_id")
	private Integer teamId;
	@JsonProperty("player_name")
	private String playerName;
}
