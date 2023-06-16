package com.ohjiraffers.project02springtextrpggame.command.domain.repository;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepository = new UserRepository();

    @AfterEach
    void afterEach() {
        userRepository.clearUserDB();
    }

    @Test
    void saveUserName() {
        assertThrows(IllegalArgumentException.class, () -> userRepository.setUserName("메타버스아카데미"));
    }
}