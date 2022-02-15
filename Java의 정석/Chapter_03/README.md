## 연산자

- 연산을 수행하는 기호 (+,-,*,/)

## 피연산자

- 연산자의 연산 수행 대상

**모든 연산자는 연산결과를 반환한다.**

# 연산자의 종류

- 산술 연산자
> +, -, *, /, %

- 비교 연산자
> \>, <, >=, <=, ==, !=

- 논리 연산자
> &&(and), ||(or), !(not)

- 대입 연산자
> =

# 연산자의 우선 순위

- 하나의 식(expression)에 연산자가 둘 이상 있을 때, 어떤 연산을 먼저 수행할지를 자동 결정하는 것

1. 산술> 비교> 논리> 대입.

2. 단항(1) > 이항(2) > 삼항(3).

## 연산자의 결합 규칙
- 우선순위가 같은 연산자가 있을 때, 어떤 것을 먼저?

> 대입과 단항 연산자를 제외하면, 모두<br>
> 왼쪽 -> 오른쪽

# 증감 연산자

    증가 연산자(++) 피연산자의 값을 1 증가시킨다.
    감소 연산자(--) 피연산자의 값을 1 감소시킨다. 

    전위형 : 값이 참조되기 전에 증가시킨다. j = ++i;
    후위형 : 값이 참조된 후에 증가시킨다. j = i++;

# 부호 연산자

- '-'는 피연산자의 부호를 반대로 변경
- '+'는 아무런 일도 하지 않는다. (실제 사용 X)

# 형변환 연산자

## 형변환이란?

- 변수 또는 상수의 타입을 다른 타입으로 변환하는 것

 ```java
// (타입) 피연산자
double d = 85.4;
int score = (int)d;
int score = (int)85.4;
int score = 85;
```

## 자동 형변환

```java
float f = 1234;         //OK (int타입의 값을 float타입의 변수에 저장)

float f = (float)1234;  //위 처럼 입력할 경우 컴파일러가 자동으로 (float)를 붙여서 형변환해줌

int i = 3.14f           //에러. 큰 값을 작은 값에 저장할 수 없음

int i = (int)3.14f      //OK. 컴파일러가 자동으로 형변환 시키지 못해 직접 입력해주어야함

int i = 100;
byte b = i;             //에러. int타입을 byte의 타입에 대입
byte b = (byte)i;       //OK. byte타입으로 형변환하여 대입

byte b = 1000;          //에러. byte 타입의 범위(-128 ~ 127)를 벗어난 값의 대입
byte b = (byte)1000;    //OK. 그러나 값 손실이 발생해서 변수 b에는 -24가 저장됨
```

# 사칙 연산자

    +(덧셈) -(뺄셈) *(곱셈) /(나눗셈)

```java
10 / 4 = 2 
// (int) / (int) = (int) 같은 타입 끼리만 계산 가능
// 소수점 이하는 버려진다.

 10/4.0f = 10.0f/ 4.0f = 2.5f 
 // (int) / (float) = (float) / (float) = float 
```

# 산술 변환
연산 전에 피연산자의 타입을 일치시키는 것

- 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)

> long + int -> long + long -> long <br>
> float + int -> float + float -> float <br>
> double + float -> double + double -> double

- 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다 (byte, char, short)

> byte + short -> int + int -> int <br>
> char + short -> int + int -> int


# 반올림 - Math.rount()
- 실수를 소수점 첫 째자리에서 반올림한 정수를 반환

```java
long result = Math.round(4.52);     //result에 5가 저장된다.

// 원하는 자리에서 반올림 하기
Math.round(pi * 1000) / 1000.0
-> Math.round(3.141592 * 1000) / 1000.0
-> Math.round(3142.592) / 1000.0
-> 3142 / 1000.0
-> 3.142
```

# 나머지 연산자 %
- 오른쪽 피연산자로 나누고 남은 나머지를 반환
- 나누는 피연산자는 0이 아닌 정수만 허용(부호는 무시됨)

```java
10 % 8        // 10을 8로 나눈 나머지 2가 출력된다.
10 % -8       // 위와 같은 결과를 얻는다.
```

# 비교 연산자 > < >= <= == !=
- 두 피연산자를 비교해서 true(참) 또는 false(거짓)을 반환

|비교 연산자|연산결과|
|:---:|:---:|
|>|좌변 값이 크면, true 아니면 false|
|<|좌변 값이 작으면, true 아니면 false|
|>=|좌변 값이 크거나 같으면, true 아니면 false|
|<=|좌변 값이 작거나 같으면, true 아니면 false|
|==|두 값이 같으면, true 아니면 false|
|!=|두 값이 다르면, true 아니면 false|

```java
'A' > 'B'   ->   65 > 66   ->   false
```

## 문자열의 비교
- 문자열 비교에는 == 대신 equals()를 사용해야 한다. (==를 사용할 경우 정확하지 않을수 있음)

```java
String str1 = "abc";
String str2 = "abc";
System.out.println(str1==str2);         //true
System.out.println(str1.equals(str2));  //true

String str1 = new String("abc");
String str2 = new String("abc");
System.out.println(str1==str2);         //false
System.out.println(str1.equals(str2));  //true
```

# 논리 연산자 && ||
- 조건식을 연결할 때 사용하는 연산자

|x|y|x &#124;&#124; y(or)|x && y(and)|
|:---:|:---:|:---:|:---:|
|true|true|true|true|
|true|false|true|false|
|false|true|true|false|
|false|false|false|false|

**자주 쓰는 조건식**
```java
// x는 10보다 크고, 20보다 작다.
x > 10 && x < 20
// 아래처럼 쓸 수 있음
10 < x && x < 20


// i는 2의 배수 또는 3의 배수이다.
i%2 == 0 || i%3 ==0
// i의 값이 8 일 때, 위의 식 연산
-> 8%2 == 0 || 8%3 == 0
-> 0 == 0 || 2 == 0
-> true || false
-> true


// i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다.
( i%2 == 0 || i%3 == 0) && i%6 != 0


// 문자 ch는 숫자('0'~'9')이다.
'0' <= ch && ch <= '9'


// 문자 ch는 대문자 또는 소문자이다.
('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
```
**&&가 ||보다 우선순위가 높음**

# 논리 부정 연산자 !
- true를 false로, false는 true로 바꾼다.

# 조건 연산자 ? :
- 조건식의 결과에 따라 연산결과를 달리한다.

```java
result = (x > y) ? x : y ;
// (x > y)가 참(true)일 경우 x값 반환
// (x > y)가 거짓(false)일 경우 y값 반환

    result = (x > y) ? x : y ;
->  result = (5 > 3) ? 5 : 3 ;
->  result = (true) ? 5 : 3 ;
->  result = 5;


result = (x > y) ? x : y ; // 아래 코드와 같음
if( x > y){
    result = x;
} else{
    result = y;
}
```

# 대입 연산자
- 오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환

```java
    System.out.println(x = 3);      // 변수 x에 3이 저장되고
->  System.out.println(3);          // 연산결과인 3이 출력된다.
```

- 오른쪽 피연산자를 **rvalue** 라고 함
- 왼쪽 피연산자를 **lvalue** 라고 함
- lvalue는 저장공간이어야 한다.

```java
int i = 0;
3 = i + 3;            // 에러. lvalue가 값을 저장할 수 있는 공간이 아니다.<br>
i + 3 = i;            // 에러. lvalue의 연산결과가 리터럴(i+3 -> 0+3 -> 3)
final int Max = 3;    // 변수 앞에 키워드 final을 붙이면 상수가 된다.
MAX = 10;             // 에러. 상수(MAX)에 새로운 값을 저장할 수 없다.
```

# 복합 대입 연산자
- 대입 연산자와 다른 연산자를 하나로 축약

