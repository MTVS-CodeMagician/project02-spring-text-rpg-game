package com.ohjiraffers.project02springtextrpggame.command.domain.entity;

import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;

public class UserEntity {

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
