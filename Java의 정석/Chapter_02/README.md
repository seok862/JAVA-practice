# 변수

## 변수란?

- 하나의 값을 저장할 수 있는 메모리 공간
<br>

# 변수의 선언

## 1. 변수의 선언 이유

- 값을 저장할 공간을 마련하기 위해

## 2. 변수의 선언 방법

     변수타입 변수이름;
     -> int age;

## 3. 변수에 값 저장하기

- 변수에 값 저장하기
```java
int age;            //정수(int) 타입의 변수 age를 선언
age = 25;           //변수 age에 25를 저장
int age = 25;       //위의 두 줄을 한 줄로 
```

- 변수의 초기화

변수에 처음으로 값을 저장하는 것

```java
int x = 0;          //변수 x를 선언 후, 0으로 초기화
int y = 5;          //변수 y를 선언 후, 5로 초기화
int x = 0, y = 5;   //위의 두 줄을 한줄로
```
- 변수의 값 읽어오기

변수에 값이 필요한 곳에 변수의 이름을 적는다.

```java
int year = 0, age = 14;
year = age + 2000;

// year = 14 + 2000;
// year = 2014;

System.out.println(year);
// -> System.out.println(2014)
```

<br>

# 변수의 타입

## 1. 변수의 타입은 저장할 값의 타입에 의해 결정된다.
```java
int age = 25;   /* int가 정수타입 이기 때문에 정수인 25 가능 */

age = 3.14;     /* age가 정수타입으로 선언되었기 때문에 실수인 3.14 불가능*/
```

## 2. 저장할 값의 타입과 일치하는 타입으로 변수를 선언
```java
char ch = '가'      //char는 문자 타입

double pi = 3.14    //double은 실수 타입
```

# 값의 타입

- 기본형

문자 = char <br>
정수 = byte, short, int, long <br>
실수 = float, double <br>
논리 = boolean <br>

- 참조형

기본형을 제외한 나머지 (String, System 등)<br>
메모리 주소를 저장(4 byte 또는 8 byte)

# 변수, 상수, 리터럴

- 변수(variable) : 하나의 값을 저장하기 위한 공간
- 상수(constant) : 한 번만 값을 저장 가능한 변수 *(변수 타입 앞에 final을 붙여서 선언)*
- 리터럴 : 그 자체로 값을 의미하는 것 *(기존의 상수)*

변수는 변경 O 상수는 변경 X

# 문자와 문자열

- char ch = 'A' &nbsp;&nbsp;&nbsp;<-- 문자
- String s = "ABC" &nbsp;&nbsp;&nbsp;<--문자열
<br>

```java
String S = "";           //빈 문자열
char ch = '';            //에러
```

# 기본형 종류와 크기

- 논리형 : true와 false중 하나를 값으로 갖으며, 조건식과 논리적 계산에 사용
- 문자형 : 문자를 저장하는데 사용되며, 변수 당 하나의 문자만을 저장할 수 있다.
- 정수형 : 정수 값을 저장하는데 사용된다.
- 실수형 : 실수 값을 저장하는데 사용된다.

|(byte)|1|2|3|4|
|:---|:---:|:---:|:---:|:---:|
|논리형|boolean||||
|문자형||char|||
|정수형|byte|short|int|long|
|실수형|||float|double|

1bit = 2진수 1자리 <br>
1byte = 8bit

# 기본형 표현 범위

- n비트로 표현할 수 있는 값의 개수 : 2<sup>n</sup>개
- n비트로 표현할 수 있는 **부호 없는** 정수의 범위 : 0 ~ 2<sup>n</sup>-1
- n비트로 표현할 수 있는 **부호 있는** 정수의 범위 : -2<sup>n-1</sup> ~ 2<sup>n-1</sup>-1

- byte : -2<sup>7</sup> ~ 2<sup>7</sup>-1
- short : -2<sup>15</sup> ~ 2<sup> 15</sup>-1
- char : 0 ~ 2<sup>16</sup>-1
- int : -2<sup>31</sup> ~ 2<sup>31</sup>-1 (약 -20억 ~ 20억)
- long : -2<sup>63</sup> ~ 2<sup>63</sup>-1 (약 -800경 ~ 800경)

# 형식화된 출력 printf()

## println()의 단점 - 출력 형식 지정불가

### 1. 실수의 자리수 조절 불가 - 소수점 n 자리만 출력하려면?

```java
System.out.println(10.0/3);   // 3.3333333.....
```

### 2. 10진수로만 출력 된다. - 8진수, 16진수로 출력하려면?

```java
System.out.println(0x1A);     // 26
```

## printf()로 출력형식 지정 가능

```java
System.out.printf("%.2f", 10.0/3);      //3.33, 소수점 둘째자리까지 출력
System.out.printf("%d", 0x1A);          //26, d는 10진수
System.out.printf("%X", 0x1A);          //1A, X는 16진수
```

# printf()의 지시자
|지시자|설명|
|:---|:---|
|%b|불리언(**b**oolean) 형식으로 출력|
|%d|10진(**d**ecimal) 정수의 형식으로 출력|
|%o|8진(**o**ctal) 정수의 형식으로 출력|
|%x, %X|16진(he**x**a-decimal) 정수의 형식으로 출력|
|%f|부동 소수점(**f**loating-point)의 형식으로 출력|
|%e, %E|지수(**e**xponent) 표현식의 형식으로 출력|
|%c|문자(**c**haracter)로 출력|
|%s|문자열(**s**tring)로 출력|

```java
System.out.printf("age : %d year %d\n", 14, 2017);
// 여러개의 지시자 사용 가능
// 개행문자 \n사용 %n과 같음
System.out.printf("age : %d, age");      //출력 후 줄바꿈을 하지 않는다
System.out.printf("age : %d%n, age");    //출력 후 줄바꿈을 한다
```
- 정수를 10진수, 8진수, 16진수로 출력
```java
System.out.printf("%d", 15);  //15 10진수
System.out.printf("%o", 15);  //17 8진수
System.out.printf("%x", 15);  //f 16진수
System.out.printf("%s", Integer.toBinarySting(15)); // 1111 2진수
```
- 8진수와 16진수에 접두사 붙이기
```java
System.out.printf("%#o", 15);  //017
System.out.printf("%#x", 15);  //0xf
System.out.printf("%#X", 15);  //0xf
```

- 실수 출력을 위한 지시가 %f - 지수형식(%e), 간략한 형식(%g)
```java
float f = 123.4567890f;
System.out.printf("%f", f);  //123.456787    소수점아래 6자리
System.out.printf("%e", f);  //1.234568e+02  지수형식
System.out.printf("%g", 123.456789);    // 123.45      간략한 형식
System.out.printf("%g", 0.00000001);    // 1.00000e-8  간략한 형식
```

```java
System.out.printf("[%5d]%n", 10);       //[   10]
System.out.printf("[%-5d]%n", 10);      //[10   ]  왼쪽 정렬
System.out.printf("[%05d]%n", 10);      //[00010]


System.out.printf("[%s]%n", url);       //[www.codechobo.com]
System.out.printf("[%20s]%n", url);      //[   www.codechobo.com]  
System.out.printf("[%-20s]%n", url);      //[www.codechobo.com   ]  왼쪽 정렬
System.out.printf("[%.8s]%n", url);      //[www.code]  부분출력 8자리만 출력
```

# 화면에서 입력받기

## Scanner란?

- 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스

## Scanner를 사용하려면...

1. import문 추가
```java
import java.util.*;
```

2. Scanner 객체의 생성
```java
Scanner scanner = new Scanner(System.in);
```

3. Scanner 객체를 사용
```java
int num = sanner.nextInt();   // 화면에서 입력받은 정수를 num에 저장

String input = scanner.nextLine();      //화면에서 입력받은 내용을 input에 저장
int num = Integer.parseInt(input);      // 문자열(input)을 숫자(num)로 변환
```

# 정수형의 오버플로우

- 타입이 표현할 수 있는 값의 범위를 넘어서는 것을 **오버플로우(overflow)**라고 한다.

     최대값 + 1 ==> 최소값 <br>
     최소값 - 1 ==> 최대값