import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		String[] num = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
		for(int t=1; t<=T; t++) {
			String a = sc.nextLine();
			String[] b = a.split(" ");
			int number = Integer.parseInt(b[1]);
			
			String st = sc.nextLine();
			
			String[] arr = st.split(" ");
			System.out.println("#"+t);
			
			for(int i=0; i<10; i++) {
				for(int j=0; j<number; j++) {
					if(arr[j].equals(num[i])) {
						System.out.print(arr[j]+" ");
					}
				}
			}
		}
	}
}
