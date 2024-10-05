package com.morette.vectra.domain;

import com.morette.vectra.dto.UserEntityDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    public UserEntityDTO parseToDTO() {
        return new UserEntityDTO(
                this.getId(),
                this.getName()
        );
    }
}
