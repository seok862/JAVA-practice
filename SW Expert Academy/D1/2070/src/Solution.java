import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 > num2) {
				System.out.println("#"+(i+1)+" >");
			} else if(num1 < num2) {
				System.out.println("#"+(i+1)+" <");
			} else {
				System.out.println("#"+(i+1)+" =");
			}
		}
	}
}
