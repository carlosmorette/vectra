package com.morette.vectra.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder(toBuilder = true)
public class ErrorResponseDTO {
    private String message;
    private String type;

    @Builder.Default
    private LocalDateTime dateTime = LocalDateTime.now();
}
