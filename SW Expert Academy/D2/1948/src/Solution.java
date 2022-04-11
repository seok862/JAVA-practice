import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++){
			int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			int a = sc.nextInt()-1;
			int b = sc.nextInt();
			int c = sc.nextInt()-1;
			int d = sc.nextInt();
			
			int sum = 0;
			int sum2 = 0;
			
			for(int i=0; i<a; i++) {
				sum += arr[i];
			}
			sum = sum+b;
			
			for(int i=0; i<c; i++) {
				sum2 += arr[i];
			}
			sum2 = sum2+d;
			
			System.out.println("#"+t+" "+(sum2-sum+1));
		}
	}
}
