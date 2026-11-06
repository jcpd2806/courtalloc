package com.courtalloc.api.tournament.controller;


import com.courtalloc.api.tournament.model.Tournament;
import com.courtalloc.api.tournament.service.CreateTournamentService;
import com.courtalloc.api.tournament.service.DeleteTournamentService;
import com.courtalloc.api.tournament.service.GetTournamentService;
import com.courtalloc.api.tournament.service.UpdateTournamentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TournamentController {

    public TournamentController(CreateTournamentService createTournamentService, DeleteTournamentService deleteTournamentService, GetTournamentService getTournamentService, UpdateTournamentService updateTournamentService) {
        this.createTournamentService = createTournamentService;
        this.deleteTournamentService = deleteTournamentService;
        this.getTournamentService = getTournamentService;
        this.updateTournamentService = updateTournamentService;
    }

    private final CreateTournamentService createTournamentService;

    private final DeleteTournamentService deleteTournamentService;

    private final GetTournamentService getTournamentService;

    private final UpdateTournamentService updateTournamentService;


    @PostMapping
    public ResponseEntity<String> createNewTournament() {
        return createTournamentService.execute(null);
    }

    @GetMapping
    public ResponseEntity<List<Tournament>> getTournaments() {
        return getTournamentService.execute(null);
    }

    @PutMapping
    public ResponseEntity<String> updateTournament() {
        return updateTournamentService.execute(null);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteTournament() {
        return deleteTournamentService.execute(null);
    }
}
