# 객체지향 언어

- 80년 초 소프트웨어의 위기 - 빠른 변화를 못쫓아감
- 해결책으로 객체지향 언어를 도입(절차적 > 객체지향)
- 코드의 재사용성이 높고 유지보수가 용이, 중복  코드 제거
- 객체지향 언어 = 프로그래밍 언어 + 객체지향개념(규칙)

## 객체지향프로그래밍 (OOP : object-oriented programming)의 핵심 개념
1. 캡슐화
2. 상속
3. 추상화
4. 다형성

# 클래스와 객체

## 클래스
- 정의 : 객체를 정의해 놓은 것
- 용도 : 객체를 생성하는데 

## 객체
- 정의 : 실제로 존재하는 것. 사물 또는 개념
- 용도 : 객체가 가지고 있는 기능과 속성에 따라 다름

|클래스|객체|
|:---:|:---:|
|제품 설계도|제품|
|TV 설계도|TV|
|붕어빵 기계|붕어빵|

## 객체의 구성 요소 - 속성과 기능

객체 = 속성(변수) + 기능(메서드)

## 객체와 인스턴스
- 객체 : 모든 인스턴스를 대표하는 일반적 용어
- 인스턴스 : 특정 클래스로부터 생성된 객체(예: Tv인스턴스)

Q. 클래스가 왜 필요한가?<br>
A. 객체를 생성하기 위해

Q. 객체가 애 필요한가?<br>
A. 객체를 사용하기 위해

Q. 객체를 사용한다는 것은?<br>
A. 객체가 가진 속성과 기능을 사용하려고

# 객체의 생성과 사용

## 객체의 생성

```java
클래스명 변수명;            // 클래스의 객체를 참조하기 위한 참조변수를 선언
변수명 = new 클래스명();    // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장

Tv t;           // Tv클래스 타입의 참조변수 t를 선언
t = new TV();   // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
```

## 객체의 사용

```java
class Tv {
    String color;
    boolean power;
    int channel;

    void power()        { power = !power;}
    void channelUp()    { channel++;}
    void channelDown()  { channel--;}
}

t.channel = 7;      // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
t.channelDown();    // Tv인스턴스의 메서드 channelDown()을 호출한다.
System.out.println("현재 채널은 " + t.channel + " 입니다.");

```

# 객체 배열

객체 배열 == 참조변수 배열

```java
    Tv tv1, tv2, tv3;     ->    Tv[] tvArr = new Tv[3];

Tv[] tvArr = new Tv[3];     // 길이가 3인 Tv타입의 참조변수 배열

// 객체를 생성해서 배열의 각 요소에 저장
tvArr[0] = new Tv();
tvArr[1] = new Tv();
tvArr[2] = new Tv();

Tv[] tvArr = { new Tv(), new Tv(), new Tv() };
```

# 클래스의 정의(1) : 클래스 == 데이터 + 함수

- 변수 :  하나의 데이터를 저장할 수 있는 공간
- 배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
- 구조체 : 서로 관련된 여러 데이터(종류 관계X)를 하나로 저장할 수 있는 공강

# 클래스의 정의(2) : 사용자 정의 타입

- 원하는 타입을 직접 만들 수 있다.

```java
int hour;       // 시간
int minute;     // 분
int second;     // 초

int hour1, hour2, hour3;
int minute1, minute2, minute3;
int second1, second2, second3;

int[] hour = new int[3];
int[] minute = new int[3];
int[] second = new int[3];


// 세 개의 변수를 묶어서 하나의 클래스로 정의
// 위의 세 경우를 간단히 변경
class Time{     //Time이 사용자 정의 타입
    int hour;
    int minute;
    int second;
}

Time t = new Time();

Time t1= new Time();
Time t2= new Time();
Time t3= new Time();

Time[] t = new Time[3];
t[0] = new Time;
t[1] = new Time;
t[2] = new Time;
```

# 선언위치에 따른 변수의 종류

```java
{   // 클래스 영역
    int iv;             // 인스턴스 변수
    static int cv;      // 클래스 변수(static 변수, 공유변수)

    void method()
    {   //메서드 영역
        int lv = 0;     // 지역변수
    }
}
```

- 객체는 iv변수 묶음

# 클래스 변수와 인스턴스 변수

## 선언 위치 영역

1. 클래스 영역 : iv, cv
2. 메서드 영역 : lv

```java
class Card {
    String kind;    // 무늬
    int number;     // 숫자

    static int width = 100;     // 폭
    static int height = 250;    // 높이

}

Card c = new Card();
c.kind = "HEART";
c.number = 5;

Card.width = 200;
Card.height = 300;
```


# 메서드란?

1. 문장들을 묶어놓은 것 : 작업단위로 문장들을 묶어서 이름 붙인 것

2. 값(입력)을 받아서 처리하고, 결과를 반환(출력)


## 메서드의 장점

- 코드의 중복을 줄일 수 있다.
- 코드의 관리가 쉽다.
- 코드를 재사용할 수 있다.
- 코드가 간결해서 이해하기 쉬워진다.

## 메서드의 작성

- 반복적으로 수행되는 여러 문장을 메서드로 작성
- 하나의 메서드는 한 가지 기능만 수행하도록 작성

## 메서드 = 선언부 + 구현부

```java
반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)     // 선언부
{
    // 메서드 호출시 수행될 코드                       // 구현부
}

int add (int a, int b)
{
    int result = a + b;
    return result;      // 호출한 메서드로 결과를 반환한다.
}
```