package com.ohjiraffers.project02springtextrpggame.command.application.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.domain.repository.UserRepository;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.MonsterService;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        System.out.println("Test stone 개수 : "+userEntity.getUserStone());
        if(countM==3){
            System.out.println("진짜 졌나요? 네ㅜ");
        }
        if(countU==3){
            System.out.println("진짜 이겼나요? 네!");
            userRepository.setUserStone(userEntity.getUserStone()+allMonsterService.getStone(rand));
            System.out.println("현재 유저의 스톤개수는 : "+userEntity.getUserStone());
            userService.levelUp();
        }
        if(userEntity.getUserLV() == 2){
            System.out.println("ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴ");
            System.out.println("ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴ");
            System.out.println("ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴ");
            System.out.println("ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴ");
            System.out.println("ㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㄴ");
            userService.gameEnd();
        }
        villageService.villageStay();
    }

}
