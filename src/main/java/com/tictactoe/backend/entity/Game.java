package com.tictactoe.backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "game")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_x")
    private Long playerX_id;

    @Column(name = "player_o")
    private Long playerO_id;

    @Column(name = "game_status")
    private String gameStatus;

    @Column(name = "winner")
    private String winner;

    @Column(name = "loser")
    private String loser;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

}
