package com.ohjiraffers.project02springtextrpggame.command.domain.service;

import com.ohjiraffers.project02springtextrpggame.command.dto.MonsterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository("monsterCService")
public class MonsterCService implements MonsterService {
    MonsterDTO monsterC=new MonsterDTO();
    public MonsterCService(){
        this.monsterC.setMonName("몬스터C");
        this.monsterC.setMonStone(3);
        this.monsterC.setMonAttPer(85);
    }
    @Override
    public boolean attack() {
        System.out.println("몬스터 C 공격!");
        double tempValue=Math.random();
        int perValue=(int)(tempValue*100);
        return perValue<monsterC.getMonAttPer()? true:false;
    }
    @Override
    public int getStone() {
        return monsterC.getMonStone();
    }
}
