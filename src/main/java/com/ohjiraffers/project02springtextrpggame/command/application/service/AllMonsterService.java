package com.ohjiraffers.project02springtextrpggame.command.application.service;

import com.ohjiraffers.project02springtextrpggame.command.domain.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("monsterService")
public class AllMonsterService {
    private List<MonsterService> monsterService;
    @Autowired
    public AllMonsterService(List<MonsterService> monsterService) {
        this.monsterService=monsterService;
    }
    public boolean attack_monster(int random){
        return monsterService.get(random).attack();
    }
    int getStone(int random){

        return monsterService.get(random).getStone();
    }
//    public List<MonsterDTO> getAllMonster(){
//        return
//    }
}
