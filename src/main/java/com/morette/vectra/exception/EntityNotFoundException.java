package com.morette.vectra.exception;

import lombok.Getter;

@Getter
public class EntityNotFoundException extends RuntimeException {
    String entity;

    public EntityNotFoundException(String message, String entity) {
        super(message);
        this.entity = entity;
    }
}
