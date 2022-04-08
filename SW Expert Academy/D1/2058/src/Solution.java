import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		
		System.out.println(N/1000 + (N%1000)/100 + (N%100)/10 + N%10);
	}
}
