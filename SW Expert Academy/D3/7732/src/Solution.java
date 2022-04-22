import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			String[] arr1 = str1.split(":");
			String[] arr2 = str2.split(":");
			
			int hour1 = (Integer.parseInt(arr1[0]))*3600;
			int hour2 = (Integer.parseInt(arr2[0]))*3600;
			
			int minute1 = (Integer.parseInt(arr1[1]))*60;
			int minute2 = (Integer.parseInt(arr2[1]))*60;
			
			int sum1 = hour1+minute1+Integer.parseInt(arr1[2]);
			int sum2 = hour2+minute2+Integer.parseInt(arr2[2]);
			
			int ans = 0;
			if(sum1 > sum2) {
				ans = 86400-(sum1 - sum2);
			} else {
				ans = sum2 - sum1;
			}
			
			int hour = ans/3600;
			ans %= 3600;
			int minute = ans/60;
			ans %= 60;
			
			
			System.out.printf("#"+t+" %02d:%02d:%02d%n", hour, minute, ans);
		}
	}
}
