import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int a = sc.nextInt();
			int[] arr =  new int[1000];
			
			int max = 0;
			int maxIndex = 0;
			for(int i=0; i<1000; i++) {
				int N = sc.nextInt();
				arr[N]++;
				
				if(Math.max(arr[N], max) == arr[N]) {
					max = arr[N];
					maxIndex = N;
				}
			}
			System.out.println("#"+t+" "+maxIndex);
			}
	}
}
