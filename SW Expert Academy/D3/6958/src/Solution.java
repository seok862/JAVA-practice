import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int max = 0;
			int people = 0;
			
			for(int i=0; i<N; i++) {
				int[] arr = new int[M];
				
				
				for(int j=0; j<M; j++) {
					arr[j] = sc.nextInt();					
				}
				int cnt = 0;
				
				for(int j=0; j<M; j++) {
					if(arr[j] == 1) {
						cnt++;
					}
				}
				
				if(max == cnt) {
					people++;
				}
				
				if(max<cnt) {
					max = cnt;
					people = 1;
				}	
			}
			System.out.println("#"+t+" "+people+" "+max);
		}
	}
}
