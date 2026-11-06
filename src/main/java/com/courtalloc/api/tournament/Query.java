package com.courtalloc.api.tournament;

import org.springframework.http.ResponseEntity;

public interface Query <I, O> {
    ResponseEntity<O> execute(I input);

}
