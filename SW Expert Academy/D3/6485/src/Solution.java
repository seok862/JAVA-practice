import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[50001];
			
			for(int i=0; i<N; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				for(int j=A; j<=B; j++) {
					arr[j]++;
				}
			}
			
			int P = sc.nextInt();
			String ans ="";
			
			for(int i=0; i<P; i++) {
				int C = sc.nextInt();
				ans += Integer.toString(arr[C])+" ";
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}
