package com.ohjiraffers.project02springtextrpggame.command.domain.entity;

import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;
import org.springframework.stereotype.Component;

@Component("userEntity")
public class UserEntity {

    // 객체에 대한 검증로직
    private UserDB userDB = UserDB.getUserInstance();

    public String getUserName() {
        return userDB.getUserName();
    }

    public int getUserLV() {
        return userDB.getUserLV();
    }

    public int getUserAttPer() {
        return userDB.getUserAttPer();
    }

    public int getUserStone() {
        return userDB.getUserStone();
    }
}
