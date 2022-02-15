import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		int b[] = new int[6];
		int c[] = new int[6];
		
		int A[] = new int[3];
		for ( int i = 0; i<6; i++) {
			a[i] = sc.nextInt();
		}
		A[2] = a[5]-a[2];
		A[1] = a[4]-a[1];
		A[0] = a[3]-a[0];
		if(A[2] < 0) {
			A[1] -= 1;
			A[2] += 60;
		}
		if(A[1] < 0){
			A[0] -= 1;
			A[1] += 60;
		}
		
		
		int B[] = new int[3];
		for ( int i = 0; i<6; i++) {
			b[i] = sc.nextInt();
		}
		B[2] = b[5]-b[2];
		B[1] = b[4]-b[1];
		B[0] = b[3]-b[0];
		if(B[2] < 0) {
			B[1] -= 1;
			B[2] += 60;
		}
		if(B[1] < 0){
			B[0] -= 1;
			B[1] += 60;
		}
		
		int C[] = new int[3];
		for ( int i = 0; i<6; i++) {
			c[i] = sc.nextInt();
		}
		C[2] = c[5]-c[2];
		C[1] = c[4]-c[1];
		C[0] = c[3]-c[0];
		if(C[2] < 0) {
			C[1] -= 1;
			C[2] += 60;
		}
		if(C[1] < 0){
			C[0] -= 1;
			C[1] += 60;
		}
		
		System.out.println(A[0]+" "+A[1]+" "+A[2]);
		System.out.println(B[0]+" "+B[1]+" "+B[2]);
		System.out.println(C[0]+" "+C[1]+" "+C[2]);
	}
}
