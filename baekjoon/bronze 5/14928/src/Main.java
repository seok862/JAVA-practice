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
