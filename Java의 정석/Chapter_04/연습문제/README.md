## 4-1. 다음의 문장들을 조건식으로 표현하라.

```java
1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식

10< x && x < 20

2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식

!(ch == ' '|| ch == '\t')

3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식

ch == 'x' || ch == 'X'

4. char형 변수 ch가 숫자 ('0'~'9')일 때 true인 조건식

'0' <= ch && ch <='9'

5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식

('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')

6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠덜어지지 않을 때 true인 조건식
year%400 == 0 || year%4 == 0 && year%100 != 0

7. boolean형 변수 powerOn false일 때 true인 조건식
powerOn == flase

8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
str.equals("yes")

```

## 4-2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.

```java
int sum = 0;
for(int i=1;i<=20;i++){
    if(i%2 !=0 || i%3 !=0){
        sum += i
    }
}

```

답 : 73

## 4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.

```java
int sum = 0;
int sum2 = 0;
for(int i=1;i<=10;i++){
    sum += i;
    sum2 += sum;
}
```

답 : 220

## 4-4. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.

```java
int sum = 0;
int s = 1;
int num = 0;
for(int i=1; sum < 100; i++, s=-s) {
    num = i * s;
    sum += num;

    if (sum >= 100){
        break;
    }
}
System.out.println(num);

```

답 : 199

## 4-5. 다음의 for문을 while문으로 변경하시오

```java
public class Exercise4_5 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    } // end of main
} // end of class


while문 변경

public class Exercise4_5 {
    public static void main(String[] args) {
        int i = 0;
        while(i<=10;) {
            int j = 0;
            while(j<=i;){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    } // end of main
} // end of class
```

## 4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오

```java
for(int i=1;i<=6;i++){
    for(int j=1;j<=6;j++){
        if(i+j == 6){
            System.out.println(i+","+j);
        }
    }
}
```

출력 :
1,5
2,4
3,3
4,2
5,1

## 4-7. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 문자열이 "12345"라면 '1+2+3+4+5'의 결과인 15를 출력해야한다. (1)에 알맞은 코드를 넣으시오.

```java
class Exercise4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i=0;i<str.length(); i++){
        /*
         (1) 알맞은 코드를 넣어 완성하시오
        */
        }
        System.out.println("sum="+sum);
    }
}

```

답 :
sum += str.charAt(i)-'0';

## 4-8. Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.

```java
class Exercise4_8 {
    public static void main(String[] args) {
        int value = ( /*  (1)  */ );
        System.out.println("value:"+value);
    }
}
```

답: (int)(Math.random()*6)+1

## 4-9. int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.(1)에 알맞은 코드를 넣으시오

```java
class Exercise4_9 {
    public static void main(String[] args){
        int num = 12345;
        int sum = 0;

        /*
            (1) 알맞은 코드를 넣어 완성하시오.
        */

        System.out.println("sum="+sum);
    }
}



답 : for(int i=0;i<5;i++){
    sum += num%10;
    num /= 10;
}

```

## 4-10. 다음은 숫자맞히기 게임을 작성한 것이다. 1과 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞히면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞히면 게임이 끝나고 몇 번 만에 숫자를 맞혔는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.

```java

class Exercise4_10
{
    public static void main(String[] args)
    {
        // 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = /*  (1)  */;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        // Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
        count++;
        System.out.print("1 100 :"); 과 사이의 값을 입력하세요
        input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다

        /*
            (2) 알맞은 코드를 넣어 완성하시오
        */
        

        } while(true); // 무한반복문
    } // end of main
} // end of class HighLow



답 : 

class Exercise4_10
{
    public static void main(String[] args)
    {
        // 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        // Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
        count++;
        System.out.print("1과 100사이의 값을 입력하세요 :"); 
        input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다


        if(answer > input) {
            System.out.println("더 큰 수를 입력하세요."); 
        } else if(answer < input) {
            System.out.println("더 작은 수를 입력하세요."); 
        } else {
            System.out.println("맞췄습니다."); 
            System.out.println("시도횟수는"+count+"번입니다."); 
            break; // do-while문을 벗어난다
        }

        } while(true); // 무한반복문
    } // end of main
} // end of class HighLow
```