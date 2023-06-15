# Project02-Spring-Text-Rpg-Game

# Spring을 이용한 Text-RPG 구현

## 프로젝트 소개
- 미니 RPG GAME
- 사용자가 몬스터를 잡으며 성장하는 게임

## 사용자에 대한 정보
- 시작시 이름을 설정할 수 있다.
- 몬스터 공격시 성공 확률은 75%이다.
- 경험치스톤을 3개 이상 획득시 레벨업한다.
- 사용자 레벨이 10에 달성할 시 게임은 종료된다.

## 몬스터에 대한 정보
- 몬스터의 종류는 3가지이다.
- 배틀필드에 출현하는 몬스터 종류는 랜덤이다.

- A몬스터에 대한 정보 : 3번 공격하면 죽는다. 공격시 성공 확률은 25%이다. 죽을 때 경험치스톤을 1개 지급한다.
- B몬스터에 대한 정보 : 3번 공격하면 죽는다. 공격시 성공 확률은 50%이다. 죽을 때 경험치스톤을 2개 지급한다.
- C몬스터에 대한 정보 : 3번 공격하면 죽는다. 공격시 성공 확률은 80%이다. 죽을 때 경험치스톤을 3개 지급한다.


## 요구사항
- 사용자 : 이름, 레벨, 죽는 조건, 공격확률, 보유하고 있는 경험치스톤
- 몬스터 : 몬스터종류, 죽는 조건, 공격확률, 죽을 시 뱉는 경험치스톤
- 배틀필드



## 제약사항
- 가독성 있는 코드로 작성할 수 있도록 할 것
- 메소드 이름은 반드시 명령문 형태로 작성
- 테스트 메소드는 충분히 기능을 검증하도록 작성
- 개인 구현은 반드시 브랜치를 생성 후 구현할 것
  (브랜치 이름은 신규인 경우 feature/기능명 형태로 작성할 것)
- 모든 개인 작업이 끝난 후 PR 생성
- PR에 모든 팀원이 코드 리뷰할 것
- 마지막 리뷰어는 Merge 수행
