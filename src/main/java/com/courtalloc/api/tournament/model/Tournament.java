package com.courtalloc.api.tournament.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tournament")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autogenerates id
    @Column(name = "id")
    private Integer id;

//    TODO: Create Real Version of Class
//    TODO: Drop Current Table from DB
//    TODO: Upload New Table to DB
//    TODO: Create mock data to work with
    @Column(name = "teamName")
    private String teamName;

    @Column(name = "teamLeague")
    private String teamLeague;

    @Column(name = "teamPlayers")
    private int teamPlayers;
}
