# kotlin-racingcar-precourse

## 주의해야할 점
 - 여러 역할을 수행하는 큰 함수를 단일 역할을 수행하는 작은 함수로 분리.
 - 테스트 도구를 사용하는 방법을 배우고 프로그램이 제대로 작동하는지 테스트.
1주 차 공통 피드백(디스코드 참고)을 최대한 반영한다.

## 실행 명령어 
- Mac/Linux : ./gradlew clean test
- Window : gradlew.bat clean test
 
## 구현할 사항

#### 문자열, 숫자 입력 (readInput)
    - "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)" 출력
    - 경주할 자동차 이름 입력
    - isEmpty() 를 통해 문자열 확인
    - "시도할 횟수는 몇 회인가요?" 출력
    - 시도할 횟수 입력
    - 시도할 횟수가 0보다 큰지 확인

#### 자동차 이름 추출 (extractCarName)
    - **class**로 분류
    - 문자열 속에 있는 공란 삭제 (replace() 활용)
    - ","를 기준으로 문자열 나누기 (split() 활용)
    - 자동차 이름의 길이가 5보다 클 경우 IllegalArgumentException 처리

#### 자동차 경주 로직 (carRace)
    - 현재 자동차 이동 거리 0으로 맞추기
    - 각 자동차마다 0~9 무작위 값 구하기
    - 무작위 값이 4 이상일 경우, 이동거리 + 1 연산

#### 진행 중인 경주 상태 출력 (writeCurrentRace)
    - 자동차의 현재 위치 출력

#### 경주 결과 확인 (checkRaceResult)
    - 자동차들 간의 이동한 거리 비교

#### 경주 결과 출력 (writeOutput)
    - "최종 우승자 : " 출력하기
    - 우승자 출력하기 
    - 공동 우승자일 경우 ", "로 이어 작성하기

#### 코드 작성 방법
    - 1. 짧은 시간 내에 코드를 구성해서 로직이 맞는지 확인
    - 2. 작성한 코드의 부족한 부분을 분석 및 추가적으로 발생할 수 있는 예외 상황 분석
    - 3. 작성한 코드를 작은 함수 단위로 분해
    - 4. 함수의 작동이 원활한지에 대한 함수 단위 테스트 진행

#### 프로젝트 구성
    ```
    src
    ├─ main
    │  └─ kotlin/racingcar
    │     ├─ Application.kt
    │     ├─ controller/
    │     │  └─ RacingController.kt
    │     ├─ model/
    │     │  ├─ Car.kt
    │     │  └─ Race.kt
    │     ├─ util/
    │     │  ├─ CarFactory.kt
    │     │  ├─ ErrorMessage.kt 
    │     │  └─ Validations.kt
    │     ├─ view/
    │     │  ├─ InputView.kt
    │     │  ├─ OutputView.kt
    │     │  ├─ ConsoleInputView.kt
    │     │  └─ ConsoleOutputView.kt
    └─ test
        └─ kotlin/racingcar
            ├─ ApplicationTest.kt
            ├─ model/  
            │    ├─ CarTest.kt
            │    ├─ RaceTest.kt
            └─ util/
                ├─ CarFactoryTest.kt
                └─ ValidationsTest.kt

    ```