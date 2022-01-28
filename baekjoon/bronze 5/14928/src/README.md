# BigInteger로 계산할 경우

```java
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger();
		BigInteger a = new BigInteger("20000303");
		System.out.print(N.subtract(a));
	}
}
```
시간 초과!

# BigInteger값을 int로 형변환 한 다음 계산

```java
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger();
		int a = N.intValue();
		System.out.print(a%20000303);
	}
}
```
int의 최대 길이를 넘어선 값을 입력할 경우 오버플로우가 발생하여 올바르지 않은 값이 출력.

# String으로 입력

```java
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		long a = 0;
		for (int i=0; i<N.length(); i++) {
			a = (a*10+(N.charAt(i)-'0'))%20000303;
		}
		System.out.println(a);
	}
}
```

성공! <br>
<br>
큰 수를 입력해야한다는 생각에 BigInteger먼저 떠오름.<br>
String을 사용하면 쉽게 계산이 가능 하지만 BigInteger를 사용해야 한다는 생각때문에 쉽게 떠오르지 않음.<br>
