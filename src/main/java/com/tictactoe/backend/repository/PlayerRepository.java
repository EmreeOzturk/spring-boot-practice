package com.tictactoe.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tictactoe.backend.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {}
