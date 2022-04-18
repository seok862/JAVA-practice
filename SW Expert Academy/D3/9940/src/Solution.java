import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			boolean[] arr2 = new boolean[N];
			
			boolean sign = true;
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				
				if(arr[i] > N) {
					sign = false;
					break;
				} else {
					arr2[arr[i]-1] = true;
				}
			}
			
			for(int i=0; i<N; i++) {
				if(arr2[i] == true) {
					sign = true;
				} else {
					sign = false;
					break;
				}
			}		
			if(sign) {
				System.out.println("#"+t+" Yes");
			} else {
				System.out.println("#"+t+" No");
			}
		}
	}
}
