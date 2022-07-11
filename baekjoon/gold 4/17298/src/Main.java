import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		int[] ans = new int[N];
		String[] str = bf.readLine().split(" ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);
		
		for(int i=1; i<N; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				ans[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<N; i++) {
			bw.write(ans[i]+" ");
		}
		
		bw.write("\n");
		bw.flush();
	}
}
