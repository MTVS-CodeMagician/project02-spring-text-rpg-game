package com.ohjiraffers.project02springtextrpggame.command.domain.service;

import com.ohjiraffers.project02springtextrpggame.command.dto.MonsterDTO;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
class MonsterCServiceTest {
    @Test
    void TestAttackA(){
        int temp=0;
        MonsterAService monsterAService
                =new MonsterAService();
        for (int i=0; i<100; i++){
            if(monsterAService.attack()){
                temp+=1;
            }
        }
        boolean result;
        if(temp>=15&&temp<=35){
            result=true;
        }else{
            result=false;
        }
        assertTrue(result);
    }
    @Test
    void TestAttackB(){
        int temp=0;
        MonsterBService monsterBService
                =new MonsterBService();
        for (int i=0; i<100; i++){
            if(monsterBService.attack()){
                temp+=1;
            }
        }
        boolean result;
        if(temp>=40&&temp<=60){
            result=true;
        }else{
            result=false;
        }
        assertTrue(result);
    }
    @Test
    void TestAttackC(){
        int temp=0;
        MonsterCService monsterCService
                =new MonsterCService();
        for (int i=0; i<100; i++){
            if(monsterCService.attack()){
                temp+=1;
            }
        }
        boolean result;
        if(temp>=75&&temp<=95){
            result=true;
        }else{
            result=false;
        }
        assertTrue(result);
    }
}