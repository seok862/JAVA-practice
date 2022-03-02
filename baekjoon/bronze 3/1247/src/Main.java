import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<3; i++) {
			int N = sc.nextInt();
			BigInteger zero = new BigInteger("0");
			BigInteger sum = zero;
			BigInteger[] arr = new BigInteger[N];
			for(int j = 0; j<N; j++) {
				arr[j] = sc.nextBigInteger();
				sum = sum.add(arr[j]);
			}
			if(sum.compareTo(zero)==0) {
				System.out.println(0);
			} else if (sum.compareTo(zero)==1) {
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}
	}
}
