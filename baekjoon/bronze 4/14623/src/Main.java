import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String B1 = sc.next();
		String B2 = sc.next();
		
		long a = Long.parseLong(B1, 2);
		long b = Long.parseLong(B2, 2);
		
		String num = Long.toBinaryString(a*b);
		System.out.println(num);
		
	}
}
