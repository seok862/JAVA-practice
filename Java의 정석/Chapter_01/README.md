# 자바(Java)란?

- 프로그래밍 언어(Programing language)
- 컴퓨터 프로그램(애플리케이션)을 만드는데 사용
- 실행환경(JRE)+개발도구(JDK)+라이브러리(API)
- 쉽고 빠르게 애플리케이션 개발 가능
<br><br>

# 자바의 특징

- 객체지향 언어
- 자동 메모리 관리
- 멀티 쓰레드를 지원
- 풍부한 라이브러리로 쉽게 개발 가능
- 운영체제에 독립적
<br><br>

# 자바 가상 머신(JVM)

- 자바 프로그램이 실행되는 가상 컴퓨터 : 운영체제에 독립적으로 실행할 수 있게 해줌
- 한번 작성하면, 어디서든 실행
<br><br>

# Java API란?

- Java로 프로그램을 만드는데 필요한 주요 기능을 미리 만들어서 제공
<br><br>

# 클래스

- 자바 프로그램의 단위. 자바 프로그램은 클래스들로 구성
```java
 class 이름 { // <- 클래스의 시작

 } // <- 클래스의 끝
```
<br>

# main메서드

- 자바 프로그램의 시작점. 이 메서드 없이 실행 불가
```java
class 이름{
    public static void main(String[] args){ // <- main메서드의 시작

    } // <- main메서드의 끝
}
```
<br>

# Build란?

소스파일로부터 프로그램을 만들어 내는 전 과정
<br><br>

## Project > Build All

- workspace의 모든 프로젝트를 빌드

## Project > Build Project

- 현재 프로젝트를 빌드

## Project > Clean

- 이전 빌드의 정보를 모두 삭제

## Project > Automatically

- 소스 파일을 변경 후, 저장할 때 마다 자동 컴파일
<br><br>

# Eclipse 단축키

- 단축키 전체 목록 : ctrl + shift + L <br>
- 글자 크기 조절 : ctrl + +,- <br>
- 한 줄 삭제 : ctrl + D <br>
- 행 단위 복사 : ctrl + alt + down <br>
- 멀티 컬럼 편집 : alt + shift + A <br>
- 행단위 이동 : alt + up, down <br>
- 자동 들여쓰기 : ctrl + i 
- 주석처리(한 줄) : ctrl + /
- 여러줄 주석 : /* */
- 자동 완성 : ctrl + space


# 화면에 글자 출력하기

- print() : 출력 후 줄바꿈을 안함
- println() : 출력 후 줄바꿈을 함