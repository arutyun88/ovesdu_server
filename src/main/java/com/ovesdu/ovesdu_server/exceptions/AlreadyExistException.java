package com.ovesdu.ovesdu_server.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AlreadyExistException extends Exception {
    @Getter
    private final String message;
}
