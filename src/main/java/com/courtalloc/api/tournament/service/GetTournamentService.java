package com.courtalloc.api.tournament.service;

import com.courtalloc.api.tournament.Query;
import com.courtalloc.api.tournament.model.Tournament;
import com.courtalloc.api.tournament.repository.TournamentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTournamentService implements Query<Void, List<Tournament>> {

    private final TournamentRepository tournamentRepository;

    public GetTournamentService(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @Override
    public ResponseEntity<List<Tournament>> execute(Void input) {
        List<Tournament> tournaments = tournamentRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(tournaments);
    }

}
