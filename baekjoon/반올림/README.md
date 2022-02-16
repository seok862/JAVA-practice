# 반올림해서 소수점 n번째 자리까지 출력

## String.format()

- 가장 간단한 방법
- format(format, args)은 인자로 전달된 format에 맞게 문자열을 만들어 리턴해준다.
- format을 "%.6f"로 전달하면 소수점 7번째 자리를 반올림하여 소수점 6번째 자리까지만 표현하라는 의미이다.

```java
double pi = 3.14159265359;

System.out.println(String.format("%.6f", pi));


// 결과값 : 3.141593
```

## Math.round()

- round(float a)는 인자로 전달된 float을 가장 가까운 int로 반올림하여 리턴한다.

```java
System.out.println(Math.round(3.1));
System.out.println(Math.round(2.9));
System.out.println(Math.round(2.5));
System.out.println(Math.round(2.49));

/* 결과값
3
3
3
2
*/

// 소수에 100을 곱한값을 round()로 반올림하고, 다시 100으로 나누면 소수점 2번째 자리까지 출력된다.
double pi = 3.14159265359;

System.out.println(Math.round(pi * 100));

System.out.println(Math.round(pi * 100) / 100.0);

/* 결과값
314
3.14
*/

```

