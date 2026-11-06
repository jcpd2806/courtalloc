package com.courtalloc.api.tournament;

import org.springframework.http.ResponseEntity;

public interface Command <I, O> {
    ResponseEntity<O> execute(I input);

    interface Query < I, O> {
        ResponseEntity<O> execute(I input);
    }
}
