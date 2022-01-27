# java.math 패키지

## BigInteger 클래스

- 매우 큰 정수를 사용할때 쓰는 클래스

## BigInteger 선언

```java
BigInteger bigNumber = new BigInteger("10000");
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