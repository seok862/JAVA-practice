# 논리연산자 생각해라

논리연산자를 자써보지 않다보니 생각을 못함.<br>
중복 if문 대신 논리연산자를 쓰면 간단함.
<br>
<br>

# 비교할 갯수가 적을땐 Math클래스 사용해라

배열로 각 자리 비교해서 최대값 구하는것보다 Math.max로 두개씩 비교할 수 있음



# 수정한 코드
```java
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(A == B && A == C && B == C)
		{
			System.out.print(10000+(A*1000));
		}
		else if(A == B || A == C)
		{
			System.out.print(1000+(A*100));
		}
		else if(B == C)
		{
			System.out.print(1000+(B*100));
		}
		else
		{
			System.out.print((Math.max(A, Math.max(B, C))*100));
		}
	}
}

```

## 의문점

- 왜 if문을 여러개 사용하는것이 논리연산자를 사용하는것보다 메모리도 적게쓰고 시간도 적게쓰는것인가.