import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			int[] arr = new int[26];
			for(int i=0; i<N; i++) {
				String st = sc.next();
				arr[st.charAt(0)-65]++;
			}
			
			int num = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == 0) {
					break;
				} else {
					num++;
				}
			}
			
			System.out.println("#"+t+" "+num);
		}
	}
}
