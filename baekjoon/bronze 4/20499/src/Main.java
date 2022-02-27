import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int K = a.charAt(0)-'0';
		int D = a.charAt(2)-'0';
		int A = a.charAt(4)-'0';
		
		if(K+A<D || D==0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}
