package com.tictactoe.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tictactoe.backend.entity.Player;
import com.tictactoe.backend.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player findPlayerById(Long playerId) {
        if (playerId != null) {
            return playerRepository.findById(playerId).orElse(null);
        }
        return null;
    }

    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    public Player createPlayer(Player player) {
        if (player != null) {
            player.setPlayerScore(0);
            return playerRepository.save(player);
        }
        return null;
    }

    public void deletePlayerById(Long playerId) {
        if (playerId != null) {
            playerRepository.deleteById(playerId);
        }
    }

    public void updateScore(Long playerId) {
        if (playerId != null) {
            Player player = playerRepository.findById(playerId).orElse(null);
            if (player != null) {
                player.setPlayerScore(player.getPlayerScore() + 1);
                playerRepository.save(player);
            }
        }
    }

}
