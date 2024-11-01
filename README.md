# 로또

## 개요

간단한 로또 발매기를 구현한 프로젝트입니다.<br>
프로그래밍 시 아래의 규칙을 적용했습니다.
- 자바 코드 컨벤션([Java Style Guide](https://github.com/woowacourse/woowacourse-docs/tree/main/styleguide/java))을 지킨다.
- 함수(또는 메서드)가 한 가지 일만 잘 하도록 최대한 작게 만든다.
  -  함수(또는 메서드)의 길이는 15라인을 넘어가지 않는다.
  - indent(인덴트, 들여쓰기) depth는 2까지만 허용한다.
- 클래스와 함수에 대한 단위 테스트를 통해 의도한 대로 정확하게 작동하는지 확인한다.
    - 단, UI(System.out, System.in, Scanner) 로직은 제외한다.
- Java Enum을 적용한다.
- 3항 연산자를 쓰지 않는다.
- else 예약어를 쓰지 않는다. switch/case도 허용하지 않는다.
- `camp.nextstep.edu.missionutils`에서 제공하는 `Randoms` 및 `Console` API를 사용한다.

## 기능 목록

### 로또를 판매한다.

- [ ] 올바른 값이 입력될 때까지 하위 과정을 반복한다.
    - [ ] 구입 금액을 입력받는다.
    - [ ] 입력값이 아래의 조건을 만족하지 않으면 `IllegalArgumentException`을 발생시키고 "[ERROR]"로 시작하는 에러 메시지를 출력한다.
        - [ ] 구입 금액은 숫자만 입력한다.
        - [ ] 구입 금액은 1,000원 단위로 입력한다.
- [ ] 구입 금액에 따른 구입 수량을 계산한다.
- [ ] 아래의 조건을 만족하는 로또를 구입 수량 만큼 발행한다.
    - [ ] 1개의 로또는 6개의 숫자로 이루어져 있다.
    - [ ] 6개의 숫자는 중복되지 않는다.
    - [ ] 로또 번호의 숫자 범위는 1~45이다.
- [ ] 발행한 로또 수량을 출력한다.
- [ ] 발행한 로또 번호를 오름차순으로 정렬하여 출력한다.

### 당첨 번호와 보너스 번호를 추첨한다.

- [ ] 올바른 값이 입력될 때까지 하위 과정을 반복한다.
    - [ ] 당첨 번호를 입력받는다.
    - [ ] 아래의 당첨 번호 조건을 만족하지 않으면 `IllegalArgumentException`을 발생시키고 "[ERROR]"로 시작하는 에러 메시지를 출력한다.
        - [ ] 번호는 쉼표(,)를 기준으로 구분한다.
        - [ ] 6개의 숫자로 이루어져야 한다.
        - [ ] 중복되는 숫자가 없어야 한다.
        - [ ] 숫자가 1~45 범위 안에 포함되어야 한다.
- [ ] 올바른 값이 입력될 때까지 하위 과정을 반복한다.
    - [ ] 보너스 번호를 입력받는다.
    - [ ] 아래의 보너스 번호 조건을 만족하지 않으면 `IllegalArgumentException`을 발생시키고 "[ERROR]"로 시작하는 에러 메시지를 출력한다.
        - [ ] 보너스 번호는 숫자 1개이다.
        - [ ] 숫자가 1~45 범위 안에 포함되어야 한다.
        - [ ] 당첨 번호에 없는 숫자여야 한다.

### 판매한 로또의 당첨 결과를 확인한다.

**🏆 로또 당첨 기준과 금액**

| 당첨 |        기준         |       금액       |
|:--:|:-----------------:|:--------------:|
| 1등 |     6개 번호 일치      | 2,000,000,000원 |
| 2등 | 5개 번호 + 보너스 번호 일치 |  30,000,000원   |
| 3등 |     5개 번호 일치      |   1,500,000원   |
| 4등 |     4개 번호 일치      |    50,000원     |
| 5등 |     3개 번호 일치      |     5,000원     |

- [ ] 발행한 로또 번호와 당첨 번호를 비교해 일치하는 개수를 확인한다.
    - [ ] 번호 5개가 일치하면 나머지 1개가 보너스 번호와 일치하는지 확인한다.
- [ ] 일치하는 번호 개수에 따라 당첨 등수를 확인한다.
- [ ] 당첨 등수 별 당첨 수량에 따라 총 당첨 금액을 계산한다.
- [ ] 총 수익률을 계산한다.
- [ ] 당첨 통계를 출력한다.
    - [ ] 당첨 내역을 출력한다.
    - [ ] 총 수익률을 소수점 둘째 자리에서 반올림해 출력한다.