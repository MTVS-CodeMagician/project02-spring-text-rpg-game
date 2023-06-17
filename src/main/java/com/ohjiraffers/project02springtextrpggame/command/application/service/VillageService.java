package com.ohjiraffers.project02springtextrpggame.command.application.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.UserService;
import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Scanner;

@Component("village")
public class VillageService {

    public void villageStart() {
        UserService userService=new UserService();
        String battleAnswer="";
        BattleFieldService battleFieldService =
                new BattleFieldService();

        UserEntity userEntity=new UserEntity();

        Scanner sc = new Scanner(System.in);
        System.out.println(userEntity.getUserName() + "님 환영합니다.");
        System.out.println("현재" + userEntity.getUserName() + "님의 레벨은 " + userEntity.getUserLV() + "입니다.");
        System.out.println("현재" + userEntity.getUserName() + "님의 스톤은 " + userEntity.getUserStone() + "개입니다.");
        System.out.println("배틀필드로 이동 하시겠습니까? (Y/N)");
        battleAnswer = sc.nextLine();
        int temp = 0;
        // 배틀필드로 이동한다[Y/N]' 가 출력되었을 때 Y를 입력시 배틀필드로 이동한다.
        while (true) {
            if (battleAnswer.equals("Y")) {
                System.out.println("배틀필드로 이동합니다.");
                temp = 1;
                break;
            } else {
                System.out.println("마을에 머뭅니다.");
                System.out.println("현재 " + userEntity.getUserName() + "님의 레벨은 " + userEntity.getUserLV() + "입니다.");
                System.out.println("현재 " + userEntity.getUserName() + "님의 스톤은 " + userEntity.getUserStone() + "개입니다.");
                System.out.println("배틀필드로 이동 하시겠습니까? (Y/N)");
                battleAnswer = sc.nextLine();
            }
        }
        if (temp == 1) {
            battleFieldService.battle();
        }
    }


    public void villageStay() {
        String battleAnswer="";
        BattleFieldService battleFieldService = new BattleFieldService();
        UserEntity userEntity=new UserEntity();

        System.out.println("TestStay");


        Scanner sc = new Scanner(System.in);
        System.out.println(userEntity.getUserName() + "님의 레벨은" + userEntity.getUserLV() + "입니다");
        System.out.println(userEntity.getUserName() + "님의 스톤은" + userEntity.getUserStone() + "개입니다");
        System.out.println("배틀필드로 이동 하시겠습니까? (Y/N)");
        battleAnswer = sc.nextLine();

        int temp = 0;
        while (true) {
            if (battleAnswer.equals("Y")) {
                System.out.println("배틀필드로 이동합니다.");
                temp = 1;
                break;
            } else {
                System.out.println("마을에 머뭅니다.");
                System.out.println("현재" + userEntity.getUserName() + "님의 레벨은 " + userEntity.getUserLV() + "입니다.");
                System.out.println("현재" + userEntity.getUserName() + "님의 스톤은 " + userEntity.getUserStone() + "개입니다.");
                System.out.println("배틀필드로 이동 하시겠습니까? (Y/N)");
                battleAnswer = sc.nextLine();
            }
        }
        if (temp == 1) {
            battleFieldService.battle();
        }
    }
}