import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			sc.nextInt();
			
			String st1 = sc.next();
			String st2 = sc.next();
			
			int cnt = 0;
			int len = st1.length();
			for(int i=0; i<st2.length()-len+1; i++) {
				if(st2.substring(i, i+len).equals(st1)) cnt++;
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}
