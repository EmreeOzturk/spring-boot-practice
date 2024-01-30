package com.tictactoe.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tictactoe.backend.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
