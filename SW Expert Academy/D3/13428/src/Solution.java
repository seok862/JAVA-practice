import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String str = sc.next();
			int[] arr = new int[str.length()];
			int[] arr1 = new int[str.length()];
			int[] arr2 = new int[str.length()];
			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i)-'0';
				arr1[i] = str.charAt(i)-'0';
				arr2[i] = str.charAt(i)-'0';
			}
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int maxIndex = 0;
			int minIndex = 0;
			
			for(int i=0; i<str.length(); i++) {
				if(arr[i]<min) {
					
					min = arr[i];
					minIndex = i;
				}
			}
			
			System.out.print("#"+t+" ");
			int temp = arr2[0];
			arr2[0] = min;
			min = temp;
			arr2[minIndex] = min;
			if(arr2[0] == 0) {
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]);
				}
			} else {
				for(int i=0; i<arr2.length; i++) {
					System.out.print(arr2[i]);
				}
			}
			
			
			System.out.print(" ");
			
			for(int i=0; i<str.length(); i++) {
				if(arr[i]>max) {
					
					max = arr[i];
					maxIndex = i;
				}
			}
			
			temp = arr1[0];
			arr1[0] = max;
			max = temp;
			arr1[maxIndex] = max;
			
			for(int i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]);
			}
			System.out.println();
		}
	}
}
