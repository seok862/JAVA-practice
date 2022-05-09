import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] arr = new int[N+1];
			
			for(int i=0; i<K; i++) {
				int num = sc.nextInt();
				arr[num]++;
			}
			String ans="";
			
			for(int i=1; i<arr.length; i++) {
				if(arr[i] == 0) ans += i+" ";
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}
