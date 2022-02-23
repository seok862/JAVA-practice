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

## String클래스
- String클래스는 char[]와 메서드(기능)을 결함한 것
- String클래스는 내용을 변경할 수 없다. 

## String클래스의 주요 메서드

|메서드|설명|
|:---:|:---:|
|char charAt(int index)|문자열에서 해당 위치(index)에 있는 문자를 반환한다.|
|int length()|문자열의 길이를 반환한다.|
|String substring(int form, int to)|문자열에서 해당 범위(from~to)의 문자열을 반환한다.(to는 포함 안됨)|
|boolean equals(Object obj)|문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false|
|char[] toCharArray()|문자열을 문자배열(char[])로 변환해서 반환한다.|

```java
String str = "ABCDE";
char ch = charAt(3);    // 문자열 str의 4번째 문자 'D'를 ch에 저장.

String str = "012345";
String tmp = str.substring(1,4);    // str에서 index범위 1~4의 문자들을 반환
String tmp1 = str.substring(1);     // str.substring(1, str.length())와 같음, str.length()는 6
System.out.println(tmp);    // "123"이 출력된다.
System.out,println(tmp1);   // "1234"출력
```

## Arrays로 배열 다루기
- 배열의 비교와 출력 - equals(), toString()

```java
int[] arr = {0,1,2,3,4};
in[][] arr2D = {{11,12}, {21,22}};

System.out.println(Arrays.toString(arr));       // [0, 1, 2, 3, 4]
System.out.println(Arrays.deepToString(arr2D)); // [[11, 12], [21, 22]]

String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

System.out.println(Arrays.equals(str2D, str2D2));       //flase
System.out.println(Arrays.deepEquals(str2D, str2D2));   //true

```
- 배열의 복사 - copyOf(), copyOfRange()

```java
int[] arr = {0,1,2,3,4};
int[] arr2 = Arrays.copyOf(arr, arr.length);    // arr2 = [0,1,2,3,4]
int[] arr3 = Arrays.copyOf(arr, 3);    // arr3 = [0,1,2]
int[] arr4 = Arrays.copyOf(arr, 7);    // arr2 = [0,1,2,3,4,0,0]
int[] arr5 = Arrays.copyOfRange(arr, 2, 4);    // arr2 = [2,3] 4는 불포함
int[] arr6 = Arrays.copyOfRange(arr, 0, 7);    // arr2 = [0,1,2,3,4,0,0]
```

- 배열의 정렬 - sort()

```java
int[] arr = { 3, 2, 0, 1, 4};
Arrays.sort(arr);       // 배열 arr을 정렬한다.
System.out.println(Arrays.toString(arr));   //[0, 1, 2, 3, 4]

```