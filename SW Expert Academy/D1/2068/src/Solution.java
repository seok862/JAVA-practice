import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int max = 0;
			int[] arr = new int[10];
			for(int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
				
				if(max <= arr[j]) {
					max = arr[j];
				}
			}
			System.out.println("#"+(i+1)+" "+max);
			
			
		}
	}
}
