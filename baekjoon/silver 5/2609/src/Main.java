import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(gcd(A,B));
		System.out.println(lcm(A,B));
	}
	
	public static int gcd(int a, int b) {
		while( b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}
