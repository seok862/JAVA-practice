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

## 메서드 호출

```java
    메서드 이름(값1, 값2, ...);     // 메서드를 호출하는 방법

print99danAll();    // void print99danAll()을 호출
int result = add(3, 5);     // int add(int x, int y)를 호출하고, 결과를 result에 저장

```

## return문
- 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.

## 호출스텍

- 스택(stack) : 밑이 막힌 상자. 위에 차곡차곡 쌓인다.
- 메서드 수행에 필요한 메모리가 제공되는 공간
- 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제

## 기본형 매개변수

- 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다.(read only)
- 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.(read & write)

## static 메서드와 인스턴스 메서드

- 인스턴스 메서드

1. 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
2. 인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드
3. 메서드 내에서 인스턴스 변수(iv) 사용 가능

- static 메서드(클래스메서드)

1. 객체생성없이 '클래스이름.메서드이름()'으로 호출
2. 인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
3. 메서드 내에서 인스턴스 변수(iv) 사용불가

## static을 언제 붙여야 할까?

- 속성(멤버 변수) 중에서 공통 속성에 static을 붙인다.

```java
class Card{
    String kind;        // 무늬
    int number;         // 숫자

    static int width = 100;     // 폭
    static int height = 250;    // 높이
}
```

- 인스턴스 멤버(iv, im)을 사용하지 않는 메서드에 static을 붙인다.

```java
class MaMath2{
    long a, b;

    long add() {return a + b;}      // a, b는 인스턴스 변수
    static long add(long a, long b) {return a + b;}    // a, b는 지역변수
}
```

## 메서드 간의 호출과 참조
- static 메서드는 인스턴스 변수(iv)를 사용할 수 없다.

```java
class TestClass2 {
    int iv;         // 인스턴스 변수
    static int cv;  // 클래스 변수

    void instanceMethod(){      // 인스턴스 메서드
        System.out.println(iv); // 인스턴스 변수를 사용할 수 있다.
        System.out.println(cv); // 클래스 변수를 사용할 수 있다.
    }

    static void staticMethod(){ // static 메서드
        System.out.println(iv); // 에러!! 인스턴스 변수를 사용할 수 없다.
        System.out.println(cv); // 클래스 변수는 사용할 수 있다.
    }
}
```

# 오버로딩(Overloading)
- 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것

## 오버로딩이 성립하기 위한 조건

- 메서드 이름이 같아야 한다.
- 매개변수의 개수 또는 타입이 달라야한다.
- 반환 타입은 영향없다.

```java
// 오버로딩 X, 1번만 만족
int add(int a, int b) { return a+b; }
int add(int x, int y) { return x+y; }

// 오버로딩 X, 1번만 만족
int add(int a, int b) { return a+b; }
long add(int a, int b) { return (long)(x+y); }

// 오버로딩 O, 1,2번 두개 다 만족
int add(int a, long b) { return a+b; }
int add(long a, int b) { return a+b; }

```

# 생성자

- 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
- 인스턴스 생성시 수행할 작업(iv 초기화)에 사용
- 이름이 클래스의 이름과 같아야 한다.
- 리턴값이 없다.(void 안붙임)

```java
class Card{
    Card() {    // 매개변수 없는 생성자.
        // 인스턴스 초기화 작업
    }

    Card(String kind, int number){  // 매개변수 있는 생성자
        // 인스턴스 초기화 작업
    }
}
```

## 기본 생성자(default constructor)
- 매개변수가 없는 생성자

```java
클래스이름(){}  // 기본 생성자
Point(){}      // Point클래스의 기본 생성자
```

## 생성자this()
- 생성자에서 다른 생성자 호출할 때 사용
- 다른 생성자 호출시 첫 줄에서만 사용가능

## 참조변수 this
- 인스턴스 자신을 가리키는 참조변수
- 인스턴스 메서드(생성자 포함)에서 사용가능
- 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
- this가 있는것이 iv

## 참조변수 this와 생성자 this()

    this : 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어 있다.
           모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.

    this(), this(매개변수) : 생성자, 같은클래스의 다른 생성자를 호출할 때 사용한다.

- 이 둘은 비슷하게 생겼을 뿐 완전히 다른것.

# 변수의 초기화
- 지역변수(lv)는 수동 초기화 해야함
- 멤버변수(iv, cv)는 자동 초기화된다.

```java
class InitTest{
    int x;      // 인스턴스 변수
    int y = x;  // 인스턴스 변수

    void method1(){
        int i;      // 지역 변수
        int j = i;  // 에러. 지역변수를 초기화하지 않고 사용
    }

}
```

## 멤버변수의 초기화

- 명시적 초기화(=)

```java
class Car{
    int door = 4;               // 기본형(primitive type) 변수의 초기화
    Engine e = new Engine();    // 참조형(reference type) 변수의 초기화
}
```

- 초기화 블럭
1. 인스턴스 초기화 블럭 : {}
2. 클래스 초기화 블럭 : static{}

- 생성자
```java
Car(String color, String gearType, int door){
    this.color = color;
    this.gearType = gearType;
    this.door = door;
}
```

- 클래스 변수 초기화 시점 : 클래스가 처음 로딩될 때 단 한번
- 인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다
- 