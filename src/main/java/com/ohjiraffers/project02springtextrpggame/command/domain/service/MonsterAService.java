package com.ohjiraffers.project02springtextrpggame.command.domain.service;

import com.ohjiraffers.project02springtextrpggame.command.dto.MonsterDTO;

public class MonsterAService implements MonsterService {
    MonsterDTO monsterA=new MonsterDTO();
    public MonsterAService(){
        this.monsterA.setMonName("몬스터A");
        this.monsterA.setMonStone(1);
        this.monsterA.setMonAttPer(25);
    }
    // 나중에 몬스터 DB를 만들 때는 윗부분을 DB에 따로 분리해서 작성.
    @Override
    public boolean attack() {
        double tempValue=Math.random();
        int perValue=(int)(tempValue*100);
        return perValue<monsterA.getMonAttPer()? true:false;
    }
}
