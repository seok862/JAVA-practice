import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			if(str.equals("MON")) {
				System.out.println("#"+t+" 6");
			}
			if(str.equals("TUE")) {
				System.out.println("#"+t+" 5");
			}
			if(str.equals("WED")) {
				System.out.println("#"+t+" 4");
			}
			if(str.equals("THU")) {
				System.out.println("#"+t+" 3");
			}
			if(str.equals("FRI")) {
				System.out.println("#"+t+" 2");
			}
			if(str.equals("SAT")) {
				System.out.println("#"+t+" 1");
			}
			if(str.equals("SUN")) {
				System.out.println("#"+t+" 7");
			}
			
		}
	}
}
