import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			String str = Integer.toString(i);
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {
				char num = str.charAt(j);
				if(num == '3' || num == '6' || num == '9') {
					count++;	
				}			
			}	
			if(count == 0) {
				System.out.print(i+" ");
			} else if(count == 1) {
				System.out.print("- ");
			} else if(count == 2) {
				System.out.print("-- ");
			} else if(count == 3) {
				System.out.print("--- ");
			}
		}
	}
}
