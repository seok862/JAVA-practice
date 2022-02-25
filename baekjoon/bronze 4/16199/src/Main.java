import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		if(a==d) {
			System.out.println(0);
		} 
		else if(a<d) {
			if(b<e) {
				System.out.println(d-a);
			} 
			else if(b==e) {
				if(c<=f) {
					System.out.println(d-a);
				} else {
					System.out.println(d-a-1);
				}
			}
			else if(b>e) {
				System.out.println(d-a-1);
			}
		}
		
		System.out.println(d-a+1);
		System.out.println(d-a);
	}
}
