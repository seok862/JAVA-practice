import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A<2) {
			System.out.println("Before");
		} else if(A==2) {
			if(B<18) {
				System.out.println("Before");
			} else if(B==18) {
				System.out.println("Special");
			} else {
				System.out.println("After");
			}
		}else {
			System.out.println("After");
		}
	}
}
