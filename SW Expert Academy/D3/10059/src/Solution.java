import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			
			int[] arr = new int[2];
			
			arr[0] = Integer.parseInt(str.substring(0, 2));
			arr[1] = Integer.parseInt(str.substring(2, 4));
			
			
			if(arr[0] == 00 && arr[1] == 00) {
				System.out.println("#"+t+" NA");
			} else if(arr[0] == 00 && arr[1] <= 12) {
				System.out.println("#"+t+" YYMM");
			} else if(arr[0] == 00 && arr[1] > 12) {
				System.out.println("#"+t+" NA");
			} else if(arr[0] <= 12 && arr[1] == 00) {
				System.out.println("#"+t+" MMYY");
			} else if(arr[0] <= 12 && arr[1] <= 12) {
				System.out.println("#"+t+" AMBIGUOUS");
			} else if(arr[0] <= 12 && arr[1] > 12) {
				System.out.println("#"+t+" MMYY");
			} else if(arr[0] > 12 && arr[1] == 00) {
				System.out.println("#"+t+" NA");
			} else if(arr[0] > 12 && arr[1] <= 12) {
				System.out.println("#"+t+" YYMM");
			} else if(arr[0] > 12 && arr[1] > 12) {
				System.out.println("#"+t+" NA");
			}
		}
	}
}
