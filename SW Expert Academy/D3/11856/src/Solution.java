import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			char[] arr = new char[4];
			
			for(int i=0; i<4; i++) {
				arr[i] = str.charAt(i);
			}
			
			int cnt = 0;

			
			for(int i=0; i<4; i++) {
				for(int j=1; j<4-i; j++) {
					if(arr[i] == arr[j+i]) {
						cnt++;
					}
				}
			}
			
			if(cnt == 2) {
				System.out.println("#"+t+" Yes");
			} else {
				System.out.println("#"+t+" No");
			}
		}
	}
}
