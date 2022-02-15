import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		BigInteger b = new BigInteger(N,2);
		
		BigInteger c = new BigInteger("17");
		
		BigInteger d = b.multiply(c);
		
		String e = d.toString(2);
		
		System.out.println(e);
	
	}
}
