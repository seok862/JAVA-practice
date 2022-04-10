import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int[] arr = new int[4];
			int hour = 0;
			int minu = 0;
			for(int i=0; i<4; i++) {
				arr[i] = sc.nextInt();
			}
			if(arr[0]+arr[2]>12) {
				hour = (arr[0]+arr[2])-12;
			} else {
				hour = arr[0]+arr[2];
			}
			
			if(arr[1]+arr[3]>59) {
				minu = (arr[1]+arr[3])-60;
				hour ++;
			} else {
				minu = arr[1]+arr[3];
			}
			
			System.out.println("#"+t+" "+hour+" "+minu);
		}
	}
}
