import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		int K = sc.nextInt();
		
		for(int i=0; i<K; i++) {
			int n = sc.nextInt();
			
			if(n == 0) {
				stack.pop();
			} else {
				stack.add(n);
			}
		}
		
		int sum = 0;
		int num = stack.size();
		
		for(int i=0; i<num; i++) {
			sum += stack.pop();
			
		}
		
		System.out.println(sum);
	}
}
