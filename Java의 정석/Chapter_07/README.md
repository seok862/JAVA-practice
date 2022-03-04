# 상속(Inheritance)

- 기존의 클래스로 새로운 클래스를 작성하는 것. (코드의 재사용)
- 두 클래스를 부모와 자식으로 관계를 맺어주는 것.

```java
class 자식클래스 extends 부모클래스 {
    // ...
}


class Parent{}
class Child extends Parent {
    // ...
}
```

- 자손은 조상의 모든 멤버를 상속받는다 (생성자, 초기화블럭 제외)
- 자손의 멤버 개수는 조상보다 적을 수 없다. (같거나 많다.)
- 자손의 변경은 조상에 영향을 미치지 않는다.

# 포함 관계

## 포함이란?
- 클래스의 멤버로 참조변수를 선언하는 것
- 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.

# 클래스 간의 관계 결정하기

    상속관계    `~은~이다.(is-a)'
    포함관계    `~은~을 가지고 있다.(has-a)`

# 단일 상속
- Java는 단일 상속만을 허용한다

```java
class TvDVD extends Tv, DVD{    // 에러. 조상은 하나만 허용된다.
    // ...
}
```

- 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다. 

# Object클래스 - 모든 클래스의 조상
- 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.

```java
class Tv{
    // ...
}

class SmartTv extends Tv{
    // ...
}


// Tv클래스의 부모클래스가 없어서 Object를 컴파일러가 자동으로 추가함
class Tv extends Object {
    //...
}
```
- 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.<br>
toString(), equals(Object obj), hashCode(),...

# 오버라이딩(Overriding)
- 상속받은 조상의 메서드를 자신에 맞게 변경하는 것

```java
class Point {
    int x;
    int y;

    String getLocation(){
        return "x :"  + x + ", y :" + y;
    }
}

class Point #d extends Point{
    int z;

    String getLocation(){   // 오버라이딩
        return "x :"  + x + ", y :" + y + ", z :" + z;
    }
}
```

## 오버라이딩의 조건
1. 선언부가 조상클래스의 메서드와 일치해야 한다.
2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.

## 오버로딩 vs 오버라이딩

    오버로딩(overloading)   기존에 없는 새로운 메서드를 정의하는 것(new)
    오버라이딩(overriding)  상속받은 메서드의 내용을 변경하는 것(change, modify)

# 참조변수 super
- 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재
- 조상의 멤버를 자신의 멤버와 구별할 때 사용

# super() - 조상의 생성자
- 조상의 생성자를 호출할 때 사용
- 조상의 멤버는 조상의 생성자를 호출해서 초기화
- 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.