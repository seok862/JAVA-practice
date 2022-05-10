import java.util.Scanner;
import java.math.BigInteger;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger num1 = new BigInteger("0");
		BigInteger num2 = new BigInteger("1");
		
		BigInteger num3 = num1.add(num2);
	
		
		int N = sc.nextInt();
		
		for(int i=3; i<=N; i++) {
			num1 = num2;
			num2 = num3;
			
			num3 = num1.add(num2);
			
		}
		if(N == 0)	System.out.println(0);
		else  System.out.println(num3);
	}
}