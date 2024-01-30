package com.tictactoe.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tictactoe.backend.entity.Player;
import com.tictactoe.backend.service.PlayerService;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/{playerId}")
    public Player findPlayerById(@PathVariable Long playerId) {
        return playerService.findPlayerById(playerId);
    }

    @GetMapping()
    public Iterable<Player> findAllPlayers() {
        return playerService.findAllPlayers();
    }

    @PostMapping
    @ResponseBody
    public Player createPlayer(@RequestBody Player player) {
        System.out.println("Player: " + player);
        return playerService.createPlayer(player);
    }

    @DeleteMapping("/{playerId}")
    public void deletePlayerById(@PathVariable Long playerId) {
        playerService.deletePlayerById(playerId);
    }

    @PatchMapping("/{playerId}")
    public void updateScore(@PathVariable Long playerId) {
        playerService.updateScore(playerId);
    }

}
