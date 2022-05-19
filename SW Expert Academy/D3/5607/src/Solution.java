import java.util.Scanner;
import java.math.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int R = sc.nextInt();
			
			BigInteger num1 = new BigInteger("1");
			BigInteger num2 = new BigInteger("1");
			BigInteger num3 = new BigInteger("1");
			
			for(int i=1; i<=N; i++) {
				num1 = num1.multiply(BigInteger.valueOf(i));
			}

			for(int i=1; i<=N-R; i++) {
				num2 = num2.multiply(BigInteger.valueOf(i));
			}
		
			for(int i=1; i<=R; i++) {
				num3 = num3.multiply(BigInteger.valueOf(i));
			}
		
			BigInteger ans = num1.divide(num2.multiply(num3));
			
			long n = 1234567891;
			
			System.out.println("#"+t+" "+(ans.remainder(BigInteger.valueOf(n))));
		}
	}
}
