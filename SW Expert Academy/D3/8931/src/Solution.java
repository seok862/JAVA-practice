import java.util.Scanner;
import java.util.Stack;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int K = sc.nextInt();
			Stack<Integer> stack = new Stack<>();
			int sum = 0;
			
			for(int i=0; i<K; i++) {
				int num = sc.nextInt();
				
				if(num == 0) {
					stack.pop();
				} else {
					stack.push(num);
				}
			}
			
			while(!stack.isEmpty()) {
				sum += stack.pop();
			}
			
			System.out.println("#"+t+" "+sum);
		}
	}
}
