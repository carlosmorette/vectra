package com.morette.vectra.service;

import com.morette.vectra.UserRepository;
import com.morette.vectra.domain.UserEntity;
import com.morette.vectra.dto.UserEntityDTO;
import com.morette.vectra.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntityDTO getByID(UUID id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado", UserEntity.class.toString()));
        return userEntity.parseToDTO();
    }
}
