import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num = 5;
		
		for(int i=2; i<=N; i++) {
			num = (num+(i+1)*2+(i-1)) % 45678;
		}	
		
		System.out.println(num);
	}
}
