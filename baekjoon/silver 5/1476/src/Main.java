import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt()-1;
		int S = sc.nextInt()-1;
		int M = sc.nextInt()-1;
		
		while(true) {
			if(E%28 == S && E%19 == M) {
				System.out.println(E+1);
				break;
			} else E += 15;
		}
	}
}
