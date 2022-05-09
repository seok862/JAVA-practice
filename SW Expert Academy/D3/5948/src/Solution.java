import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[] arr = new int[7];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			int[] arr2 = new int[35];
			int index = 0;
			
			for(int i=0; i<arr.length-2; i++) {
				for(int j=i+1; j<arr.length-1; j++) {
					for(int k=j+1; k<arr.length; k++) {
						arr2[index] = (arr[i]+arr[j]+arr[k]);
						index++;
					}
				}
			}
			
			Arrays.sort(arr2);
			
			int n = 0;
			int cnt = 0;
			
			for(int i=34; i>=0; i--) {
				if(arr2[i] != n) {
					n = arr2[i];
					cnt++;
				}
				
				if(cnt == 5) {
					System.out.println("#"+t+" "+n);
					break;
				}
			}
		}
	}
}
