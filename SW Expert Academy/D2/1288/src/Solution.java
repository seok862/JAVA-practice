import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			int N = Integer.parseInt(str);
			boolean[] arr = new boolean[10];
			int num = 1;
			int cnt = 0;
			
			while(true) {
				for(int i=0; i<str.length(); i++) {
					int temp = Integer.parseInt(str.substring(i,i+1));
					if(arr[temp]==false) {
						arr[temp] = true;
						cnt++;
					}
				}
				
				if(cnt == 10) break;
				
				else {
					num++;
					str = Integer.toString(num*N);
				}
			}
			System.out.println("#"+t+" "+str);
		}
	}
}
