package com.morette.vectra;

import com.morette.vectra.domain.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<UserEntity, UUID> { }
