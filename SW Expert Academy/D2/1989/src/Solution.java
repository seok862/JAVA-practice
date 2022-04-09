import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			if(str.length()/2 == 0) {
					System.out.println("#"+t+" 0");
			} else {
				for(int j=0; j<str.length()/2; j++) {
					if( str.charAt(j) == str.charAt(str.length()-(j+1))){
						System.out.println("#"+t+" 1");
						break;
					}
					else {
						System.out.println("#"+t+" 0");
						break;
					}		
				}
				
			
			}
			
		}
	}
}
