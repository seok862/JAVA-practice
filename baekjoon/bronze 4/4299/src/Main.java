import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A==0) {
			System.out.println(-1);
		}else {
			System.out.println((A+B)/2+" "+(A-B)/2);
		}
		
	}
}
