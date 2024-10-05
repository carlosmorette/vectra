package com.morette.vectra.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class UserEntityDTO {
    private UUID id;
    private String name;
}
