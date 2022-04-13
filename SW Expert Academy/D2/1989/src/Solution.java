import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			char[] arr = new char[str.length()];
			char[] arr2 = new char[str.length()];
			
			boolean sign = false;
			
			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			
			for(int i=0; i<str.length(); i++) {
				arr2[i] = arr[(str.length()-1)-i];
			}
			
			sign = Arrays.equals(arr, arr2);
			
			if(sign) {
				System.out.println("#"+t+" "+1);
			} else {
				System.out.println("#"+t+" "+0);
			}
		}
	}
}
