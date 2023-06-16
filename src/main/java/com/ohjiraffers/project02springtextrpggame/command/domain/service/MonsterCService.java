package com.ohjiraffers.project02springtextrpggame.command.domain.service;

import com.ohjiraffers.project02springtextrpggame.command.dto.MonsterDTO;

public class MonsterCService implements MonsterService {
    MonsterDTO monsterC=new MonsterDTO();
    public MonsterCService(){
        this.monsterC.setMonName("몬스터C");
        this.monsterC.setMonStone(3);
        this.monsterC.setMonAttPer(85);
    }
    @Override
    public boolean attack() {
        double tempValue=Math.random();
        int perValue=(int)(tempValue*100);
        return perValue<monsterC.getMonAttPer()? true:false;
    }
}
