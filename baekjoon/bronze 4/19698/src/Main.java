import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		
		if(N>(W/L)*(H/L)) {
			System.out.println((W/L)*(H/L));
		} else {
			System.out.println(N);
		}
	}
}
