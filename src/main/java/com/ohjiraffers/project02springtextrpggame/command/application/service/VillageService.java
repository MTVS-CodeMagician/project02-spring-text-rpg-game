package com.ohjiraffers.project02springtextrpggame.command.application.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Scanner;

@Component("village")
public class VillageService {

    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command.domain.entity");
    UserEntity userEntity = context.getBean("userEntity", UserEntity.class);

    BattleFieldService battleFieldService =
            new BattleFieldService();

    String battleAnswer;

    public void villageStart() {
//        UserDB userDB = UserDB.getUserInstance();

        Scanner sc = new Scanner(System.in);
        System.out.println(userEntity.getUserName() + "님 환영합니다.");
        System.out.println("현재" + userEntity.getUserName() + "님의 레벨은 " + userEntity.getUserLV() + "입니다.");
        System.out.println("현재" + userEntity.getUserName() + "님의 스톤은 " + userEntity.getUserStone() + "개입니다.");
        System.out.println("배틀필드로 이동 하시겠습니까? (Y/N)");
        battleAnswer = sc.nextLine();

        // 배틀필드로 이동한다[Y/N]' 가 출력되었을 때 Y를 입력시 배틀필드로 이동한다.
        while (true) {
            if (battleAnswer.equals("Y")) {
                System.out.println("배틀필드로 이동합니다.");
                battleFieldService.battle();
                break;
            } else {
                System.out.println("마을에 머뭅니다.");
                System.out.println("현재" + userEntity.getUserName() + "님의 레벨은 " + userEntity.getUserLV() + "입니다.");
                System.out.println("현재" + userEntity.getUserName() + "님의 스톤은 " + userEntity.getUserStone() + "개입니다.");
                System.out.println("배틀필드로 이동 하시겠습니까? (Y/N)");
                battleAnswer = sc.nextLine();
            }
        }
    }


}