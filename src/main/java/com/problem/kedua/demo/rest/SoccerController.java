package com.problem.kedua.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.problem.kedua.demo.dto.BaseResponse;
import com.problem.kedua.demo.dto.RequestDto;
import com.problem.kedua.demo.service.SoccerService;

@Controller
@RequestMapping("/soccer")
public class SoccerController {

    @Autowired
    private SoccerService soccerService;
    
    // CRUD -- CREATE TEAM
    @RequestMapping(value = "/create/team", method = RequestMethod.POST)
    public @ResponseBody BaseResponse createTeam(@RequestBody RequestDto request) {
        return soccerService.createTeam(request);
    }
    
    // CRUD -- CREATE PLAYER
    @RequestMapping(value = "/create/player", method = RequestMethod.POST)
    public @ResponseBody BaseResponse createPlayer(@RequestBody RequestDto request) {
        return soccerService.createPlayer(request);
    }
    
    // CRUD -- READ Team
    @RequestMapping(value = "/get/team/{id}", method = RequestMethod.GET)
    public @ResponseBody BaseResponse getTeam(@PathVariable ("id") int id) {
        return soccerService.getTeam(id);
    }
    
    // CRUD -- READ Player
    @RequestMapping(value = "/get/player/{id}", method = RequestMethod.GET)
    public @ResponseBody BaseResponse getPlayer(@PathVariable ("id") int id) {
        return soccerService.getPlayer(id);
    }
}
