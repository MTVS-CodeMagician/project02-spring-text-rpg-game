package com.ohjiraffers.project02springtextrpggame.command.domain.repository;

import com.ohjiraffers.project02springtextrpggame.command.infra.database.UserDB;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("userRepository")
public class UserRepository {

    private UserDB userDB = UserDB.getUserInstance();

    public void setUserName(String userName) {
        String pattern1 = "^[가-힣]{2,5}$";
        /*
            /^[가-힣] 가~ 힣 까지 모든 조합된 한글 (ㄱ,ㄴ,ㄷ,ㅏ,ㅑ등 불가능)
            {2,5}$ 2자~5자 내의 문자패턴
            특수문자, 공백, 숫자 제외
         */
        if(!userName.matches(pattern1)){
            /*
                입력받은 이름이, 패턴과 일치하지 않을경우
                IllegalArgumentException 발생
             */
            throw new IllegalArgumentException("형식에 맞지않는 이름 입니다.");
        }
        userDB.setUserName(userName);
    }

    public void setUserLV(int userLV) {
        userDB.setUserLV(userLV);
    }

    public void setUserAttPer(int userAttPer) {
        userDB.setUserAttPer(userAttPer);
    }

    public void setUserStone(int userStone) {
        userDB.setUserStone(userStone);
    }

    public void clearUserDB() {
        userDB.setUserName("");
        userDB.setUserLV(0);
        userDB.setUserAttPer(0);
        userDB.setUserStone(0);
    }

}
