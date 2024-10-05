package com.morette.vectra.controller;

import com.morette.vectra.dto.UserEntityDTO;
import com.morette.vectra.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
@RequestMapping("/api/v1/user")
public class UserController {
    UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<UserEntityDTO> getById(
            @RequestParam(name = "id") UUID id
            ) {
        return ResponseEntity.ok(userService.getByID(id));
    }
}
