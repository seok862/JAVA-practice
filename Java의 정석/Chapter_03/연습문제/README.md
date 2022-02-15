## 3-1. 다음 중 형변환을 생략할 수 있는것은? (모두 고르시오)

```java
byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;

// 범위가 작은것을 큰것으로 바꿀때 생략 가능
1. b = (byte)i;                 // int(4byte)를 byte(1byte)로 바꾸기 때문에 형변환 필요
2. ch = (char)b;                // byte(1byte)를 char(2byte)로 바꾸지만 범위가 다르기 때문에 형변환 필요
3. short s = (short)ch;         // char(2byte)를 short(2byte)로 바꾸지만 범위가 다르기 때문에 형변환 필요
4. float f = (float)l;          // float(4byte)의 범위가 long(8byte)의 범위보다 커서 생략 가능
5. i = (int)ch;                 // char(2byte)를 int(4byte)로 바꾸기 때문에 생략 가능

```

답 : 4, 5


## 3-2. 다음 연산의 결과를 적으시오.

```java
class Exercise3_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A' 65 의 문자코드는

    
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);                  //x = 3
        System.out.println(x+=2);
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}

```

답 : 
true <br>
13 <br>
5 <br>
false <br>
2 <br>
5 <br>
66 <br> 
B <br>
B <br>
C


## 3-3. 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. (1)에 알맞은 코드를 넣으시오.

```java
class Exercise3_3 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println( /* (1) */);
    }
}

```

답 : (num/100)*100


## 3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.(1)에 알맞은 코드를 넣으시오.

```java
class Exercise3_4 {
    public static void main(String[] args) {
        int numOfApples = 123;                  // 사과의 개수
        int sizeOfBucket = 10;                  // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
        int numOfBucket = ( /* (1) */);
        System.out.println(" :"+numOfBucket);   //필요한 바구니의 수
    }
}

```

답 : numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0 )

## 3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.

```java
class Exercise3_5 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println( /* (1) */ );
    }
}

```

답 : num > 0 ? :양수" : num < 0 ? "음수" : 0

## 3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =5/9 × (F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단 변환 결과값은 소수점 셋째자리에서 반올림해야한다. (Math.round()를 사용하지 않고 처리할 것) 

```java
class Exercise3_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ( /* (1) */);
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}

```

답 : (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f <br>
