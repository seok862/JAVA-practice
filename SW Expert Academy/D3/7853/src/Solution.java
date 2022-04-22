import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			char[] arr = str.toCharArray();
			long num = 1;
						
			for(int i=0; i<arr.length; i++) {
				int sum = 1;
				if(i == 0) {
					if(arr[i] != arr[i+1]) {
						sum++;
					}
				}
				
				else if(i == arr.length-1) {
					if(arr[i] != arr[i-1]) {
						sum++;
					}
				}
				
				else {
					if(arr[i] != arr[i+1]) {
						sum++;
					}
					
					if(arr[i] != arr[i-1]) {
						sum++;
					}
					
					if( sum > 1 && arr[i-1] == arr[i+1]) {
						sum--;
					}
				}				
				num *= sum;
				num %= 1000000007;
			}
			System.out.println("#"+t+" "+num);
		}
	}
}
