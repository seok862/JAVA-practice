import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			String[] arr = new String[3];
			for(int i=0; i<3; i++) {
				String str = sc.next();
				str = str.toUpperCase();
				
				arr[i] = str.substring(0,1);				
			}
			System.out.print("#"+t+" ");
			for(int i=0; i<3; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}
}
