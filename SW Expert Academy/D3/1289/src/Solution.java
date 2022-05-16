import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String st = sc.next();
			
			int[] arr = new int[st.length()];
			int[] arr2 = new int[st.length()];
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(st.substring(i, i+1));
				arr2[i] = 0;
			}
			
			
			int cnt = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr2[i] != arr[i]) {
					cnt++;
					
					if(arr2[i] == 0) {
						for(int j=i; j<arr.length; j++) {
							arr2[j] = 1;
						}
					} else {
						for(int j=i; j<arr.length; j++) {
							arr2[j] = 0;
						}
					}
					
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}
