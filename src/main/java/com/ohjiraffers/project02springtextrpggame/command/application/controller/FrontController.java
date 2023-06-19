package com.ohjiraffers.project02springtextrpggame.command.application.controller;

import com.ohjiraffers.project02springtextrpggame.command.application.service.VillageService;
import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.domain.repository.UserRepository;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.UserService;
import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component("frontController")
public class FrontController {

    ApplicationContext repoContext = new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command.domain.repository");
    UserRepository userRepository = repoContext.getBean("userRepository", UserRepository.class);


    ApplicationContext villageContext = new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command.application.service");
    VillageService villageService = villageContext.getBean("village", VillageService.class);


    String userName;

    public void gameStart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("코드 매지션 RPG 게임에 오신 것을 환영합니다.");
        System.out.println("닉네임을 2글자에서 5글자 사이로 한글로만 알맞게 입력하세요.");
        userName = sc.nextLine();

        while (true) {
            try {
                userRepository.setUserName(userName);
                System.out.println(userName + "님 게임을 시작하겠습니다.");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("잘못 입력하셨습니다. 닉네임을 다시 입력해주세요");
                userName = sc.nextLine();
            }
        }

        villageService.villageStart();
    }



}
