import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger num1 = sc.nextBigInteger();
		BigInteger num2 = sc.nextBigInteger();
		
		String st1 = num1.toString();
		String st2 = num2.toString();
		
		BigInteger a = new BigInteger(st1,2);
		BigInteger b = new BigInteger(st2,2);
		
		BigInteger sum = a.add(b);
		
		String result = sum.toString(2);
		System.out.println(result);
	}
}
