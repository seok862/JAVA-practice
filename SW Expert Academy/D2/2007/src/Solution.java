import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			String str = sc.next();
			for(int j=1; j<=10; j++) {
				String str1 = str.substring(0, j);
				String str2 = str.substring(j, j+j);
				
				if(str1.equals(str2)) {
					System.out.println("#"+i+" "+j);
					break;
				}
			}
			
		}
	}
}
