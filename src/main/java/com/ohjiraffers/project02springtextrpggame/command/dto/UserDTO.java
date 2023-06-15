package com.ohjiraffers.project02springtextrpggame.command.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private String userName;
    private int userLv;
    private int userAttPer;
    private int userStone;
}
