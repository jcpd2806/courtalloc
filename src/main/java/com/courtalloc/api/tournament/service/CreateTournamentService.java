package com.courtalloc.api.tournament.service;

import com.courtalloc.api.tournament.Command;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateTournamentService implements Command<Void, String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
        return  ResponseEntity.status(HttpStatus.CREATED).body("Service: Tournament Created");
    }
}
