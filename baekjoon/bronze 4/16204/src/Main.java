import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		if(M<K) {
			System.out.println(M+N-K);
		} else {
			System.out.println(K+N-M);
		}
	}
}
