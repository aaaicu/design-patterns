# design-patterns [디자인패턴 훈련하기]

## 취지

* 디자인 패턴은 연습이 필요하다. 

* 패턴에 대해서 알고 있고 이해하고 있더라도 개발에 적용하려고 하면 머뭇거리게 되는건 연습이 되어있지 않아서이지 않을까

* 마치 운동선수가 훈련하듯 다양한 주제로 연습을해보면 도움이 되지 않을까

## 시나리오
### 1. 생성 관련 패턴
#### 1) 팩토리 메서드 패턴

![Creator](https://user-images.githubusercontent.com/35210426/190898532-e08a949b-b1b4-44c0-87fa-8d2fef636fda.png)


##### 시나리오 1. 중고거래자 생성
![seconhand-tradepng](https://user-images.githubusercontent.com/35210426/193436567-beca926c-28a2-41d8-b2f1-9bbf248fad41.png)

* 거래자 별로 다른 행동을 하는 거래자를 생성하는 시나리오
* 거래자 종류 :  구매자, 판매자, 쿨구매자, 쿨판매자
  * 구매자 : 구매 가격 협의 제안 
  * 판매자 :  판매 가격 협의 제안
  * 쿨구매자 : 구매 가격 제안 → 수락 요청  
  * 쿨판매자 : 판매가격 제안 → 수락 요청





#### 2) 추상 팩토리 패턴

### 2. 구조 관련 패턴

##### 1) 어댑터 패턴

##### 2) 데코레이터 패턴

### 3. 행동 관련 패턴

#### 1) 옵저버 패턴

#### 2) 전략 패턴
