package com.ohjiraffers.project02springtextrpggame.command.domain.service;

import com.ohjiraffers.project02springtextrpggame.command.dto.MonsterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository("monsterBService")
public class MonsterBService implements MonsterService {
        MonsterDTO monsterB=new MonsterDTO();
    public MonsterBService(){
        this.monsterB.setMonName("몬스터B");
        this.monsterB.setMonStone(2);
        this.monsterB.setMonAttPer(50);
    }

    @Override
    public boolean attack() {
        System.out.println("몬스터 B 공격!");
        double tempValue=Math.random();
        int perValue=(int)(tempValue*100);
        return perValue<monsterB.getMonAttPer()? true:false;
    }
    @Override
    public int getStone() {
        return monsterB.getMonStone();
    }
}
