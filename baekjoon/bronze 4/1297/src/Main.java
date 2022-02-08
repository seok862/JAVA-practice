import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		System.out.print((int)(D*H/Math.sqrt(Math.pow(H,2)+Math.pow(W,2)))+" "+(int)(D*W/Math.sqrt(Math.pow(H,2)+Math.pow(W,2))));
		
	}
}
