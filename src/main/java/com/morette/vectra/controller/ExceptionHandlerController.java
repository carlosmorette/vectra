package com.morette.vectra.controller;

import com.morette.vectra.dto.ErrorResponseDTO;
import com.morette.vectra.exception.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleEntityNotFound(
            EntityNotFoundException exception
    ) {
        ErrorResponseDTO errorResponseDTO = ErrorResponseDTO.builder()
                .message(exception.getMessage())
                .type(exception.getEntity())
                .build();

        return new ResponseEntity<ErrorResponseDTO>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }
}
