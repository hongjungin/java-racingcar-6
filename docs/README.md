
## 게임 시작

[ ] 게임 시작 메시지 출력

    -> 경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
    
[ ] 자동차 이름, 경기 횟수 입력 요청 메시지 출력

    -> 시도할 회수는 몇회인가요?
    

## 사용자 입력

[ ] 자동차 이름 입력

    -> 이름은 쉼표(,) 기준으로 구분

    -> 이름은 5자 이하
    
    -> 이름은 영문만 가능 , 빈칸x
    
    
[ ] 경기 반복 횟수 입력

    -> 숫자만 가능
    
[ ] 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료


## 게임 

[ ] 사용자에게 자동차 이름을 받아 쉼표로 구분

[ ] 사용자에게 경기 반복 횟수를 받아 반복함


[ ] 0에서 9 사이에서 무작위 값을 구함

    -> Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용
    
    -> 0에서 9까지의 정수 중 한 개의 정수 반환
    
        Randoms.pickNumberInRange(0,9);
        
[ ] 무작위 값이 4이상인 경우 자동차 전진



## 출력

[ ] 각 횟수별 자동차 이름과 이동 결과 출력

[ ] 자동차 경주 게임을 완료한 후, 누가 우승했는지 알려줌. 우승자는 한 명 이상일 수 있음

    -> 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분

