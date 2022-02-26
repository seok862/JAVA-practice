import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B1 = sc.nextInt();
		int B2 = sc.nextInt();
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
		int J1 = sc.nextInt();
		int J2 = sc.nextInt();
		
		int B3 = 0;
		if(Math.abs(B1-J1) < Math.abs(B2-J2)) {
			B3 = Math.abs(B2-J2);
		} else {
			B3 = Math.abs(B1-J1);
		}
		
		int D3 = Math.abs(D1-J1)+Math.abs(D2-J2);
		
		if(B3 > D3) {
			System.out.println("daisy");
		} else if (B3 < D3) {
			System.out.println("bessie");
		} else if (B3 == D3){
			System.out.println("tie");
		}
	}
}
