# 첫 제출 코드

```java
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int max = A;
		int min = A;
		int mid = A;

		if (A > B) {
			max = A;
			if(B>C) {
				min = C;
				mid = B;
			}
			if(B<C) {
				if(A>C) {
					min = B;
					mid = C;
				}
				if(A<C) {
					max = C;
					mid = A;
					min = B;
				}
			}
		}
		if (A < B) {
			max = B;
			if (A>C) {
				mid = A;
				min = C;
			}
			if (A<C) {
				if(C<B) {
					mid = C;
					min = A;
				}
				if(C>B) {
					max = C;
					mid = B;
					min = A;
				}
			}
		}
		System.out.println(min+" "+mid+" "+max);
	}
}

```

단순하게 생각하여 반복문 여러번 사용 <br>
정답이긴 하나 너무 무지성으로 풀었다고 생각함.

# java.util.Arrays 클래스

배열을 다루기 위한 다양한 메소드가 포함되어 있다.

## sort() 메소드

전달받은 배열의 모든 요소를 오름차순으로 정렬한다.
<br>
sort() 메소드는 매개변수로 정렬할 배열을 전달받으며, 따라서 이 메소드는 전달받은 원본 배열의 순서를 변경하게 된다.

```java
Arrays.sort(arr);
```

# Arrays 클래스를 사용한 수정 코드

```java
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}
}

```
