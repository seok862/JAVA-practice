import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ax,bx,ay,by;

		if(a%4 == 0) {
			ax = a/4;
			ay = 4;
		} else {
			ax = a/4 + 1;
			ay = a%4;
		}
		
		if(b%4 == 0) {
			bx = b/4;
			by = 4;
		} else {
			bx = b/4 + 1;
			by = b%4;
		}
		
		int result = 0;
		if (ax > bx) {
			result += ax-bx;
		} else {
			result += bx-ax;
		}
		
		
		if (ay > by) {
			result += ay-by;
		} else {
			result += by-ay;
		}
		System.out.println(result);
	}
}

