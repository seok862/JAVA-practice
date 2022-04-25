import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			
			char[] arr = str.toCharArray();
			boolean[] index = new boolean[10];
			
			int cnt = 0;
			
			for(int i=0; i<arr.length; i++) {
				index[arr[i]-'0'] = true;
			}
			
			
			for(int i=0; i<index.length; i++) {
				if(index[i] == true) cnt++;
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}
