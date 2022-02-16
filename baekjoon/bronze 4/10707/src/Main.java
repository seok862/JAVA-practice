import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int P = sc.nextInt();
		
		int a = A*P;
		int b = 0;
		if (P<=C) {
			b = B;
		} else {
			b = B+D*(P-C);
		}
		
		if(a>=b) {
			System.out.println(b);
		} 
		if(a<b) {
			System.out.println(a);
		}
	}
}
