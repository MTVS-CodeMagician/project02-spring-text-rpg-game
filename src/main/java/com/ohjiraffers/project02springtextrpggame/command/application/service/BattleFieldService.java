package com.ohjiraffers.project02springtextrpggame.command.application.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.entity.UserEntity;
import com.ohjiraffers.project02springtextrpggame.command.domain.repository.UserRepository;
import com.ohjiraffers.project02springtextrpggame.command.domain.service.MonsterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BattleFieldService {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohjiraffers.project02springtextrpggame.command");
        AllMonsterService allMonsterService = context.getBean("monsterService", AllMonsterService.class);
//        System.out.println(allMonsterService.attack_monster(1));
    public void battle(UserRepository setUser, UserEntity getUser) {
//        MonsterDTO finalMonster=context.getBean("addMonster",MonsterDTO.class);
//        System.out.println("finalMonster = " + finalMonster);
        int rand = (int) (Math.random() * 3 + 1);
        int countM = 0;
        int countU = 0;
        while (true) {
            if (true/*User attack*/) {
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
      int stone=getUser.getUserStone();
      int Mstone=allMonsterService.getStone(rand);

    /*레벨업 함수*/
    // 마을로 가는 method
    }
}
