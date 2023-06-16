package com.ohjiraffers.project02springtextrpggame.command.domain.service;


import com.ohjiraffers.project02springtextrpggame.command.dto.UserDTO;

public class UserService {

    // 유저가 공격하는 행동
    public boolean attack(UserDTO user) {

        System.out.println(user.getUserName() + "가 공격하였습니다!!");

        // math.random 은 0.0 <= x < 1.0

        if (Math.random() * 100 < user.getUserAttPer()) {
            System.out.println("공격에 성공했습니다!");
            return true;
        } else {
            System.out.println("공격에 실패하였습니다!");
            return false;
        }
    }

    // 경험치 스톤의 갯수
    public int ShowUserStone(UserDTO user) {
        return user.getUserStone();
    }

    // 레벨업 로직
    public boolean levelUp(UserDTO user) {
        if (user.getUserStone() < 3) {
            return false;
        } else if (user.getUserStone() >= 3) {
            user.setUserLv(user.getUserLv() + 1);
            System.out.println("레벨업에 성공하였습니다!");
        }
            return true;
    }
}









/* 이하 필기용. 지워도 됨 */

//
//    public void setUserLv(int lv) {
//        this.userLv = lv;
//    }
//
//    public int getUserLv() {
//        return this.userLv;
//    }




//    public boolean levelUp(int userStone, int userLv) {
//        if (userStone < 3) {
//            return false;
//        } else if (userStone >= 3) {
//            userLv =+ 1;
//            System.out.println("레벨업에 성공하였습니다!");
//            return true;
//        }
//    }






// stone 갯수 출력
//name
//stone



//    public int levelUp(int userStone, int userLv) {
//        if(userStone < 3) {
//            //
//        } else if (userStone >= 3) {
//            userLv =+ 1;
//            System.out.println("레벨업에 성공하였습니다!");
//            return userLv;
//            return userStone = 0;
//        }
//    }


