import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		for(int i=0; i<N-1; i++) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.peek());
		
	}
}
