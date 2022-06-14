import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<N+1; i++) {
			queue.add(i);
		}
		
		String ans = "<";
	
		while(queue.size() > 1) {
			for(int i=0; i<K-1; i++) {
				queue.add(queue.poll());
			}

			ans += queue.poll()+", ";
			
		}
		
		ans += queue.poll()+">";
		
		System.out.println(ans);
	}
}
