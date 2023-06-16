package com.ohjiraffers.project02springtextrpggame.command.domain.entity;

import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;

public class UserEntity {

    private UserDB userSave = UserDB.getUserInstance();

    public String getUserName() {
        return userSave.getUserName();
    }

    public int getUserLV() {
        return userSave.getUserLV();
    }

    public int getUserAttPer() {
        return userSave.getUserAttPer();
    }

    public int getUserStone() {
        return userSave.getUserStone();
    }
}
