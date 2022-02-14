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
