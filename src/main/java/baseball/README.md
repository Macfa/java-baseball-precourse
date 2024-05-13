# BaseBall Game

* Application
  * Main
* Game ( 플레이어 컴퓨터 초기화 )
  * properties
  * methods
    * void start()
* Player
  * properties
    * String inputString
  * methods
    * 숫자 입력
* Computer
  * properties
    * List<Integer> question
  * methods
    * 랜덤 숫자 초기화 

## Process
1. 게임을 시작한다
2. 컴퓨터가 랜덤숫자를 생성한다
3. 사용자가 숫자를 입력한다
4. 답을 검증하고 결과값에 대한 힌트를 출력한다
5. 맞다면 6번으로 넘어가고 틀리다면 3번으로 돌아간다.
6. 재시작 할건지 종료할건지 출력하고 입력값을 받는다
7. 입력값이 1 이라면 1번으로 돌아가고 1 이 아니라면 8번으로 넘어간다
8. 프로그램 종료

