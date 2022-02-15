# java.math 패키지

## BigInteger 클래스

- 매우 큰 정수를 사용할때 쓰는 클래스

## BigInteger 선언

```java
//문자열
BigInteger bigNumber = new BigInteger("10000");

//16진법
BigInteger bigNumber = new BigInteger("64",16);

//2진법
BigInteger bigNumber = new BigInteger("64",2);

//정수로 생성
BigInteger bigNumber = BigInteger.valueof(100);
```

## BigInteger 계산

```java
BigInteger bigNumber1 = new BigInteger("100000");
BigInteger bigNumber2 = new BigInteger("10000");
		
System.out.println("덧셈(+) :" +bigNumber1.add(bigNumber2));
System.out.println("뺄셈(-) :" +bigNumber1.subtract(bigNumber2));
System.out.println("곱셈(*) :" +bigNumber1.multiply(bigNumber2));
System.out.println("나눗셈(/) :" +bigNumber1.divide(bigNumber2));
System.out.println("나머지(%) :" +bigNumber1.remainder(bigNumber2));
```

## BigInteger을 2진법으로 출력
```java
BigInteger bigNumber1 = new BigInteger("123456");
System.out.println(bigNumber1.toString(2));
```