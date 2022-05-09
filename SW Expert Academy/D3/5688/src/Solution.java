import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			long N = sc.nextLong();
			long num = 1;
			boolean check = false;
			while(num*num*num <= N) {
				if(num*num*num == N) {
					check = true;
					break;
				}
				else num++;
			}
			
			if(check) {
				System.out.println("#"+t+" "+num);
			} else {
				System.out.println("#"+t+" -1");
			}
		}
	}
}
