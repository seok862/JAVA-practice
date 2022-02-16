import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		if (T%10 != 0) {
			System.out.println("-1");
		} else {
			System.out.println(T/300 + " " + (T%300)/60 + " " + ((T%300)%60)/10);
		}
	}
}
