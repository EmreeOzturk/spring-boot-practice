package com.tictactoe.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_name", unique = true, nullable = false)
    private String playerName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "player_score")
    private int playerScore;

}
