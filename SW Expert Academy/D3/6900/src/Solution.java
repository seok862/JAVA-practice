import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[] arr = new int[7];
			
			int[] sum = new int[35];
			
			for(int i=0; i<7; i++) {
				arr[i] = sc.nextInt();
			}
			int num = 0;
			for(int i=0; i<5; i++) {
				for(int j=i+1; j<6; j++) {
					for(int k=j+1; k<7; k++) {
						sum[num] = arr[i]+arr[j]+arr[k];
						num++;
					}
				}
			}
			Arrays.sort(sum);
			
			for(int i=0; i<34; i++) {
				if(sum[i]== sum[i+1]) sum[i] = 0;
			}
			
			Arrays.sort(sum);
			
			int ans = 0;
			for(int i=0; i<35; i++) {
				int cnt = 0;
				for(int j=0; j<35; j++) {
					if(sum[i] < sum[j]) cnt++;
				}
				
				if(cnt==4) ans = sum[i];
			}
			
		
			System.out.println("#"+t+" "+ans);
		}
	}
}
