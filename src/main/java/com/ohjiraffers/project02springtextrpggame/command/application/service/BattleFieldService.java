package com.ohjiraffers.project02springtextrpggame.command.application.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.domain.repository.UserRepository;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.MonsterService;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class BattleFieldService {

    public void battle() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command");
        AllMonsterService allMonsterService = context.getBean("monsterService", AllMonsterService.class);

        ApplicationContext repoContext = new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command.domain.repository");
        UserRepository userRepository = repoContext.getBean("userRepository", UserRepository.class);

        UserService userService = new UserService();
//        UserRepository userRepository=new UserRepository();
        UserEntity userEntity=new UserEntity();

        VillageService villageService=new VillageService();
        int rand = (int) (Math.random() * 3);
        int countM = 0;
        int countU = 0;
        while (true) {
            if (userService.attack()) {
                countU++;
                if (countU == 3) {
                    System.out.println("전투종료 승리했습니다!");
                    break;
                }
            }
            if (allMonsterService.attack_monster(rand)) {
                countM++;
                if (countM == 3) {
                    System.out.println("전투종료 패배했습니다ㅜ");
                    break;
                }
            }
        }
        if(countM==3){
        }
        if(countU==3){
            userRepository.setUserStone(userEntity.getUserStone()+allMonsterService.getStone(rand));
            userService.levelUp();
        }
        if(userEntity.getUserLV() >= 10){
            System.out.println("당신의 레벨이 10이 되었습니다.");
            System.out.println("ENTER 버튼을 누르면 게임이 종료됩니다. 이용해주셔서 감사합니다.");
            Scanner sc = new Scanner(System.in);
            String enter = sc.nextLine();
            userService.gameEnd(Integer.parseInt(enter));
        }
        villageService.villageStay();
    }

}
