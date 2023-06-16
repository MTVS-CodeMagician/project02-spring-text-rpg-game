package com.ohjiraffers.project02springtextrpggame.command.application.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.domain.repository.UserRepository;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.MonsterService;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BattleFieldService {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command");
        AllMonsterService allMonsterService = context.getBean("monsterService", AllMonsterService.class);


    public void battle() {
//        MonsterDTO finalMonster=context.getBean("addMonster",MonsterDTO.class);
//        System.out.println("finalMonster = " + finalMonster);
        int rand = (int) (Math.random() * 3 + 1);
        int countM = 0;
        int countU = 0;
        UserService userService=new UserService();
        while (true) {
            if (userService.attack()) {
                countU++;
                if (countU == 3) {
                    break;
                }
            }
            if (allMonsterService.attack_monster(rand)) {
                countM++;
                if (countM == 3) {
                    break;
                }
            }
        }

    userService.levelUp();
    /*레벨업 함수*/
    // 마을로 가는 method
    }

}
