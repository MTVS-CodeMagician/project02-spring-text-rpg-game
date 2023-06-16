package com.ohjiraffers.project02springtextrpggame.command.domain.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.domain.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserService {

    ApplicationContext getContext =
            new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command.domain.entity");
    UserEntity userEntity = getContext.getBean("userEntity", UserEntity.class);

    ApplicationContext setContext =
            new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command.domain.repository");
    UserRepository userRepository = setContext.getBean("userRepository", UserRepository.class);

    //유저 레벨과 스톤의 초깃값
    public UserService(){
        this.userRepository.setUserLV(1);
        this.userRepository.setUserStone(0);
    }

    // 유저가 공격하는 행동
    public boolean attack() {

        System.out.println(userEntity.getUserName() + "가 공격하였습니다!!");

        // math.random 은 0.0 <= x < 1.0

        if (Math.random() * 100 < userEntity.getUserAttPer()) {
            System.out.println("공격에 성공했습니다!");
            return true;
        } else {
            System.out.println("공격에 실패하였습니다!");
            return false;
        }
    }

    // 경험치 스톤의 갯수
    public int ShowUserStone() {
        return userEntity.getUserStone();
    }

    // 레벨업 + 경험치스톤 로직
    public boolean levelUp() {
        if (userEntity.getUserStone() < 3) {
            return false;
        } else if (userEntity.getUserStone() >= 3) {
            userRepository.setUserLV(userEntity.getUserLV() + 1);
            System.out.println("레벨업에 성공하였습니다!");
            userRepository.setUserStone(0);
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


