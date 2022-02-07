import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		
		System.out.printf("%d"+" "+"%d"+" "+"%d", c1-a3, c2/a2, c3-a1);
	}
}
