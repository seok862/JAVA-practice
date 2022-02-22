# 배열이란?

- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것

# 배열의 선언과 생성

## 배열의 선언 - 배열을 다루기 위한 참조변수의 선언

|선언방법|선언 예|
|:---:|:---:|
|타입[] 변수이름;|int[] score;<br>String[] name;|
|타입 변수이름[];|int score[];<br>String name[];|

```java
타입[] 변수이름;            // 배열을 선언(배열을 다루기 위한 참조변수 선언)
변수이름 = new타입[길이];   // 배열을 생성(실제 저장공간을 생성)

int[] score;               // int타입의 배열을 다루기 위한 참조변수 score선언
score = new int[5];        // int타입의 값 5개를 저장할 수 있는 배열 생성
```

## 배열의 인덱스 - 각 요소에 자동으로 붙는 번호

## 배열의 길이
- 배열이름.length - 배열의 길이(int형 상수)
- 배열은 한번 생성하면 그 길이를 바꿀 수 없다.

## 배열의 초기화
- 배열의 각 요소에 처음으로 값을 저장하는 것

## 배열의 출력

```java
int iArr = {100, 95, 80, 70, 60};
System.out.println(iArr);           //[I@14318bb]와 같은 형식의 문자열이 출력된다.

char[] chArr = {'a', 'b', 'c', 'd'};
System.out.println(chArr);          //abcd가 출력된다.

for(int i=0; i<iArr.length; i++){   //배열의 요소를 순서대로 하나씩 출력
    System.out.println(iArr[i])
}

System.out.println(Arrays.toString(iArr));  // 배열 iArr의 모든 요소를 출력한다. [100, 95, 80, 70, 60]이 출력된다.
```

## 2차원 배열
- 테이블 형태의 데이터를 저장하기 위한 배열
```java
int[][] score = new int[4][3];      // 4행 3열의 2차원 배열 score를 생성

scroe[0][0] = 100;                  // 배열 score의 1행 1열에 100을 저장
System.out.println(score[0][0]);    // 배열 score의 1행 1열의 값을 출력
```

## 2차원 배열의 초기화

```java
int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
int[][] arr = {{1, 2, 3}, {4, 5, 6}};           // new int[][]가 생략됨

int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
};
```

