import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		BigInteger ans = new BigInteger("1");
		
		for(int i=1; i<=N; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		
		String st = ans.toString();
			
		
		for(int i=st.length()-1; i>1; i--) {
			if(st.charAt(i)-'0' == 0) {
				cnt++;
			} else {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}
