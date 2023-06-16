package com.ohjiraffers.project02springtextrpggame.command.domain.service;

import com.ohjiraffers.project02springtextrpggame.command.dto.MonsterDTO;

public class MonsterBService implements MonsterService {
    MonsterDTO monsterB=new MonsterDTO();
    public MonsterBService(){
        this.monsterB.setMonName("몬스터B");
        this.monsterB.setMonStone(2);
        this.monsterB.setMonAttPer(50);
    }
    @Override
    public boolean attack() {
        double tempValue=Math.random();
        int perValue=(int)(tempValue*100);
        return perValue>monsterB.getMonAttPer()? true:false;
    }
}
