import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		long a = Integer.parseInt(A, 8);
		System.out.println(Long.toBinaryString(a));

	}
}
