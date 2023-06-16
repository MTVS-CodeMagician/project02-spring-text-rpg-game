package com.ohjiraffers.project02springtextrpggame.command.infra.database;

import lombok.*;

@Setter
@Getter
@ToString
public class UserDB {

    private String userName;
    private int userLV;
    private int userAttPer;
    private int userStone;

    private static final UserDB userInstance = new UserDB();

    private UserDB(){}

    public static UserDB getUserInstance() {
        return userInstance;
    }
}

