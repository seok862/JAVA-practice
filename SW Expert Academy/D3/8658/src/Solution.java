import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[] arr = new int[10];
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i=0; i<10; i++) {
				String str = sc.next();
				
				for(int j=0; j<str.length(); j++) {
					arr[i] += str.charAt(j)-'0';
				}
				if(max < arr[i]) {
					max = arr[i];
				}
				
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			System.out.println("#"+t+" "+max+" "+min);
		}
	}
}
