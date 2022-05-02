import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		
		int sum = 0;
		int cnt = 0;
	
		while(X.length() != 1) {
			
			for(int i=0; i<X.length(); i++) {
				sum += Integer.parseInt(X.substring(i, i+1));
			}
			
			X = Integer.toString(sum);
			cnt++;
			sum = 0;
		}
		
		String ans = "NO";
		
		if(Integer.parseInt(X)%3 == 0) {
			ans = "YES";
		}
		
		System.out.println(cnt);
		System.out.println(ans);
	}
}
